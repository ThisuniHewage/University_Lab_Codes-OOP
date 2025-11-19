public class test {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        bus.distanceTravelled=100;
        bus.vehicleNumber=1122;
        bus.displayDetails();

        taxi.distanceTravelled=91.2;
        taxi.vehicleNumber=6656;
        taxi.displayDetails();
    }
}
