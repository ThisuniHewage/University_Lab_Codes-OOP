package Question01;
import java.util.Scanner;
class InvalidUserName extends Exception{
    InvalidUserName(String message){
        super(message);
    }
}


class InvalidPasswordLength extends Exception{
    InvalidPasswordLength(String message){
        super(message);
    }
}

 class DemoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username: ");
        String username = sc.nextLine();

        try{
            if(username.length() < 6){
                throw new InvalidUserName ("Username must be at least 6 characters long");
            }
        }
        catch(InvalidUserName e){
            System.out.println(e);
        }

        System.out.println("Enter a password: ");
        String password = sc.nextLine();


        try{
            if(password.length() < 8){
                throw new InvalidPasswordLength("Password must be at least 8 characters long.");
            }
        }

        catch (InvalidPasswordLength e){
            System.out.println(e);
        }
    }
}