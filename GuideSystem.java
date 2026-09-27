import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GuideSystem {

    private List<City> cities;
    private Scanner    scanner;

    public GuideSystem() {
        cities  = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadCities();
    }


    private void loadCities() {


        City lahore = new City("Lahore", "Punjab",
                "The cultural heart of Pakistan — Mughal monuments, food street, and vibrant bazaars.", 1200);

        lahore.addTouristSpot(new Location("Badshahi Mosque",   "Tourist Spot",
                "One of the world's largest mosques, built 1671 by Emperor Aurangzeb.",
                "Religious",     2.1));
        lahore.addTouristSpot(new Location("Lahore Fort",       "Tourist Spot",
                "UNESCO World Heritage Site, 1,000 years of Mughal, Sikh & British layers.",
                "Historical",    1.8));
        lahore.addTouristSpot(new Location("Walled City",       "Tourist Spot",
                "Ancient walled city with 13 historic gates, havelis, and Heera Mandi.",
                "Cultural",      1.5));
        lahore.addTouristSpot(new Location("Minar-e-Pakistan",  "Tourist Spot",
                "Tower where Pakistan Resolution was passed in 1940.",
                "Historical",    3.0));
        lahore.addTouristSpot(new Location("Shalimar Gardens",  "Tourist Spot",
                "UNESCO-listed Mughal gardens in three terraces, built by Shah Jahan.",
                "Architecture",  6.5));
        lahore.addTouristSpot(new Location("Lahore Museum",     "Tourist Spot",
                "South Asia's richest museum — Gandhara sculptures to Mughal miniatures.",
                "Museum",        2.0));
        lahore.addTouristSpot(new Location("Anarkali Bazaar",   "Tourist Spot",
                "Oldest surviving market in South Asia — fabrics, jewellery, spices.",
                "Shopping",      2.3));
        lahore.addTouristSpot(new Location("Wagah Border",      "Tourist Spot",
                "Dramatic flag-lowering ceremony at Pakistan–India border, 30 km from city.",
                "Entertainment", 29.0));

        lahore.addRestaurant(new Restaurant("Cafe Aylanto",          "Fine dining, Pakistani & continental fusion.",        8.0, "Continental",  2500, Restaurant.LUXURY));
        lahore.addRestaurant(new Restaurant("Salt'n Pepper Village", "Upscale outdoor buffet, extensive menu.",             9.5, "Pakistani",    2000, Restaurant.LUXURY));
        lahore.addRestaurant(new Restaurant("Zheng He",              "Elegant Chinese fine dining in Gulberg.",              7.5, "Chinese",      2200, Restaurant.LUXURY));
        lahore.addRestaurant(new Restaurant("Cosa Nostra",           "Upscale Italian in a romantic garden setting.",        9.0, "Italian",      2400, Restaurant.LUXURY));
        lahore.addRestaurant(new Restaurant("Butt Karahi",           "Legendary roadside karahi since 1960.",               3.5, "Pakistani",     800, Restaurant.NORMAL));
        lahore.addRestaurant(new Restaurant("Waheed's Nihari",       "Iconic Lahori nihari & paye, open since 1954.",       2.0, "Lahori",        500, Restaurant.NORMAL));
        lahore.addRestaurant(new Restaurant("Andaaz Restaurant",     "Popular Lahori desi food, great daal and saalan.",    4.5, "Pakistani",     750, Restaurant.NORMAL));
        lahore.addRestaurant(new Restaurant("Lakshmi Chowk Dhabas", "Iconic late-night food alley, paye and nihari.",      2.2, "Pakistani",     600, Restaurant.NORMAL));

        lahore.addHotel(new Hotel("Pearl Continental Lahore", "5-star luxury; rooftop pool, city views.",              5.0, 5, 18000, Hotel.LUXURY));
        lahore.addHotel(new Hotel("Avari Hotel Lahore",       "4-star; central location, renowned buffet.",            4.5, 4, 12000, Hotel.LUXURY));
        lahore.addHotel(new Hotel("Hotel One Gulberg",        "3-star; clean, well-located, great value.",             7.0, 3,  5000, Hotel.NORMAL));
        lahore.addHotel(new Hotel("Faletti's Hotel",          "Historic 3-star colonial property, tons of character.", 2.0, 3,  6000, Hotel.NORMAL));
        lahore.addHotel(new Hotel("City Guest House",         "Budget guesthouse, near old city, basic amenities.",    1.5, 2,  2500, Hotel.BUDGET));

        cities.add(lahore);

        City karachi = new City("Karachi", "Sindh",
                "Pakistan's largest city and economic hub — beaches, food, and colonial heritage.", 1500);

        karachi.addTouristSpot(new Location("Clifton Beach",           "Tourist Spot",
                "Popular Arabian Sea beach, camel rides and evening stalls.", "Beach",          4.0));
        karachi.addTouristSpot(new Location("Quaid-e-Azam's Tomb",    "Tourist Spot",
                "Elegant mausoleum of Pakistan's founder, gleaming white marble.", "Historical", 2.0));
        karachi.addTouristSpot(new Location("Frere Hall",              "Tourist Spot",
                "Victorian Gothic hall with murals by Sadequain, in lush gardens.", "Architecture", 3.5));
        karachi.addTouristSpot(new Location("Mohatta Palace",          "Tourist Spot",
                "Stunning pre-partition palace turned art museum.", "Museum",                    5.5));
        karachi.addTouristSpot(new Location("Port Grand",              "Tourist Spot",
                "Waterfront leisure and food complex by the old harbour.", "Entertainment",      6.0));
        karachi.addTouristSpot(new Location("Pakistan Maritime Museum","Tourist Spot",
                "Naval history museum with a real submarine you can walk through.", "Museum",    5.0));
        karachi.addTouristSpot(new Location("Empress Market",          "Tourist Spot",
                "Victorian-era market selling everything from spices to birds.", "Shopping",     2.5));
        karachi.addTouristSpot(new Location("French Beach",            "Tourist Spot",
                "Pristine rocky cove 30 km from city, great for swimming.", "Beach",            30.0));

        karachi.addRestaurant(new Restaurant("Kolachi",           "Iconic seafood on the sea, must-visit for visitors.",  6.5, "Seafood",     2200, Restaurant.LUXURY));
        karachi.addRestaurant(new Restaurant("Okra",              "Upscale Pakistani cuisine, contemporary setting.",     8.0, "Pakistani",   2800, Restaurant.LUXURY));
        karachi.addRestaurant(new Restaurant("The Pantry",        "Chic fine-dining cafe, European menu.",                9.0, "Continental", 2600, Restaurant.LUXURY));
        karachi.addRestaurant(new Restaurant("Xander's",          "Upscale steakhouse and grill, elegant décor.",         8.5, "Continental", 2500, Restaurant.LUXURY));
        karachi.addRestaurant(new Restaurant("BBQ Tonight",       "Huge outdoor BBQ restaurant, extremely popular.",      7.0, "BBQ",         1800, Restaurant.NORMAL));
        karachi.addRestaurant(new Restaurant("Cafe Flo",          "All-day brunch, pastas, and Continental classics.",   10.0, "Continental", 1500, Restaurant.NORMAL));
        karachi.addRestaurant(new Restaurant("Zahid Nihari",      "Legendary nihari and naan, a Karachi breakfast icon.", 4.0, "Pakistani",    600, Restaurant.NORMAL));
        karachi.addRestaurant(new Restaurant("Student Biryani",   "Famous budget biryani, a Karachi institution.",        3.0, "Pakistani",    700, Restaurant.NORMAL));

        karachi.addHotel(new Hotel("Marriott Karachi",          "5-star icon, excellent service, city-centre.",          2.5, 5, 22000, Hotel.LUXURY));
        karachi.addHotel(new Hotel("Pearl Continental Karachi", "5-star flagship, panoramic views.",                     3.0, 5, 20000, Hotel.LUXURY));
        karachi.addHotel(new Hotel("Ramada by Wyndham",         "4-star; comfortable rooms near business district.",     6.0, 4,  9000, Hotel.NORMAL));
        karachi.addHotel(new Hotel("Hotel Mehran",              "3-star; long-standing reliable mid-range option.",      4.0, 3,  6000, Hotel.NORMAL));
        karachi.addHotel(new Hotel("Kings Inn Hotel",           "Budget hotel near Saddar, clean and affordable.",       2.0, 2,  2800, Hotel.BUDGET));

        cities.add(karachi);

        City islamabad = new City("Islamabad", "Federal Capital Territory",
                "Pakistan's planned capital — clean, green, and surrounded by the Margalla Hills.", 1000);

        islamabad.addTouristSpot(new Location("Faisal Mosque",          "Tourist Spot",
                "Largest mosque in Pakistan, iconic tent-shaped design.", "Religious",           3.0));
        islamabad.addTouristSpot(new Location("Pakistan Monument",      "Tourist Spot",
                "Star-shaped monument representing the four provinces.", "Architecture",         5.0));
        islamabad.addTouristSpot(new Location("Daman-e-Koh",            "Tourist Spot",
                "Hilltop viewpoint with panoramic view of Islamabad.", "Nature",                9.0));
        islamabad.addTouristSpot(new Location("Margalla Hills Trail 3", "Tourist Spot",
                "Most popular hiking trail through forested Margalla Hills.", "Adventure",       8.5));
        islamabad.addTouristSpot(new Location("Lok Virsa Museum",       "Tourist Spot",
                "Rich collection of Pakistan's folk heritage and crafts.", "Museum",             5.5));
        islamabad.addTouristSpot(new Location("Shakarparian Park",      "Tourist Spot",
                "Hilltop park with mini Pakistan exhibit and rose garden.", "Nature",            4.5));
        islamabad.addTouristSpot(new Location("Centaurus Mall",         "Tourist Spot",
                "Premium shopping mall with international brands & cinema.", "Shopping",         3.0));
        islamabad.addTouristSpot(new Location("Rawal Lake",             "Tourist Spot",
                "Scenic reservoir, boating, and walking track.", "Nature",                       8.0));

        islamabad.addRestaurant(new Restaurant("Monal Restaurant",    "Hilltop fine dining, best views in Islamabad.",    9.0, "Pakistani",   2000, Restaurant.LUXURY));
        islamabad.addRestaurant(new Restaurant("Tuscany Courtyard",   "Upscale Italian & continental in a garden setting.",7.0,"Continental", 2800, Restaurant.LUXURY));
        islamabad.addRestaurant(new Restaurant("Chaaye Khana",        "Elegant heritage café, Pakistani teas and snacks.",  6.0, "Café",        1800, Restaurant.LUXURY));
        islamabad.addRestaurant(new Restaurant("Wildfire",            "Premium steaks and grills in a stylish setting.",   7.5, "Continental", 2500, Restaurant.LUXURY));
        islamabad.addRestaurant(new Restaurant("Savour Foods",        "Famous for sajji-rice, a local institution.",       4.0, "Pakistani",    700, Restaurant.NORMAL));
        islamabad.addRestaurant(new Restaurant("Pappasallis",         "Popular thin-crust pizza in F-7 Markaz.",           6.0, "Italian",     1200, Restaurant.NORMAL));
        islamabad.addRestaurant(new Restaurant("Naan & Kabab",        "Cosy F-10 spot, great desi lunch and dinner.",      5.5, "Pakistani",    850, Restaurant.NORMAL));
        islamabad.addRestaurant(new Restaurant("Melody Food Park",    "Outdoor food-stalls, varied menu, family friendly.", 5.0, "Pakistani",   900, Restaurant.NORMAL));

        islamabad.addHotel(new Hotel("Serena Hotel Islamabad", "Flagship 5-star, impeccable Pakistani hospitality.", 4.0, 5, 25000, Hotel.LUXURY));
        islamabad.addHotel(new Hotel("Islamabad Marriott",     "5-star with large convention facilities.",           2.5, 5, 21000, Hotel.LUXURY));
        islamabad.addHotel(new Hotel("Hotel One Blue Area",    "3-star; modern, well-located in Blue Area.",         1.5, 3,  4500, Hotel.NORMAL));
        islamabad.addHotel(new Hotel("Envoy Continental",      "3-star near diplomatic enclave, reliable.",          3.0, 3,  5500, Hotel.NORMAL));
        islamabad.addHotel(new Hotel("Capital Guest House",    "Budget option, clean rooms near G-9 Markaz.",        5.0, 2,  2200, Hotel.BUDGET));

        cities.add(islamabad);

        City peshawar = new City("Peshawar", "Khyber Pakhtunkhwa",
                "One of Asia's oldest cities — Gandhara history, Qissa Khwani, and Pashtun culture.", 900);

        peshawar.addTouristSpot(new Location("Qissa Khwani Bazaar",        "Tourist Spot",
                "The ancient 'Street of Storytellers', still alive with chai and chatter.", "Cultural",    1.0));
        peshawar.addTouristSpot(new Location("Peshawar Museum",            "Tourist Spot",
                "World-class Gandhara Buddhist art, one of Asia's best museums.", "Museum",                1.5));
        peshawar.addTouristSpot(new Location("Bala Hisar Fort",            "Tourist Spot",
                "Commanding fort overlooking Peshawar, used since ancient times.", "Historical",           2.0));
        peshawar.addTouristSpot(new Location("Mahabat Khan Mosque",        "Tourist Spot",
                "Stunning 17th-century Mughal mosque inside the old city.", "Religious",                   1.2));
        peshawar.addTouristSpot(new Location("Sethi Mohalla",              "Tourist Spot",
                "Beautifully preserved havelis of 19th-century merchant families.", "Architecture",        1.3));
        peshawar.addTouristSpot(new Location("Khyber Pass Viewpoint",      "Tourist Spot",
                "Historic pass to Afghanistan — dramatic mountain scenery.", "Adventure",                  45.0));
        peshawar.addTouristSpot(new Location("Gor Khatri",                 "Tourist Spot",
                "Ancient caravanserai and excavation site with layers from Buddhist to Mughal eras.", "Historical", 1.0));
        peshawar.addTouristSpot(new Location("Cunningham Clock Tower",     "Tourist Spot",
                "Victorian clocktower built in 1900 at the heart of old Peshawar.", "Architecture",        0.8));
        peshawar.addTouristSpot(new Location("Sikh Gurdwara Bhai Joga Singh","Tourist Spot",
                "Historic Sikh shrine, an important pilgrimage site in the old city.", "Religious",        1.5));
        peshawar.addTouristSpot(new Location("Chowk Yadgar",               "Tourist Spot",
                "Central square with a monument commemorating those who sacrificed for Pakistan.", "Cultural", 0.5));
        peshawar.addTouristSpot(new Location("Smugglers' Bazaar (Karkhano)","Tourist Spot",
                "Legendary market near the Afghan border famous for electronics and imported goods.", "Shopping", 8.0));

        peshawar.addRestaurant(new Restaurant("Pearl Continental Rest.",  "Fine dining inside PC Peshawar.",                2.0, "Continental",  2000, Restaurant.LUXURY));
        peshawar.addRestaurant(new Restaurant("Shiraz Restaurant",        "Upscale Pashtun cuisine, elegant setting.",       3.5, "Pakistani",    1800, Restaurant.LUXURY));
        peshawar.addRestaurant(new Restaurant("Peshawar Club Dining",     "Colonial-era club restaurant, refined ambiance.", 2.5, "Continental",  2200, Restaurant.LUXURY));
        peshawar.addRestaurant(new Restaurant("Lahooti Darbar",           "Upscale traditional décor, Mughal-Pashtun menu.", 4.0, "Pakistani",    1900, Restaurant.LUXURY));
        peshawar.addRestaurant(new Restaurant("Charsi Tikka",             "The original copper-pot tikka — Peshawar's pride.",3.0,"Pashtun",       600, Restaurant.NORMAL));
        peshawar.addRestaurant(new Restaurant("Frontier Fort Restaurant", "Pashtun-themed restaurant, spit-roast dishes.",   5.0, "Pakistani",    1200, Restaurant.NORMAL));
        peshawar.addRestaurant(new Restaurant("Green's Hotel Rest.",      "Classic hotel restaurant, varied menu.",           1.5, "Pakistani",     900, Restaurant.NORMAL));
        peshawar.addRestaurant(new Restaurant("Namak Mandi Karahi",       "Famous chapli kebab and karahi on the food lane.", 2.5, "Pashtun",      700, Restaurant.NORMAL));

        // Hotels – Peshawar (6 total)
        peshawar.addHotel(new Hotel("Pearl Continental Peshawar",  "5-star, most secure & comfortable in KP.",              2.0, 5, 15000, Hotel.LUXURY));
        peshawar.addHotel(new Hotel("Shelton's Rezidor Peshawar",  "4-star; modern amenities, good business facilities.",   3.0, 4, 10000, Hotel.LUXURY));
        peshawar.addHotel(new Hotel("Greens Hotel",                "3-star institution, right in the city heart.",           1.5, 3,  4500, Hotel.NORMAL));
        peshawar.addHotel(new Hotel("Hotel Shalimar Peshawar",     "3-star; reliable, near University Road.",                2.5, 3,  4000, Hotel.NORMAL));
        peshawar.addHotel(new Hotel("Islamabad Inn Peshawar",      "Budget-friendly, clean rooms near University Rd.",       3.0, 2,  2000, Hotel.BUDGET));
        peshawar.addHotel(new Hotel("New City Hotel",              "Very affordable guesthouse near old city bazaars.",      1.2, 1,  1200, Hotel.BUDGET));

        cities.add(peshawar);

        City quetta = new City("Quetta", "Balochistan",
                "The 'Fruit Garden of Pakistan' — rugged mountains, ancient forts, and unique Balochi culture.", 800);

        quetta.addTouristSpot(new Location("Hanna Lake",                "Tourist Spot",
                "Picturesque artificial lake in a rocky mountain valley.", "Nature",               12.0));
        quetta.addTouristSpot(new Location("Quaid-e-Azam Residency",   "Tourist Spot",
                "Ziarat residency where Jinnah spent his final days.", "Historical",              130.0));
        quetta.addTouristSpot(new Location("Hazarganji Chiltan Park",   "Tourist Spot",
                "National park home to rare Chiltan ibex and juniper forests.", "Nature",          20.0));
        quetta.addTouristSpot(new Location("Balochistan Museum",        "Tourist Spot",
                "Artifacts spanning Balochistan's 5,000 years of civilization.", "Museum",          2.0));
        quetta.addTouristSpot(new Location("Urak Valley",               "Tourist Spot",
                "Scenic valley with orchards, streams, and cool air.", "Nature",                   25.0));
        quetta.addTouristSpot(new Location("Kandahari Bazaar",          "Tourist Spot",
                "Traditional market — Balochi embroidery, dry fruits, and carpets.", "Shopping",    2.5));
        quetta.addTouristSpot(new Location("Quetta Geological Museum",  "Tourist Spot",
                "Fascinating collection of rocks, fossils, and minerals unique to Balochistan.", "Museum", 3.0));
        quetta.addTouristSpot(new Location("Brewery Road & Bazaar",     "Tourist Spot",
                "Historic road lined with old British-era buildings and local traders.", "Architecture", 1.5));
        quetta.addTouristSpot(new Location("Kuchlak Grapes Garden",     "Tourist Spot",
                "Vast grape orchards 30 km from Quetta; stunning during harvest season.", "Nature",  30.0));
        quetta.addTouristSpot(new Location("Zarghoon Hills",            "Tourist Spot",
                "Mountain range rising above Quetta — great trekking and panoramic views.", "Adventure", 15.0));
        quetta.addTouristSpot(new Location("Pir Ghaib Waterfall",       "Tourist Spot",
                "Hidden natural waterfall and pool inside a cave in the Bolan hills.", "Nature",    80.0));

        quetta.addRestaurant(new Restaurant("Serena Hotel Restaurant",  "Best fine-dining in Quetta, varied menu.",          3.0, "Continental",  2200, Restaurant.LUXURY));
        quetta.addRestaurant(new Restaurant("Jan's Dine & Grill",       "Upscale grill house, popular with families.",       2.5, "Pakistani",    1800, Restaurant.LUXURY));
        quetta.addRestaurant(new Restaurant("Quetta Marriott Dining",   "Hotel fine-dining, Pakistani and continental.",     2.0, "Continental",  2000, Restaurant.LUXURY));
        quetta.addRestaurant(new Restaurant("Royal Balochi Kitchen",    "Elegant Balochi specialties, great for groups.",    3.5, "Balochi",      1700, Restaurant.LUXURY));
        quetta.addRestaurant(new Restaurant("Laal's Restaurant",        "Local favourite for Balochi sajji and karahi.",     4.0, "Balochi",       800, Restaurant.NORMAL));
        quetta.addRestaurant(new Restaurant("Quetta Saraab Restaurant", "Traditional Balochi dishes in local setting.",      2.5, "Balochi",       600, Restaurant.NORMAL));
        quetta.addRestaurant(new Restaurant("Hotel Bloom Star Rest.",   "Good value buffet, popular with local families.",   2.0, "Pakistani",     900, Restaurant.NORMAL));
        quetta.addRestaurant(new Restaurant("Alamgir Wadera Karahi",    "Famous late-night karahi spot on Jinnah Road.",     1.5, "Pakistani",     700, Restaurant.NORMAL));

        quetta.addHotel(new Hotel("Serena Hotel Quetta",    "Premier 5-star; safest and most comfortable.",          3.0, 5, 14000, Hotel.LUXURY));
        quetta.addHotel(new Hotel("Quetta Marriott Hotel",  "4-star; modern facilities, reliable service.",          2.0, 4, 10000, Hotel.LUXURY));
        quetta.addHotel(new Hotel("Bloom Star Hotel",       "3-star; central, reliable, good facilities.",           2.0, 3,  5500, Hotel.NORMAL));
        quetta.addHotel(new Hotel("Hotel Farooqi",          "3-star; well-maintained, near the bazaar.",             1.5, 3,  4500, Hotel.NORMAL));
        quetta.addHotel(new Hotel("Prince Hotel Quetta",    "Budget guesthouse, clean, near Jinnah Rd.",             1.5, 2,  2200, Hotel.BUDGET));
        quetta.addHotel(new Hotel("Al-Falah Guest House",   "Very affordable, basic amenities, city centre.",        1.0, 1,  1200, Hotel.BUDGET));

        cities.add(quetta);

        // ══════════════════════════════════════
        // 6.  M U L T A N
        // ══════════════════════════════════════
        City multan = new City("Multan", "Punjab",
                "City of Saints — Sufi shrines, blue-glazed pottery, and mango capital of Pakistan.", 700);

        multan.addTouristSpot(new Location("Shrine of Shah Rukn-e-Alam",   "Tourist Spot",
                "One of the most magnificent Sufi shrines in Asia, built 1320.", "Religious",     2.0));
        multan.addTouristSpot(new Location("Shrine of Bahauddin Zakariya", "Tourist Spot",
                "13th-century shrine of Multan's patron saint.", "Religious",                     2.5));
        multan.addTouristSpot(new Location("Multan Fort",                  "Tourist Spot",
                "Ancient fort with panoramic views of the old city.", "Historical",               1.8));
        multan.addTouristSpot(new Location("Multan Arts Council",          "Tourist Spot",
                "Hub for Multani blue-glazed pottery and traditional crafts.", "Cultural",        3.0));
        multan.addTouristSpot(new Location("Hussain Agahi Bazaar",         "Tourist Spot",
                "Bustling bazaar for camel-skin lamps, blue pottery, and embroidery.", "Shopping",2.0));
        multan.addTouristSpot(new Location("Clock Tower (Ghanta Ghar)",    "Tourist Spot",
                "Colonial-era clocktower, heart of old Multan.", "Architecture",                  1.5));
        multan.addTouristSpot(new Location("Shrine of Shah Shams Tabriz",  "Tourist Spot",
                "Ancient Sufi shrine of the revered saint associated with Rumi.", "Religious",    2.2));
        multan.addTouristSpot(new Location("Qasim Bagh Stadium",           "Tourist Spot",
                "Historic cricket and sports ground at the centre of the city.", "Entertainment", 1.0));
        multan.addTouristSpot(new Location("Multan Museum",                "Tourist Spot",
                "Showcases Multani history, blue pottery, and ancient Indus artefacts.", "Museum",2.5));
        multan.addTouristSpot(new Location("Eidgah Mosque",                "Tourist Spot",
                "Grand historic mosque known for its colourful tilework and tall minarets.", "Religious", 1.0));
        multan.addTouristSpot(new Location("Bohar Gate & Old City Walk",   "Tourist Spot",
                "Walking tour through Multan's old city gates and heritage lanes.", "Historical",  1.2));

        // Restaurants – Multan (7 total)
        multan.addRestaurant(new Restaurant("Chunara Restaurant",     "Top restaurant in Multan, varied Pakistani menu.",   5.0, "Pakistani",   1500, Restaurant.LUXURY));
        multan.addRestaurant(new Restaurant("Hotel One Restaurant",   "Upscale dining inside Hotel One, great ambiance.",   4.0, "Continental", 1800, Restaurant.LUXURY));
        multan.addRestaurant(new Restaurant("Sindbad Rooftop Dining", "Rooftop fine-dining with views of the old city.",    3.0, "Pakistani",   2000, Restaurant.LUXURY));
        multan.addRestaurant(new Restaurant("The Grand Multan",       "Elegant buffet restaurant, wide variety of dishes.", 4.5, "Continental", 1700, Restaurant.LUXURY));
        multan.addRestaurant(new Restaurant("Faisal Restaurant",      "Old-city favourite, great karahi and biryani.",      2.0, "Pakistani",    700, Restaurant.NORMAL));
        multan.addRestaurant(new Restaurant("Al-Madina Shinwari",     "Famous for Peshawari-style sajji and karahi.",       3.5, "Pakistani",    800, Restaurant.NORMAL));
        multan.addRestaurant(new Restaurant("Baba Ji Karahi",         "Late-night karahi staple, popular with locals.",     2.5, "Pakistani",    600, Restaurant.NORMAL));
        multan.addRestaurant(new Restaurant("Multani Sohan & Dine",   "Local flavours — sohan halwa, karahi, and chai.",    1.8, "Pakistani",    550, Restaurant.NORMAL));

        // Hotels – Multan (6 total)
        multan.addHotel(new Hotel("Sindbad Hotel Multan",   "4-star; spacious rooms, rooftop restaurant.",           3.0, 4,  8500, Hotel.LUXURY));
        multan.addHotel(new Hotel("Hotel One Multan",       "Best 3-star in Multan, modern and comfortable.",        4.0, 3,  6000, Hotel.LUXURY));
        multan.addHotel(new Hotel("Ramzan International",   "Decent mid-range hotel near Hussain Agahi.",            2.0, 3,  4000, Hotel.NORMAL));
        multan.addHotel(new Hotel("Holiday Inn Multan",     "Comfortable 3-star, reliable service, clean rooms.",    3.5, 3,  4500, Hotel.NORMAL));
        multan.addHotel(new Hotel("Al-Hamra Hotel",         "Budget option near old city, basic but clean.",         1.5, 2,  1800, Hotel.BUDGET));
        multan.addHotel(new Hotel("Pak Guest House",        "Very affordable guesthouse near the shrines.",          1.0, 1,  1000, Hotel.BUDGET));

        cities.add(multan);


        City faisalabad = new City("Faisalabad", "Punjab",
                "Pakistan's textile capital — the bustling Clock Tower bazaars are iconic.", 650);

        faisalabad.addTouristSpot(new Location("Clock Tower (Ghanta Ghar)",    "Tourist Spot",
                "British-era tower surrounded by 8 radiating bazaars.", "Architecture",           0.5));
        faisalabad.addTouristSpot(new Location("Lyallpur Heritage Museum",     "Tourist Spot",
                "Showcases the history of Faisalabad's founding and textile industry.", "Museum", 1.0));
        faisalabad.addTouristSpot(new Location("Jinnah Garden",                "Tourist Spot",
                "Large public garden with a lake and boating facility.", "Nature",                 3.0));
        faisalabad.addTouristSpot(new Location("Chenab Club",                  "Tourist Spot",
                "Colonial-era club with gardens and sports facilities.", "Cultural",               2.5));
        faisalabad.addTouristSpot(new Location("Kohinoor One Mall",            "Tourist Spot",
                "Premier shopping mall with entertainment zone.", "Shopping",                      5.0));
        faisalabad.addTouristSpot(new Location("Agriculture University Campus","Tourist Spot",
                "Beautiful colonial-era campus with lush grounds — a popular heritage walk.", "Architecture", 4.0));
        faisalabad.addTouristSpot(new Location("Gatwala Forest Park",          "Tourist Spot",
                "Large eco-park with a zoo, jogging tracks, and picnic lawns.", "Nature",          8.0));
        faisalabad.addTouristSpot(new Location("Gulberg Galleria",             "Tourist Spot",
                "Modern upscale shopping and dining hub in the Gulberg area.", "Shopping",         7.0));
        faisalabad.addTouristSpot(new Location("Nishat Linen Factory Outlet",  "Tourist Spot",
                "Flagship outlet of one of Pakistan's top textile brands.", "Shopping",            5.5));
        faisalabad.addTouristSpot(new Location("Sargodha Road Textile Mills",  "Tourist Spot",
                "Guided industrial tours of Pakistan's famous textile factories.", "Cultural",      6.0));

        // Restaurants – Faisalabad (7 total)
        faisalabad.addRestaurant(new Restaurant("Des Pardes",              "Upscale Pakistani restaurant, popular for events.", 6.0, "Pakistani",   1800, Restaurant.LUXURY));
        faisalabad.addRestaurant(new Restaurant("Rooftop Cafe Faisalabad", "Stylish rooftop dining with city views.",           7.0, "Continental", 2000, Restaurant.LUXURY));
        faisalabad.addRestaurant(new Restaurant("Chenab Club Dining",      "Prestigious club restaurant, colonial ambiance.",   3.5, "Continental", 2200, Restaurant.LUXURY));
        faisalabad.addRestaurant(new Restaurant("Best Western Dining",     "Hotel fine-dining, best formal meals in the city.", 4.0, "Pakistani",   1900, Restaurant.LUXURY));
        faisalabad.addRestaurant(new Restaurant("Tandoori Nights",         "Lively grill restaurant, great naans and BBQ.",     4.0, "BBQ",         1000, Restaurant.NORMAL));
        faisalabad.addRestaurant(new Restaurant("Lasani Shinwari",         "Well-known chain, great karahi and saji.",          5.0, "Pakistani",    900, Restaurant.NORMAL));
        faisalabad.addRestaurant(new Restaurant("Hardee's Faisalabad",     "Popular fast-food chain for families and students.",6.0, "Fast Food",    800, Restaurant.NORMAL));
        faisalabad.addRestaurant(new Restaurant("Ghanta Ghar Dhabas",      "Classic dhabas around the Clock Tower, all meals.",  0.5, "Pakistani",   650, Restaurant.NORMAL));

        // Hotels – Faisalabad (6 total)
        faisalabad.addHotel(new Hotel("Best Western Faisalabad", "4-star; best amenities in the city.",                4.0, 4,  9000, Hotel.LUXURY));
        faisalabad.addHotel(new Hotel("Chenab Club Hotel",       "4-star; colonial charm, quiet and prestigious.",     3.5, 4,  8000, Hotel.LUXURY));
        faisalabad.addHotel(new Hotel("Hotel One Faisalabad",    "3-star; reliable and central.",                      2.0, 3,  5000, Hotel.NORMAL));
        faisalabad.addHotel(new Hotel("Regency Plaza Hotel",     "3-star; comfortable rooms near Kohinoor area.",      3.0, 3,  4500, Hotel.NORMAL));
        faisalabad.addHotel(new Hotel("City Centre Hotel",       "Budget hotel near Clock Tower.",                     0.8, 2,  2000, Hotel.BUDGET));
        faisalabad.addHotel(new Hotel("Al-Noor Guest House",     "Very affordable, basic but clean, near bazaars.",    1.0, 1,  1100, Hotel.BUDGET));

        cities.add(faisalabad);

        // ══════════════════════════════════════
        // 8.  H Y D E R A B A D
        // ══════════════════════════════════════
        City hyderabad = new City("Hyderabad", "Sindh",
                "Ancient Sindhi city on the Indus — Talpur palaces, glass bangles, and Sindhi culture.", 600);

        hyderabad.addTouristSpot(new Location("Pakka Qila (Hyderabad Fort)",   "Tourist Spot",
                "18th-century Talpur Mir fort with underground passages.", "Historical",           1.0));
        hyderabad.addTouristSpot(new Location("Tombs of Talpur Mirs",         "Tourist Spot",
                "Elaborate tiled mausoleums of the Talpur rulers.", "Architecture",                2.0));
        hyderabad.addTouristSpot(new Location("Sindh Museum",                 "Tourist Spot",
                "Exhibits on Sindhi crafts, Indus Valley artefacts, and folk art.", "Museum",      1.5));
        hyderabad.addTouristSpot(new Location("Glass Bangles Market",         "Tourist Spot",
                "Hyderabad is famous for colourful glass bangles — vivid bazaar.", "Shopping",     1.8));
        hyderabad.addTouristSpot(new Location("Shahi Bazaar",                 "Tourist Spot",
                "Historic market for Sindhi embroidery, ajrak, and Rilli quilts.", "Shopping",    1.2));
        hyderabad.addTouristSpot(new Location("Rani Bagh (Victoria Gardens)", "Tourist Spot",
                "Heritage public garden established in the British era, tranquil and leafy.", "Nature", 2.0));
        hyderabad.addTouristSpot(new Location("Clock Tower Hyderabad",        "Tourist Spot",
                "Imposing colonial-era clock tower at the heart of the old city.", "Architecture", 0.8));
        hyderabad.addTouristSpot(new Location("Indus River Waterfront",       "Tourist Spot",
                "Scenic promenade along the great Indus River, especially beautiful at sunset.", "Nature", 1.5));
        hyderabad.addTouristSpot(new Location("Resham Gali Ajrak Market",     "Tourist Spot",
                "Dedicated lane for Sindh's iconic ajrak block-printed cloth — stunning colours.", "Cultural", 1.0));
        hyderabad.addTouristSpot(new Location("Hyderabad Zoo",                "Tourist Spot",
                "One of Sindh's oldest zoos, home to big cats, deer, and exotic birds.", "Entertainment", 3.0));

        // Restaurants – Hyderabad (7 total)
        hyderabad.addRestaurant(new Restaurant("Hotel Faran Restaurant",  "Upscale dining, best formal meals in the city.",     2.0, "Pakistani",  1400, Restaurant.LUXURY));
        hyderabad.addRestaurant(new Restaurant("Indus BBQ & Grill",       "Riverside grills and BBQ, great atmosphere.",        3.0, "BBQ",        1200, Restaurant.LUXURY));
        hyderabad.addRestaurant(new Restaurant("Hyderabad Regency Dining","Hotel fine-dining, contemporary Pakistani menu.",    1.5, "Pakistani",  1600, Restaurant.LUXURY));
        hyderabad.addRestaurant(new Restaurant("Al-Mubarak Grand Rest.",  "Elegant banquet-style dining, great for families.", 2.5, "Pakistani",  1500, Restaurant.LUXURY));
        hyderabad.addRestaurant(new Restaurant("Karachi Broast",          "Popular fast-food chain, reliable quality.",          3.0, "Fast Food",   600, Restaurant.NORMAL));
        hyderabad.addRestaurant(new Restaurant("Sindhi Biryani House",    "Authentic Sindhi biryani, a local must-eat.",         2.0, "Sindhi",      500, Restaurant.NORMAL));
        hyderabad.addRestaurant(new Restaurant("Autaq Restaurant",        "Mid-range Sindhi dishes in cosy setting.",            2.5, "Sindhi",      900, Restaurant.NORMAL));
        hyderabad.addRestaurant(new Restaurant("Pakka Qila Food Corner",  "Local eatery near the fort, karahi and naan.",       1.0, "Pakistani",   550, Restaurant.NORMAL));

        // Hotels – Hyderabad (6 total)
        hyderabad.addHotel(new Hotel("Hyderabad Regency",    "4-star; modern facilities, business-friendly.",           1.5, 4,  7500, Hotel.LUXURY));
        hyderabad.addHotel(new Hotel("Hotel Faran",          "Best mid-range hotel in Hyderabad.",                      2.0, 3,  4500, Hotel.LUXURY));
        hyderabad.addHotel(new Hotel("Hotel Indus",          "Reliable 3-star near the fort.",                          1.5, 3,  3500, Hotel.NORMAL));
        hyderabad.addHotel(new Hotel("Dreamland Hotel",      "3-star; centrally located, clean and comfortable.",       2.0, 3,  4000, Hotel.NORMAL));
        hyderabad.addHotel(new Hotel("New Pakistan Hotel",   "Budget option, central location.",                        1.0, 2,  1500, Hotel.BUDGET));
        hyderabad.addHotel(new Hotel("Sindhri Guest House",  "Basic but clean guesthouse near the fort area.",          0.8, 1,   900, Hotel.BUDGET));

        cities.add(hyderabad);

        // ══════════════════════════════════════
        // 9.  R A W A L P I N D I
        // ══════════════════════════════════════
        City rawalpindi = new City("Rawalpindi", "Punjab",
                "The twin city of Islamabad — historic bazaars, Army Museum, and Raja Bazaar.", 900);

        rawalpindi.addTouristSpot(new Location("Army Museum Rawalpindi",          "Tourist Spot",
                "Fascinating military history from ancient to modern Pakistan.", "Museum",          5.0));
        rawalpindi.addTouristSpot(new Location("Raja Bazaar",                    "Tourist Spot",
                "One of Pakistan's busiest markets — electronics, cloth, spices.", "Shopping",     1.0));
        rawalpindi.addTouristSpot(new Location("Ayub National Park",             "Tourist Spot",
                "Large park with a zoo, lakes, and boating.", "Nature",                            6.0));
        rawalpindi.addTouristSpot(new Location("Rawat Fort",                     "Tourist Spot",
                "16th-century Ghakhar fort, well preserved off the GT Road.", "Historical",       20.0));
        rawalpindi.addTouristSpot(new Location("Murree Hills (day trip)",        "Tourist Spot",
                "Hill station 65 km away — pine forests, Mall Road, and cool climate.", "Nature", 65.0));
        rawalpindi.addTouristSpot(new Location("Saddar Bazaar",                  "Tourist Spot",
                "Cantonment commercial area — restaurants, clothes, electronics.", "Shopping",     3.0));
        rawalpindi.addTouristSpot(new Location("Liaquat Bagh",                   "Tourist Spot",
                "Historic public garden where key events in Pakistan's political history unfolded.", "Historical", 2.0));
        rawalpindi.addTouristSpot(new Location("Taxila Museum (day trip)",       "Tourist Spot",
                "One of the greatest Gandhara archaeology museums in the world, 35 km away.", "Museum", 35.0));
        rawalpindi.addTouristSpot(new Location("Rawalpindi Cricket Stadium",     "Tourist Spot",
                "International cricket ground and one of Pakistan's premier sporting venues.", "Entertainment", 4.0));
        rawalpindi.addTouristSpot(new Location("Gurdwara Punja Sahib (day trip)","Tourist Spot",
                "One of Sikhism's holiest shrines in Hasan Abdal, 45 km from Rawalpindi.", "Religious", 45.0));
        rawalpindi.addTouristSpot(new Location("Khayaban-e-Sir Syed",            "Tourist Spot",
                "Tree-lined cantonment boulevard flanked by colonial bungalows.", "Architecture",  3.5));

        // Restaurants – Rawalpindi (7 total)
        rawalpindi.addRestaurant(new Restaurant("Nathiagali Restaurant",    "Fine dining, good Pakistani & Mughal cuisine.",   5.0, "Pakistani",   1600, Restaurant.LUXURY));
        rawalpindi.addRestaurant(new Restaurant("Tuscany Rawalpindi",       "Continental and Italian cuisine, upscale setting.",4.0,"Continental", 1900, Restaurant.LUXURY));
        rawalpindi.addRestaurant(new Restaurant("Shalimar Hotel Dining",    "Elegant hotel restaurant, great formal meals.",   2.5, "Pakistani",   2000, Restaurant.LUXURY));
        rawalpindi.addRestaurant(new Restaurant("Mei Kong Chinese",         "Upscale Chinese restaurant in Saddar.",           3.0, "Chinese",      1800, Restaurant.LUXURY));
        rawalpindi.addRestaurant(new Restaurant("Khyber Restaurant",        "Popular spot near Committee Chowk.",              2.0, "Pakistani",    900, Restaurant.NORMAL));
        rawalpindi.addRestaurant(new Restaurant("Savour Foods Rawalpindi",  "Great value sajji rice, large portions.",         3.5, "Pakistani",    700, Restaurant.NORMAL));
        rawalpindi.addRestaurant(new Restaurant("Lal Qila Restaurant",      "Mughal-themed décor, reliable Pakistani menu.",   3.0, "Pakistani",    850, Restaurant.NORMAL));
        rawalpindi.addRestaurant(new Restaurant("Pir Wadhai Dhabas",        "Famous for late-night nihari and parathas.",      4.0, "Pakistani",    650, Restaurant.NORMAL));

        // Hotels – Rawalpindi (6 total)
        rawalpindi.addHotel(new Hotel("Marriott Islamabad (nearby)",  "Shared with Islamabad, quick drive.",                3.0, 5, 21000, Hotel.LUXURY));
        rawalpindi.addHotel(new Hotel("Hotel Shalimar Rawalpindi",    "4-star; centrally located, well-regarded.",          2.5, 4,  8500, Hotel.LUXURY));
        rawalpindi.addHotel(new Hotel("Hotel One Saddar",             "3-star; clean, good location in Saddar.",            3.0, 3,  5000, Hotel.NORMAL));
        rawalpindi.addHotel(new Hotel("Comfort Inn Rawalpindi",       "3-star; near Murree Road, comfortable stay.",        2.0, 3,  4500, Hotel.NORMAL));
        rawalpindi.addHotel(new Hotel("Flash Hotel Rawalpindi",       "Budget-friendly, near Raja Bazaar.",                 1.0, 2,  2000, Hotel.BUDGET));
        rawalpindi.addHotel(new Hotel("Punjab Guest House",           "Very affordable, basic rooms, central location.",    1.5, 1,  1000, Hotel.BUDGET));

        cities.add(rawalpindi);

        // ══════════════════════════════════════
        // 10.  S U K K U R
        // ══════════════════════════════════════
        City sukkur = new City("Sukkur", "Sindh",
                "Ancient city on the Indus — the Lansdowne Bridge, Sadhu Bela, and gateway to Mohenjo-daro.", 500);

        sukkur.addTouristSpot(new Location("Sadhu Bela Temple",         "Tourist Spot",
                "Beautiful Hindu temple complex on an island in the Indus River.", "Religious",    2.0));
        sukkur.addTouristSpot(new Location("Lansdowne Bridge",          "Tourist Spot",
                "One of the longest rigid-girder bridges in the world (1889).", "Architecture",   1.5));
        sukkur.addTouristSpot(new Location("Sukkur Barrage",            "Tourist Spot",
                "Engineering marvel — one of the world's largest irrigation barrages.", "Architecture", 3.0));
        sukkur.addTouristSpot(new Location("Mohenjo-daro (day trip)",   "Tourist Spot",
                "UNESCO World Heritage site — 4,500-year-old Indus Valley city, 90 km away.", "Historical", 90.0));
        sukkur.addTouristSpot(new Location("Tomb of Mir Masum Shah",    "Tourist Spot",
                "16th-century minaret of 84 steps with views over the Indus.", "Historical",      1.0));
        sukkur.addTouristSpot(new Location("Kot Diji Fort",             "Tourist Spot",
                "Impressive 19th-century Talpur fort near an ancient Indus Valley site, 30 km away.", "Historical", 30.0));
        sukkur.addTouristSpot(new Location("Indus River Boat Cruise",   "Tourist Spot",
                "Scenic wooden-boat rides along the Indus at sunrise or sunset.", "Nature",        2.0));
        sukkur.addTouristSpot(new Location("Sukkur Clock Tower",        "Tourist Spot",
                "British-era clock tower standing at the centre of the old bazaar area.", "Architecture", 0.5));
        sukkur.addTouristSpot(new Location("Rohri Hills & Limestone Caves","Tourist Spot",
                "Ancient limestone hills across the Indus, dotted with old shrines and caves.", "Adventure", 3.0));
        sukkur.addTouristSpot(new Location("Arore Archaeological Site", "Tourist Spot",
                "Ruins of the ancient city of Alor, once a major Indus civilisation centre.", "Historical", 5.0));

        // Restaurants – Sukkur (6 total)
        sukkur.addRestaurant(new Restaurant("Indus Hotel Restaurant",   "Best formal dining in Sukkur.",                     2.0, "Pakistani",  1200, Restaurant.LUXURY));
        sukkur.addRestaurant(new Restaurant("Al-Mehran Restaurant",     "Upscale Sindhi cuisine, popular for family gatherings.", 1.5, "Sindhi",   1000, Restaurant.LUXURY));
        sukkur.addRestaurant(new Restaurant("Sukkur Inn Fine Dining",   "Hotel fine-dining, Pakistani and Sindhi specialties.",1.5, "Pakistani",  1400, Restaurant.LUXURY));
        sukkur.addRestaurant(new Restaurant("Indus Pearl Restaurant",   "Contemporary Sindhi cuisine, great river ambiance.", 2.5, "Sindhi",     1300, Restaurant.LUXURY));
        sukkur.addRestaurant(new Restaurant("Sindhi Daal Chawal",       "Authentic local Sindhi meals, rice and lentils.",    1.5, "Sindhi",      400, Restaurant.NORMAL));
        sukkur.addRestaurant(new Restaurant("Barrage View Restaurant",  "Mid-range spot with views of the Sukkur Barrage.",   2.5, "Pakistani",   700, Restaurant.NORMAL));
        sukkur.addRestaurant(new Restaurant("Barrage Road Diner",       "Casual dinner spot along the Indus waterfront.",     2.0, "Pakistani",   600, Restaurant.NORMAL));
        sukkur.addRestaurant(new Restaurant("Minara Chowk Kitchen",     "Local karahi and daal near Mir Masum Shah tomb.",    1.0, "Pakistani",   500, Restaurant.NORMAL));

        // Hotels – Sukkur (6 total)
        sukkur.addHotel(new Hotel("Indus Hotel Sukkur",    "Best hotel in the city, comfortable rooms.",               2.0, 3,  5000, Hotel.LUXURY));
        sukkur.addHotel(new Hotel("Hotel Sukkur Inn",      "3-star; modern amenities, central location.",              1.5, 3,  4500, Hotel.LUXURY));
        sukkur.addHotel(new Hotel("Hotel Mehran Sukkur",   "Mid-range, near the Barrage.",                             2.5, 2,  3000, Hotel.NORMAL));
        sukkur.addHotel(new Hotel("Al-Falah Hotel",        "Decent 2-star near the old city, reliable stay.",          1.5, 2,  2500, Hotel.NORMAL));
        sukkur.addHotel(new Hotel("City Rest House",       "Budget guesthouse, basic amenities.",                      1.0, 1,  1200, Hotel.BUDGET));
        sukkur.addHotel(new Hotel("Rohri Guest House",     "Very affordable, across the bridge in Rohri.",             3.0, 1,   800, Hotel.BUDGET));

        cities.add(sukkur);
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  MENU SYSTEM
    // ══════════════════════════════════════════════════════════════════════════

    public void run() {
        printWelcome();
        boolean running = true;
        while (running) {
            printMainMenu();
            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1 -> listCities();
                case 2 -> cityInfoMenu();
                case 3 -> tripPlannerMenu();
                case 4 -> ratingsMenu();
                case 5 -> { printGoodbye(); running = false; }
                default -> System.out.println("  [!] Invalid choice. Please enter 1–5.");
            }
        }
    }

    private void printWelcome() {
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║          PAKISTAN SMART TOUR GUIDE            ️          ║");
        System.out.println("║   10 Cities · Smart Planning & Budget Aware            ║");
        System.out.println("║   By: Maryam (25k-3051)  &  Laiba (25k-3025)           ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }

    private void printGoodbye() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("  Thank you for using Pakistan Smart Tour Guide!");
        System.out.println("  Safe travels! 🌟  خوش آمدید  |  سفر بخیر");
        System.out.println("╚════════════════════════════════════════════════╝\n");
    }

    private void printMainMenu() {
        System.out.println("\n┌─────────────── MAIN MENU ──────────────────────┐");
        System.out.println("│  1. 🏙️  View All Cities                          │");
        System.out.println("│  2. 🔍  Explore a City (spots/restaurants/hotels)│");
        System.out.println("│  3. 📅  Plan a Trip                              │");
        System.out.println("│  4. ⭐  Add Rating & Review                      │");
        System.out.println("│  5. 🚪  Exit                                     │");
        System.out.println("└──────────────────────────────────────────────────┘");
    }

    private void listCities() {
        System.out.println("\n── Available Cities ────────────────────────────────");
        for (int i = 0; i < cities.size(); i++) {
            City c = cities.get(i);
            System.out.printf("  [%2d]  %-18s  (%s)%n", i + 1, c.getName(), c.getProvince());
        }
    }

    private void cityInfoMenu() {
        City city = selectCity();
        if (city == null) return;
        boolean back = false;
        while (!back) {
            city.displayCityInfo();
            System.out.println("  1. Tourist Attractions");
            System.out.println("  2. Restaurants");
            System.out.println("  3. Hotels");
            System.out.println("  4. Back");
            int ch = readInt("  Choose: ");
            switch (ch) {
                case 1 -> city.displayTouristSpots();
                case 2 -> city.displayRestaurants();
                case 3 -> city.displayHotels();
                case 4 -> back = true;
                default -> System.out.println("  [!] Invalid option.");
            }
        }
    }

    private void tripPlannerMenu() {
        City city = selectCity();
        if (city == null) return;

        int days = readInt("\n  How many days is your trip? (1–30): ");
        if (days < 1 || days > 30) { System.out.println("  [!] Please enter between 1 and 30."); return; }


        int recommended = TripPlanner.recommendedDays(city);
        if (days > recommended) {
            System.out.println("\n  ⚠  Heads up! " + city.getName() + " has " +
                    city.getTouristSpots().size() + " major attraction(s), which can comfortably " +
                    "be explored in about " + recommended + " day(s).");
            System.out.println("     Staying for " + days + " day(s) means " +
                    (days - recommended) + " extra day(s) will be free exploration time —");
            System.out.println("     great for relaxing, revisiting favourites, or exploring local neighbourhoods.");
            System.out.println("\n  Would you like to continue with " + days + " day(s) anyway?");
            System.out.println("  1. Yes, keep " + days + " days");
            System.out.println("  2. No, reduce to the recommended " + recommended + " day(s)");
            int continueChoice = readInt("  Your choice (1 or 2): ");
            if (continueChoice == 2) {
                days = recommended;
                System.out.println("  ✔  Trip adjusted to " + days + " day(s).");
            } else {
                System.out.println("  ✔  Alright! Plan will include free exploration days for the extra time.");
            }
        }


        int people = readInt("  How many people are travelling? (1–50): ");
        if (people < 1 || people > 50) { System.out.println("  [!] Please enter between 1 and 50."); return; }

        System.out.println("\n  Choose trip style:");
        System.out.println("  1. 💎 LUXURY   (5-star hotels, fine dining, private transport)");
        System.out.println("  2. 🎒 NORMAL   (3-star hotels, local restaurants, public transport)");
        int styleChoice = readInt("  Your choice (1 or 2): ");
        String style = (styleChoice == 1) ? TripPlanner.LUXURY : TripPlanner.NORMAL;

        List<String> interests = selectInterests();

        System.out.println("\n  Do you have a total budget in mind? (0 = no limit)");
        double budget = readDouble("  Enter total budget in PKR (e.g. 50000): ");

        TripPlanner planner = new TripPlanner(city, days, people, style, interests, budget);
        planner.generatePlan();
    }

    private List<String> selectInterests() {
        String[] categories = {
            "Historical", "Nature", "Religious", "Adventure",
            "Shopping",   "Entertainment", "Beach", "Cultural",
            "Museum",     "Architecture"
        };
        System.out.println("\n  What type of places does your group enjoy?");
        System.out.println("  (Enter the numbers separated by commas, or 0 for ALL)");
        for (int i = 0; i < categories.length; i++) {
            System.out.printf("   %2d. %s%n", i + 1, categories[i]);
        }
        System.out.print("  Your choices: ");
        String line = scanner.nextLine().trim();

        List<String> selected = new ArrayList<>();
        if (line.equals("0") || line.isEmpty()) return selected;

        String[] parts = line.split(",");
        for (String part : parts) {
            try {
                int idx = Integer.parseInt(part.trim()) - 1;
                if (idx >= 0 && idx < categories.length) selected.add(categories[idx]);
            } catch (NumberFormatException ignored) {}
        }
        if (!selected.isEmpty())
            System.out.println("  ✔  Interests selected: " + String.join(", ", selected));
        return selected;
    }

    private void ratingsMenu() {
        City city = selectCity();
        if (city == null) return;

        System.out.println("\n  What would you like to review?");
        System.out.println("  1. Tourist Spot");
        System.out.println("  2. Restaurant");
        System.out.println("  3. Hotel");
        System.out.println("  4. View existing reviews");
        int typeChoice = readInt("  Choose: ");

        List<? extends Location> list;
        switch (typeChoice) {
            case 1 -> list = city.getTouristSpots();
            case 2 -> list = city.getRestaurants();
            case 3 -> list = city.getHotels();
            case 4 -> { showAllReviews(city); return; }
            default -> { System.out.println("  [!] Invalid."); return; }
        }

        if (list.isEmpty()) { System.out.println("  No locations available."); return; }

        System.out.println("\n  Select a location:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("  [%d] %-35s (avg: %.1f★)%n",
                    i + 1, list.get(i).getName(), list.get(i).getAverageRating());
        }
        int idx = readInt("  Enter number: ") - 1;
        if (idx < 0 || idx >= list.size()) { System.out.println("  [!] Invalid."); return; }

        Location chosen = list.get(idx);
        int rating = readInt("  Your rating (1–5): ");
        System.out.print("  Your review      : ");
        String review = scanner.nextLine().trim();
        if (review.isEmpty()) review = "No comment.";
        chosen.addRating(rating, review);
    }

    private void showAllReviews(City city) {
        List<Location> all = city.getTouristSpots();
        if (all.isEmpty()) { System.out.println("  No tourist spots."); return; }
        System.out.println("\n  Select tourist spot to view reviews:");
        for (int i = 0; i < all.size(); i++)
            System.out.println("  [" + (i + 1) + "] " + all.get(i).getName());
        int idx = readInt("  Enter number: ") - 1;
        if (idx < 0 || idx >= all.size()) { System.out.println("  [!] Invalid."); return; }
        all.get(idx).displayReviews();
    }

    private City selectCity() {
        listCities();
        int choice = readInt("  Select a city (1–" + cities.size() + "): ") - 1;
        if (choice < 0 || choice >= cities.size()) {
            System.out.println("  [!] Invalid city selection.");
            return null;
        }
        return cities.get(choice);
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Integer.parseInt(scanner.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("  [!] Please enter a valid number."); }
        }
    }

    private double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Double.parseDouble(scanner.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("  [!] Please enter a valid number."); }
        }
    }
}