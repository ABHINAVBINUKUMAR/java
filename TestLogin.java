import java.util.Scanner;

// User-defined exception class
class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

// Main class
public class TestLogin {

    // Method to authenticate user
    static void authenticate(String username, String password) 
            throws InvalidLoginException {

        String validUser = "admin";
        String validPass = "1234";

        if (!username.equals(validUser) || !password.equals(validPass)) {
            throw new InvalidLoginException("Invalid Username or Password!");
        } else {
            System.out.println("Login Successful!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                // Input fields
                System.out.print("Enter Username: ");
                String username = sc.nextLine();

                System.out.print("Enter Password: ");
                String password = sc.nextLine();

                // Try authentication
                authenticate(username, password);

                // If successful, break the loop
                break;

            } catch (InvalidLoginException e) {
                System.out.println("Exception: " + e.getMessage());
                System.out.println("Please try again...\n");
            }
        }

        sc.close();
    }
}