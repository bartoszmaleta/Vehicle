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
    
    public void accelerate (int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else {
            if (newVelocity > 0 && newVelocity <= 10) {
                chagneGear(1);
            } else if (newVelocity > 10 && newVelocity <= 20) {
                chagneGear(2);
            } else if (newVelocity > 20 && newVelocity <= 30) {
                chagneGear(3);
            } else if (newVelocity > 30 && newVelocity <= 40) {
                chagneGear(4);
            } else if (newVelocity > 40 && newVelocity <= 50) {
                chagneGear(5);
            } else if (newVelocity > 50) {
                chagneGear(6);
            }
        }

        if (newVelocity > 0) {
            changedVelocity(newVelocity, getCurrentDirection());
        }
    }

    
    
}