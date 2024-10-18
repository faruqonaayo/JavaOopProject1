package faruq.projects;

public class Transit extends Vehicle{
    private String brand;
    private String color;
    private String transitName;

    //constructor
    public Transit(String brand, String color, String transitName, double maxSpeed, int numberOfTyres, double weight, String engineMaker, double engineWeight, String engineVersion, double engineHp) {
        super(maxSpeed, numberOfTyres, weight, engineMaker, engineWeight, engineVersion, engineHp);
        this.brand = brand;
        this.color = color;
        this.transitName = transitName;
    }

    //Getters and Setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransitName() {
        return transitName;
    }

    public void setTransitName(String transitName) {
        this.transitName = transitName;
    }

    // Motor Interface method implementation
    public void accelerate(){
        System.out.println("Increasing Transit speed");
    }

    public void decelerate(){
        System.out.println("Decreasing Transit speed");
    }

    @Override
    public String toString() {
        return "Transit{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", transitName='" + transitName + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", numberOfTyres=" + numberOfTyres +
                ", engine=" + engine +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
