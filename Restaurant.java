
public class Restaurant extends Location {

    public static final String LUXURY = "LUXURY";
    public static final String NORMAL = "NORMAL";
    public static final String BUDGET = "BUDGET";

    private String cuisine;
    private double avgMealCost;
    private String tier;

    public Restaurant(String name, String description, double distanceFromCenter,
                      String cuisine, double avgMealCost, String tier) {
        super(name, "Restaurant", description, "Dining", distanceFromCenter);
        this.cuisine     = cuisine;
        this.avgMealCost = avgMealCost;
        this.tier        = tier;
    }

    @Override
    public void displayInfo() {
        System.out.println("  ┌──────────────────────────────────────────────");
        System.out.println("  │  Name        : " + getName());
        System.out.println("  │  Tier        : " + tier);
        System.out.println("  │  Cuisine     : " + cuisine);
        System.out.println("  │  Description : " + getDescription());
        System.out.printf ("  │  Distance    : %.1f km from city centre%n", getDistanceFromCenter());
        System.out.printf ("  │  Avg Meal    : PKR %,.0f / person%n", avgMealCost);
        System.out.printf ("  │  Rating      : %.1f / 5.0  (%d review%s)%n",
                getAverageRating(), getRatings().size(), getRatings().size() == 1 ? "" : "s");
        System.out.println("  └──────────────────────────────────────────────");
    }

    public String getCuisine()     { return cuisine; }
    public double getAvgMealCost() { return avgMealCost; }
    public String getTier()        { return tier; }
}
