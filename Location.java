import java.util.ArrayList;
import java.util.List;


public class Location {

    private String        name;
    private String        type;
    private String        description;
    private String        category;
    private double        distanceFromCenter;
    private List<Integer> ratings;
    private List<String>  reviews;

    public Location(String name, String type, String description,
                    String category, double distanceFromCenter) {
        this.name               = name;
        this.type               = type;
        this.description        = description;
        this.category           = category;
        this.distanceFromCenter = distanceFromCenter;
        this.ratings            = new ArrayList<>();
        this.reviews            = new ArrayList<>();
    }

    public void addRating(int rating, String review) {
        if (rating < 1 || rating > 5) {
            System.out.println("  [!] Rating must be between 1 and 5.");
            return;
        }
        ratings.add(rating);
        reviews.add(review);
        System.out.println("  ✔  Review saved!  New average: "
                + String.format("%.1f", getAverageRating()) + " / 5.0");
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.size();
    }

    public void displayInfo() {
        System.out.println("  ┌──────────────────────────────────────────────");
        System.out.println("  │  Name        : " + name);
        System.out.println("  │  Type        : " + type);
        System.out.println("  │  Category    : " + category);
        System.out.println("  │  Description : " + description);
        System.out.printf ("  │  Distance    : %.1f km from city centre%n", distanceFromCenter);
        System.out.printf ("  │  Rating      : %.1f / 5.0  (%d review%s)%n",
                getAverageRating(), ratings.size(), ratings.size() == 1 ? "" : "s");
        System.out.println("  └──────────────────────────────────────────────");
    }

    public void displayReviews() {
        if (reviews.isEmpty()) {
            System.out.println("  No reviews yet for " + name + ".");
            return;
        }
        System.out.println("  Reviews for: " + name);
        for (int i = 0; i < reviews.size(); i++) {
            System.out.println("  [" + (i + 1) + "] (" + ratings.get(i) + "★)  " + reviews.get(i));
        }
    }

    public String        getName()               { return name; }
    public String        getType()               { return type; }
    public String        getDescription()        { return description; }
    public String        getCategory()           { return category; }
    public double        getDistanceFromCenter() { return distanceFromCenter; }
    public List<Integer> getRatings()            { return ratings; }
}
