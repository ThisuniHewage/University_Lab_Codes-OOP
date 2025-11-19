public class Bus extends Transport{

    public Bus() {}
    @Override
    double calculateFare() {
        return 10*distanceTravelled;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}
