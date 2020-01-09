package app;

public class Octavia extends Car {
    private int roadServiceMonths;

    // public Octavia(String name, String size, int wheels, int doors, int gears, boolean isManuel,
            // int roadServiceMonths) {
        // super(name, size, wheels, doors, gears, isManuel);
        // this.roadServiceMonths = roadServiceMonths;
    // }
    

    public Octavia(int roadServiceMonths) {
        super("Octavia", "hatchback", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

        
    
}