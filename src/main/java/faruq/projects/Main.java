package faruq.projects;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Transit transit1 = new Transit("Toyota", "Red", "Max Orange", 200.0, 8, 500, "BMW", 80.478, "2.2.0", 300.47);


        System.out.println(transit1.getTransitName());
        System.out.println(transit1.getMaxSpeed());
        System.out.println(transit1.getBrand());
        System.out.println(transit1.getEngine().getMaker());

        transit1.startEngine();
        transit1.revVehicle();
        transit1.accelerate();
        transit1.decelerate();
        transit1.stopEngine();

        // Data Structures
        Transit transit2 = new Transit("Nissan", "Red", "19", 250.0, 16, 700.298, "Rolls Royce", 120.478, "7.2.0", 400.47);


        ArrayList<Transit> calgaryTransit = new ArrayList<>();

        calgaryTransit.add(transit1);
        calgaryTransit.add(transit2);

        System.out.println(calgaryTransit);

        System.out.println(calgaryTransit.get(1).getTransitName());

    }
}