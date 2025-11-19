public class Taxi extends Transport{

    public Taxi() {}
    @Override
    double calculateFare() {
        return (20*distanceTravelled) + 50;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}
