abstract public class Transport {
    protected int vehicleNumber;
    protected double distanceTravelled;

    abstract double calculateFare();

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance Travelled: " + distanceTravelled);
        System.out.println("Fare: " + calculateFare());
    }
}
