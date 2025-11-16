package Question02;

// NumberPair clas
class NumberPair{
    private int num1;
    private int num2;

    public int getSum(){
        return num1 + num2;
    }

    public NumberPair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}


//Calculator class
class Calculator{
    public void displaySum(NumberPair pair){
        System.out.println("Sum of numbers: " + pair.getSum());
    }
}

// Class with the main method
public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        NumberPair pair = new NumberPair(5,10);
        calculator.displaySum(pair);
    }
}
