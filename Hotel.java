

public class Hotel extends Location {

    public static final String LUXURY = "LUXURY";
    public static final String NORMAL = "NORMAL";
    public static final String BUDGET = "BUDGET";

    private int    starRating;
    private double pricePerNight;
    private String tier;

    public Hotel(String name, String description, double distanceFromCenter,
                 int starRating, double pricePerNight, String tier) {
        super(name, "Hotel", description, "Accommodation", distanceFromCenter);
        this.starRating    = starRating;
        this.pricePerNight = pricePerNight;
        this.tier          = tier;
    }

    @Override
    public void displayInfo() {
        System.out.println("  ┌──────────────────────────────────────────────");
        System.out.println("  │  Name        : " + getName());
        System.out.println("  │  Tier        : " + tier);
        System.out.println("  │  Stars       : " + "★".repeat(starRating));
        System.out.println("  │  Description : " + getDescription());
        System.out.printf ("  │  Distance    : %.1f km from city centre%n", getDistanceFromCenter());
        System.out.printf ("  │  Price/Night : PKR %,.0f  (per room)%n", pricePerNight);
        System.out.printf ("  │  Rating      : %.1f / 5.0  (%d review%s)%n",
                getAverageRating(), getRatings().size(), getRatings().size() == 1 ? "" : "s");
        System.out.println("  └──────────────────────────────────────────────");
    }

    public int    getStarRating()    { return starRating; }
    public double getPricePerNight() { return pricePerNight; }
    public String getTier()          { return tier; }
}
