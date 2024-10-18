package faruq.projects;

public abstract class Vehicle implements Motor, Comparable<Vehicle>{
    // Data Members
    protected double maxSpeed;
    protected int numberOfTyres;
    protected double weight;
    protected Engine engine;

    //Constructor


    public Vehicle(double maxSpeed, int numberOfTyres, double weight, String engineMaker, double engineWeight, String engineVersion, double engineHp) {
        this.maxSpeed = maxSpeed;
        this.numberOfTyres = numberOfTyres;
        this.weight = weight;
        this.engine = new Engine(engineMaker,engineWeight,engineVersion,engineHp);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(String engineMaker, double engineWeight, String engineVersion, double engineHp) {
        this.engine = new Engine(engineMaker,engineWeight,engineVersion,engineHp);
    }

    public void revVehicle() {
        engine.rev();
    }

    // Interface method implementation
    public void startEngine(){
        engine.on();
    }

    public void stopEngine() {
        engine.off();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", numberOfTyres=" + numberOfTyres +
                ", weight=" + weight +
                ", engine=" + engine.toString() +
                '}';
    }

    // Internal Class
    protected class Engine {
        private String maker;
        private double weight;
        private String version;
        private double horsePower;

        // Engine Constructor
        public Engine(String maker, double weight, String version, double horsePower) {
            this.maker = maker;
            this.weight = weight;
            this.version = version;
            this.horsePower = horsePower;
        }

        //Getters and Setters
        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getMaker() {
            return maker;
        }

        public void setMaker(String maker) {
            this.maker = maker;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public double getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(double horsePower) {
            this.horsePower = horsePower;
        }



        // Methods of the engine
        public void on () {
            System.out.println("Starting Engine");
        }

        public void off () {
            System.out.println("Turning off Engine");
        }

        public void rev () {
            System.out.println("Voooooommmmmm!!!!!");
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "maker='" + maker + '\'' +
                    ", weight=" + weight +
                    ", version='" + version + '\'' +
                    ", horsePower=" + horsePower +
                    '}';
        }

    }
}
