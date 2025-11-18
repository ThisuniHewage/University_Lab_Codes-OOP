package Question04;
import java.util.Scanner;

class InvalidQuantityException extends Exception{
    InvalidQuantityException(String message){
        super(message);
    }
}

class InvalidPostalCodeException extends Exception{
    InvalidPostalCodeException(String message){
        super(message);
    }
}

class NonNumericPostalCodeException extends Exception{
    NonNumericPostalCodeException(String message){
        super(message);
    }
}


public class OrderProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();

            if(quantity < 1){
                throw new InvalidQuantityException("Quantity must be at least 1");
            }

            System.out.println("Enter the postal code: ");
            String postalCode = sc.next();

            try{
                int code = Integer.parseInt(postalCode);
            } catch (NumberFormatException e){
                throw new NonNumericPostalCodeException("Invalid input. Postal code must contain only digits.");
            }

            if(postalCode.length()!=5){
                throw new InvalidPostalCodeException("Postal code must be exactly 5 digits.");
            }

            System.out.println("Process done.");
        }
        catch (InvalidQuantityException | NonNumericPostalCodeException | InvalidPostalCodeException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
