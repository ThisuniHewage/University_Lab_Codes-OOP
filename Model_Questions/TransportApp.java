class Vehicle{
    protected String brand;
    protected double speed;
    protected Engine engine;
    protected Driver driver;

    public Vehicle(String brand, double speed, String engineType, Driver driver) {
        this.brand = brand;
        this.speed = speed;
        this.engine = new Engine(engineType);
        this.driver = driver;
    }

    public void start()
    {
        System.out.println("Vehicle stats");
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Engine: " + engine);
        System.out.println("Driver: " + driver);
    }
}

class Bus extends Vehicle{

    public Bus(String brand, double speed, String engineType, Driver driver) {
        super(brand, speed, engineType, driver);
    }

    public void start()
    {
        System.out.println("Bus starts");
    }

    public void displayDetails()
    {
        super.displayDetails();
    }

}

class Truck extends Vehicle{

    public Truck(String brand, double speed, String engineType, Driver driver) {
        super(brand, speed, engineType, driver);
    }

    @Override
    public void start() {
        System.out.println("Truck stats");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}


class Engine{
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }
}

class Driver {
    private String name;
    private String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
}

public class TransportApp {
    public static void main(String[] args) {

        Driver busDriver = new Driver ("Nimal", "1123");
        Driver truckDriver = new Driver ("Amal", "1153");

        Bus b1 = new Bus ("TATA",100,"Diesel", busDriver);
        Truck t1 = new Truck("TATA",65,"Diesel", truckDriver);

        b1.start();
        t1.start();

        b1.displayDetails();
        t1.displayDetails();
    }
}
