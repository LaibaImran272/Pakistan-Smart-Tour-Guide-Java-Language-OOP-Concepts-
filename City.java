import java.util.ArrayList;
import java.util.List;

public class City {

    private String           name;
    private String           province;
    private String           description;
    private double           transportCostPerDay;
    private List<Location>   touristSpots;
    private List<Restaurant> restaurants;
    private List<Hotel>      hotels;

    public City(String name, String province, String description, double transportCostPerDay) {
        this.name                = name;
        this.province            = province;
        this.description         = description;
        this.transportCostPerDay = transportCostPerDay;
        this.touristSpots        = new ArrayList<>();
        this.restaurants         = new ArrayList<>();
        this.hotels              = new ArrayList<>();
    }

    public void addTouristSpot(Location l) { touristSpots.add(l); }
    public void addRestaurant(Restaurant r) { restaurants.add(r); }
    public void addHotel(Hotel h)           { hotels.add(h); }

    public void displayCityInfo() {
        System.out.printf("  CITY     : %s%n", name.toUpperCase());
        System.out.printf("  PROVINCE : %s%n", province);
        System.out.println("  " + description);
        System.out.println("  Tourist Spots : " + touristSpots.size());
        System.out.println("  Restaurants   : " + restaurants.size());
        System.out.println("  Hotels        : " + hotels.size());
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    public void displayTouristSpots() {
        System.out.println("\n── Tourist Attractions in " + name + " ──────────────────");
        if (touristSpots.isEmpty()) { System.out.println("  None listed."); return; }
        for (int i = 0; i < touristSpots.size(); i++) {
            System.out.println("\n  [" + (i + 1) + "]");
            touristSpots.get(i).displayInfo();
        }
    }

    public void displayRestaurants() {
        System.out.println("\n── Restaurants in " + name + " ──────────────────────────");
        if (restaurants.isEmpty()) { System.out.println("  None listed."); return; }
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println("\n  [" + (i + 1) + "]");
            restaurants.get(i).displayInfo();
        }
    }

    public void displayHotels() {
        System.out.println("\n── Hotels in " + name + " ─────────────────────────────────");
        if (hotels.isEmpty()) { System.out.println("  None listed."); return; }
        for (int i = 0; i < hotels.size(); i++) {
            System.out.println("\n  [" + (i + 1) + "]");
            hotels.get(i).displayInfo();
        }
    }

    public String           getName()                { return name; }
    public String           getProvince()            { return province; }
    public double           getTransportCostPerDay() { return transportCostPerDay; }
    public List<Location>   getTouristSpots()        { return touristSpots; }
    public List<Restaurant> getRestaurants()         { return restaurants; }
    public List<Hotel>      getHotels()              { return hotels; }
}
