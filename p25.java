import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class p25 {
    public static void validateAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Age cannot be negative");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter an age (or 'q' to quit): ");
                String input = scanner.nextLine();
                
                if (input.equalsIgnoreCase("q")) {
                    break;
                }
                
                int age = Integer.parseInt(input);
                validateAge(age);
            } catch (CustomException e) {
                System.out.println("Caught CustomException: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
            }
            System.out.println();
        }
        
        scanner.close();
        System.out.println("Program terminated.");
        System.out.println("23DIT047");
    }
}