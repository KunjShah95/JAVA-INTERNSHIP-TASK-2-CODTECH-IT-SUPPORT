
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean keepCalculating = true;

            System.out.println("Welcome to the Basic Calculator");
            System.out.println("You can perform addition, subtraction, multiplication, or division.");

            while (keepCalculating) {
                // Get two numbers from the user
                System.out.print("\nEnter the first number: ");
                double firstNumber = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double secondNumber = scanner.nextDouble();

                // Show the operation menu
                System.out.println("\nWhat would you like to do?");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.print("Choose an option (1-4): ");
                int operation = scanner.nextInt();

                // Perform the calculation
                double result = 0;
                boolean isValidOperation = true;

                switch (operation) {
                    case 1 -> {
                        // Addition
                        result = firstNumber + secondNumber;
                        System.out.println("\nYou chose: Addition");
                    }
                    case 2 -> {
                        // Subtraction
                        result = firstNumber - secondNumber;
                        System.out.println("\nYou chose: Subtraction");
                    }
                    case 3 -> {
                        // Multiplication
                        result = firstNumber * secondNumber;
                        System.out.println("\nYou chose: Multiplication");
                    }
                    case 4 -> {
                        // Division
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                            System.out.println("\nYou chose: Division");
                        } else {
                            System.out.println("\nError: Division by zero is not allowed.");
                            isValidOperation = false;
                        }
                    }
                    default -> {
                        // Invalid choice
                        System.out.println("\nInvalid choice. Please select a valid operation.");
                        isValidOperation = false;
                    }
                }

                // Display the result if the operation is valid
                if (isValidOperation) {
                    System.out.println("The result is: " + result);
                }

                // Ask if the user wants to continue
                System.out.print("\nDo you want to calculate again? (yes/no): ");
                String userResponse = scanner.next().toLowerCase();
                if (!userResponse.equals("yes")) {
                    keepCalculating = false;
                }
            }

            System.out.println("\nThank you for using the Basic Calculator! Goodbye");
        }
    }
}
