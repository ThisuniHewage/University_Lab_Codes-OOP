package Question03;
import java.util.Scanner;

class InvalidEmailException extends Exception{
    InvalidEmailException(String message){
        super(message);
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}


class NonNumericAgeException extends Exception{
    NonNumericAgeException(String message){
        super(message);
    }
}


public class CustomerRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = sc.nextLine();

        try{
            for(int i=0 ; i<email.length(); i++){
                char j = email.charAt(i);
                if (j!='@' || j!='.'){
                   throw new InvalidEmailException("Invalid email format. Email must contain '@' and '.'");
                }
            }
        }catch(InvalidEmailException e){
            System.out.println(e);
        }

        System.out.println("Enter your age: ");
        String ageInput = sc.nextLine();
        int age;
        try{
            age = Integer.parseInt(ageInput);throw new NonNumericAgeException("Invalid input. Age must be a numeric value.");
        }catch(NonNumericAgeException e){
            System.out.println(e.getMessage());
        }
        try{
        if (age<18 || age > 120){
            throw new InvalidAgeException("Age must be between 18 and 120.");
        }
        }catch(NonNumericAgeException | InvalidAgeException e){
        System.out.println(e.getMessage());
        }
        sc.close();
    }
}
