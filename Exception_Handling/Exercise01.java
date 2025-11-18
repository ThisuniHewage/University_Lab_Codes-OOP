import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int a = sc.nextInt();
        System.out.println("Enter the second integer");
        int b = sc.nextInt();

        try{
            int c = a%b;
            System.out.println("The result is: " + c);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println("Division by zero");
        }
    }
}
