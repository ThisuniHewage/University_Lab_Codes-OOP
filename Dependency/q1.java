package Question01;
//Fuel class - the independent class
class Fuel{
    private String type;

    public String getType() {
        return type;
    }

    public Fuel(String type) {
        this.type = type;
    }

    public void printType(){
        System.out.println(type);
    }
}


// Car class - the method drive depends on fuel class
class Car {
    public void drive(Fuel fuel){
        System.out.print("Car is driving with fuel: ");
        fuel.printType();
    }
}


// class that has main method
public class q1 {
    public static void main(String[] args) {
        Car car = new Car();
        Fuel fuel = new Fuel("Petrol");
        car.drive(fuel);
    }
}
