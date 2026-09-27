import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TripPlanner {


    public static final String LUXURY = "LUXURY";
    public static final String NORMAL = "NORMAL";

    private static final double LUXURY_TRANSPORT_MULT = 2.5;
    private static final double NORMAL_TRANSPORT_MULT = 1.0;
    private static final double BREAKFAST_NORMAL  = 300;
    private static final double BREAKFAST_LUXURY  = 900;

    private static final int SPOTS_PER_DAY = 3;


    private City         city;
    private int          numberOfDays;
    private int          numberOfPeople;
    private String       tripStyle;
    private List<String> interests;
    private double       userBudgetTotal;

    private double grandTotal = 0;


    public TripPlanner(City city, int numberOfDays, int numberOfPeople,
                       String tripStyle, List<String> interests, double userBudgetTotal) {
        this.city            = city;
        this.numberOfDays    = numberOfDays;
        this.numberOfPeople  = numberOfPeople;
        this.tripStyle       = tripStyle;
        this.interests       = interests;
        this.userBudgetTotal = userBudgetTotal;
        this.grandTotal      = 0;
    }

    public void generatePlan() {

        Hotel chosenHotel = pickHotel();


        List<Location> filteredSpots = filterAndSortSpots();


        List<Restaurant> filteredRestaurants = filterRestaurants();


        if (userBudgetTotal > 0) {
            double estimate = estimateTotalCost(chosenHotel, filteredRestaurants);
            if (estimate > userBudgetTotal && chosenHotel != null
                    && chosenHotel.getTier().equals(Hotel.LUXURY)) {
                System.out.println("\n  ⚠  Your budget is tight for a LUXURY hotel.");
                System.out.println("     Switching to a NORMAL-tier hotel to fit your budget...");
                Hotel normal = pickHotelByTier(Hotel.NORMAL);
                if (normal != null) chosenHotel = normal;
                estimate = estimateTotalCost(chosenHotel, filteredRestaurants);
                if (estimate > userBudgetTotal) {
                    System.out.println("  ⚠  Still over budget. Switching to BUDGET hotel...");
                    Hotel budget = pickHotelByTier(Hotel.BUDGET);
                    if (budget != null) chosenHotel = budget;
                }
            }
        }


        printHeader(chosenHotel);


        List<Restaurant[]> mealSchedule = buildMealSchedule(filteredRestaurants, numberOfDays);

        int spotIdx = 0;
        double runningTotal = 0;

        for (int day = 1; day <= numberOfDays; day++) {
            System.out.println("\n┌── DAY " + day + " ──────────────────────────────────────────");

            if (chosenHotel != null) {
                double hotelCostTonight = chosenHotel.getPricePerNight();
                System.out.printf("│  🏨  Stay     : %s  (%s★, PKR %,.0f/night/room)%n",
                        chosenHotel.getName(),
                        "★".repeat(chosenHotel.getStarRating()),
                        hotelCostTonight);
                runningTotal += hotelCostTonight;
            } else {
                System.out.println("│  🏨  Stay     : No hotel listed — arrange your own.");
                runningTotal += (tripStyle.equals(LUXURY) ? 8000 : 3000);
            }


            double bfCost = (tripStyle.equals(LUXURY) ? BREAKFAST_LUXURY : BREAKFAST_NORMAL) * numberOfPeople;
            System.out.printf("│  ☕  Breakfast : PKR %,.0f  (%d people)%n", bfCost, numberOfPeople);
            runningTotal += bfCost;


            System.out.println("│");
            System.out.println("│  📍  Places to Visit:");
            int spotsToday = 0;
            double prevDist = -1;


            boolean hasRemainingSpots = spotIdx < filteredSpots.size();

            if (hasRemainingSpots) {
                while (spotsToday < SPOTS_PER_DAY && spotIdx < filteredSpots.size()) {
                    Location s = filteredSpots.get(spotIdx);
                    if (prevDist >= 0 && Math.abs(s.getDistanceFromCenter() - prevDist) > 15 && spotsToday > 0) {
                        break;
                    }
                    System.out.printf("│      %d. %-35s [%s]  %.1f km%n",
                            spotsToday + 1, s.getName(), s.getCategory(), s.getDistanceFromCenter());
                    prevDist = s.getDistanceFromCenter();
                    spotIdx++;
                    spotsToday++;
                }
            }

            if (spotsToday == 0) {

                System.out.println("│      🌟 Free Exploration Day");
                System.out.println("│      All major attractions in " + city.getName() + " have already been covered.");
                System.out.println("│      You could revisit a favourite spot, explore local bazaars,");
                System.out.println("│      relax at your hotel, or take a day trip to the outskirts.");
            }


            System.out.println("│");
            System.out.println("│  🍽️  Dining:");
            double lunchCost = 0, dinnerCost = 0;
            Restaurant[] todayMeals = mealSchedule.get(day - 1);
            if (todayMeals != null && todayMeals[0] != null && todayMeals[1] != null) {
                Restaurant lunch  = todayMeals[0];
                Restaurant dinner = todayMeals[1];
                lunchCost  = lunch.getAvgMealCost()  * numberOfPeople;
                dinnerCost = dinner.getAvgMealCost() * numberOfPeople;
                System.out.printf("│      Lunch  → %-30s [%s, PKR %,.0f/person]%n",
                        lunch.getName(), lunch.getCuisine(), lunch.getAvgMealCost());
                System.out.printf("│      Dinner → %-30s [%s, PKR %,.0f/person]%n",
                        dinner.getName(), dinner.getCuisine(), dinner.getAvgMealCost());
                System.out.printf("│      Meals subtotal for %d people: PKR %,.0f%n",
                        numberOfPeople, lunchCost + dinnerCost);
            } else {
                double fallback = (tripStyle.equals(LUXURY) ? 3000 : 1000) * numberOfPeople;
                System.out.println("│      (No matching restaurants — estimated PKR " +
                        String.format("%,.0f", fallback) + ")");
                lunchCost  = fallback * 0.45;
                dinnerCost = fallback * 0.55;
            }
            runningTotal += lunchCost + dinnerCost;


            double transport = city.getTransportCostPerDay()
                    * (tripStyle.equals(LUXURY) ? LUXURY_TRANSPORT_MULT : NORMAL_TRANSPORT_MULT)
                    * numberOfPeople;
            System.out.println("│");
            System.out.printf("│  🚕  Transport : PKR %,.0f  (%s, %d people)%n",
                    transport,
                    tripStyle.equals(LUXURY) ? "private car/taxi" : "local transport/rickshaw",
                    numberOfPeople);
            runningTotal += transport;

            System.out.println("└────────────────────────────────────────────────");
        }

        grandTotal = runningTotal;
        displayBudgetSummary(chosenHotel, filteredRestaurants);
    }


    /**
     * Calculates how many days are actually needed to see all spots in the city.
     * Uses SPOTS_PER_DAY as the capacity per day.
     */
    public static int recommendedDays(City city) {
        int spotCount = city.getTouristSpots().size();
        if (spotCount == 0) return 1;
        // Each day covers up to SPOTS_PER_DAY attractions; round up
        return (int) Math.ceil((double) spotCount / SPOTS_PER_DAY);
    }


    private List<Restaurant[]> buildMealSchedule(List<Restaurant> restaurants, int days) {
        List<Restaurant[]> schedule = new ArrayList<>();

        if (restaurants.isEmpty()) {
            for (int d = 0; d < days; d++) schedule.add(new Restaurant[]{null, null});
            return schedule;
        }

        int n = restaurants.size();


        int lunchPtr  = 0;
        int dinnerPtr = 1;

        for (int day = 0; day < days; day++) {

            Restaurant lunch  = restaurants.get(lunchPtr  % n);
            Restaurant dinner = restaurants.get(dinnerPtr % n);


            int nudge = 0;
            while (n > 1 && dinner.getName().equals(lunch.getName()) && nudge < n) {
                dinnerPtr++;
                nudge++;
                dinner = restaurants.get(dinnerPtr % n);
            }

            schedule.add(new Restaurant[]{lunch, dinner});

            lunchPtr  += 1;
            dinnerPtr += 2;
        }

        return schedule;
    }



    private List<Location> filterAndSortSpots() {
        List<Location> all    = city.getTouristSpots();
        List<Location> result = new ArrayList<>();

        if (interests == null || interests.isEmpty()) {
            result.addAll(all);
        } else {
            for (Location loc : all) {
                for (String interest : interests) {
                    if (loc.getCategory().equalsIgnoreCase(interest)) {
                        result.add(loc);
                        break;
                    }
                }
            }
            if (result.isEmpty()) {
                System.out.println("\n  ⚠  No spots exactly match your interests — showing all available.");
                result.addAll(all);
            }
        }

        result.sort(Comparator.comparingDouble(Location::getDistanceFromCenter));
        return result;
    }


    private List<Restaurant> filterRestaurants() {
        List<Restaurant> all    = city.getRestaurants();
        List<Restaurant> result = new ArrayList<>();
        String targetTier       = tripStyle.equals(LUXURY) ? Restaurant.LUXURY : Restaurant.NORMAL;

        for (Restaurant r : all) {
            if (r.getTier().equals(targetTier)) result.add(r);
        }
        if (result.isEmpty()) result.addAll(all);
        return result;
    }

    private Hotel pickHotel() {
        String targetTier = tripStyle.equals(LUXURY) ? Hotel.LUXURY : Hotel.NORMAL;
        Hotel found = pickHotelByTier(targetTier);
        if (found == null) found = pickHotelByTier(Hotel.BUDGET);
        return found;
    }

    private Hotel pickHotelByTier(String tier) {
        for (Hotel h : city.getHotels()) {
            if (h.getTier().equals(tier)) return h;
        }
        return null;
    }


    private double estimateTotalCost(Hotel hotel, List<Restaurant> restaurants) {
        double hotelCost = (hotel != null ? hotel.getPricePerNight() : 5000) * numberOfDays;
        double mealAvg   = 0;
        if (!restaurants.isEmpty()) {
            for (Restaurant r : restaurants) mealAvg += r.getAvgMealCost();
            mealAvg /= restaurants.size();
        } else { mealAvg = 1000; }
        double foodCost  = mealAvg * 3 * numberOfDays * numberOfPeople;
        double transCost = city.getTransportCostPerDay()
                * (tripStyle.equals(LUXURY) ? LUXURY_TRANSPORT_MULT : NORMAL_TRANSPORT_MULT)
                * numberOfDays * numberOfPeople;
        return hotelCost + foodCost + transCost;
    }

    private void printHeader(Hotel hotel) {
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("   🗺  SMART TRIP PLAN  –  " + city.getName().toUpperCase());
        System.out.printf ("   Duration  : %d day(s)   |   People : %d%n", numberOfDays, numberOfPeople);
        System.out.printf ("   Style     : %s%n", tripStyle.equals(LUXURY) ? "💎 LUXURY" : "🎒 NORMAL / BUDGET");
        System.out.print  ("   Interests : ");
        if (interests == null || interests.isEmpty()) {
            System.out.println("All types");
        } else {
            System.out.println(String.join(", ", interests));
        }
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }


    private void displayBudgetSummary(Hotel hotel, List<Restaurant> restaurants) {
        double hotelTotal = (hotel != null ? hotel.getPricePerNight() : 5000) * numberOfDays;

        double mealAvg = 0;
        if (!restaurants.isEmpty()) {
            for (Restaurant r : restaurants) mealAvg += r.getAvgMealCost();
            mealAvg /= restaurants.size();
        } else { mealAvg = 1000; }
        double foodTotal      = mealAvg * 3 * numberOfDays * numberOfPeople;
        double breakfastTotal = (tripStyle.equals(LUXURY) ? BREAKFAST_LUXURY : BREAKFAST_NORMAL)
                * numberOfDays * numberOfPeople;
        double transTotal     = city.getTransportCostPerDay()
                * (tripStyle.equals(LUXURY) ? LUXURY_TRANSPORT_MULT : NORMAL_TRANSPORT_MULT)
                * numberOfDays * numberOfPeople;

        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("            💰  ESTIMATED BUDGET SUMMARY");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.printf ("  🏨  Accommodation  : PKR %,12.0f  (%d nights)%n",  hotelTotal, numberOfDays);
        System.out.printf ("  ☕  Breakfast       : PKR %,12.0f  (%d ppl × %d days)%n",
                breakfastTotal, numberOfPeople, numberOfDays);
        System.out.printf ("  🍽️  Lunch + Dinner  : PKR %,12.0f  (est.)%n",  foodTotal);
        System.out.printf ("  🚕  Transport       : PKR %,12.0f%n", transTotal);
        System.out.println("  ────────────────────────────────────────────────────");
        System.out.printf ("  📊  GRAND TOTAL     : PKR %,12.0f%n", grandTotal);
        System.out.printf ("  👤  Per Person       : PKR %,12.0f%n", grandTotal / numberOfPeople);
        System.out.printf ("  📅  Per Person/Day   : PKR %,12.0f%n", grandTotal / numberOfPeople / numberOfDays);

        if (userBudgetTotal > 0) {
            System.out.println("  ────────────────────────────────────────────────────");
            System.out.printf ("  🎯  Your Budget     : PKR %,12.0f%n", userBudgetTotal);
            double diff = userBudgetTotal - grandTotal;
            if (diff >= 0) {
                System.out.printf("  ✅  Under budget by : PKR %,12.0f  🎉%n", diff);
            } else {
                System.out.printf("  ❌  Over budget by  : PKR %,12.0f%n", Math.abs(diff));
                System.out.println("  💡  Tip: Reduce days or choose fewer spots to save cost.");
            }
        }
        System.out.println("╚══════════════════════════════════════════════════════╝");
        System.out.println("  * Estimates based on average market rates. Actual costs may vary.");
    }

    public double getGrandTotal() { return grandTotal; }
}