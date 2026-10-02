# Pakistan Smart Tour Guide

## Overview

**Pakistan Smart Tour Guide** is a Java-based console application designed to help users explore major cities across Pakistan and create personalized travel plans. The application provides information about tourist attractions, restaurants, hotels, ratings, and estimated travel costs.

Users can select a city, explore available locations, and generate a trip plan based on their interests, number of travelers, trip duration, travel style, and budget.

## Features

* Explore major cities across Pakistan
* View tourist attractions and their details
* Browse restaurants based on cuisine and price range
* Browse hotels based on category and price range
* View ratings and reviews for locations
* Add new ratings and reviews
* Create personalized travel plans
* Select travel interests such as historical, cultural, food, nature, and shopping
* Choose between normal and luxury travel styles
* Estimate accommodation, meals, and transportation costs
* Calculate total trip cost, cost per person, and daily cost per person
* Adjust hotel selection when the estimated trip exceeds the available budget
* Generate a day-by-day itinerary

## Cities Included

The application currently contains information for:

* Lahore
* Karachi
* Islamabad
* Peshawar
* Quetta
* Multan
* Faisalabad
* Hyderabad
* Rawalpindi
* Sukkur

## Object-Oriented Programming Concepts

The project demonstrates several core Java OOP concepts:

* **Classes and Objects** — Used to represent cities, locations, hotels, restaurants, and trip plans.
* **Encapsulation** — Data members are kept private and accessed through methods.
* **Inheritance** — `Hotel` and `Restaurant` inherit common properties and behavior from the `Location` class.
* **Polymorphism** — Base-class references and collections are used to work with different types of locations.
* **Method Overriding** — Specialized classes override methods such as `displayInfo()` to provide their own information.
* **Constructors** — Used to initialize objects with the required information.

## Technologies Used

* **Java**
* **Java Collections Framework**
* **ArrayList / List**
* **Scanner**
* Object-Oriented Programming

## How It Works

1. The user starts the application through `Main.java`.
2. The guide system loads information about the available cities and locations.
3. The user can browse cities and explore their attractions, restaurants, and hotels.
4. The user can create a trip by entering preferences such as:

   * Number of days
   * Number of travelers
   * Travel style
   * Interests
   * Total budget
5. The `TripPlanner` processes these preferences and generates a suitable itinerary.
6. The application calculates estimated travel expenses and displays the final trip plan.

## Running the Project

### Prerequisites

* Java Development Kit (JDK)
* Any Java-compatible IDE such as IntelliJ IDEA, Eclipse, or NetBeans

### Steps

1. Clone or download the repository.
2. Open the project in your preferred Java IDE.
3. Make sure all `.java` files are included in the same project.
4. Compile the source files.
5. Run `Main.java`.
6. Follow the instructions displayed in the console.

## Future Improvements

Possible future enhancements include:

* Connecting the application to a database
* Adding real-time hotel and restaurant information
* Integrating maps and location services
* Adding a graphical user interface
* Expanding the list of cities and tourist destinations
* Adding user accounts and saved trip plans
* Improving the recommendation system

