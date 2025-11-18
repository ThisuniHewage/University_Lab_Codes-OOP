package Question02;
import java.util.Scanner;
class NegativePriceException extends Exception {
    NegativePriceException(String message) {
        super(message);
    }
}

class PriceOutOfRangeException extends Exception {
    PriceOutOfRangeException(String message) {
        super(message);
    }
}

class PriceNotNumericException extends Exception {
    PriceNotNumericException(String message) {
        super(message);
    }
}

public class InventoryProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item pricing: ");
        int price = sc.nextInt();

        try{
            if(price < 0){
                throw new NegativePriceException("Price cannot be negative. Please enter a valid\n" +
                        "amount");
            }
            else if(price<1 || price>1000){
                throw new PriceOutOfRangeException("Price out of range.\n" +
                        "Please enter a value between $1 and $10,000");
            }

            else if (Integer.parseInt(price)){
                throw new PriceNotNumericException("Invalid input. Please enter a numeric\n" +
                        "value for the price");
            }
        }
        catch(NegativePriceException | PriceOutOfRangeException | PriceNotNumericException e)
        {
            System.out.println(e);
        }
    }
}
