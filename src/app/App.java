package app;

public class App {
    public static void main(String[] args) throws Exception {

        Octavia octavia = new Octavia(24);

        System.out.println("--------------");


        System.out.println("--------------");

        octavia.steer(45);

        System.out.println("--------------");

        octavia.accelerate(30);
        
        System.out.println("--------------");

        octavia.accelerate(15);

        System.out.println("--------------");

        octavia.accelerate(15);

        System.out.println("--------------");

        octavia.accelerate(-32);

        System.out.println("--------------");

    }
}