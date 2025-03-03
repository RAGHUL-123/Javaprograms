import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Welcome to the Enhanced Calculator!");
            System.out.print("Enter first number: ");
            double num1 = getValidNumber(scanner);

            System.out.print("Enter second number: ");
            double num2 = getValidNumber(scanner);

            System.out.println("Choose an operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exponentiation (^)");
            System.out.println("7. Exit");

            int choice = getValidChoice(scanner, 1, 7);
            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    break;
                case 6:
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                    break;
                case 7:
                    continueCalculating = false;
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    break;
            }

            System.out.println(); // Print a blank line for better readability
        }

        scanner.close();
    }

    private static double getValidNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    private static int getValidChoice(Scanner scanner, int min, int max) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.print("Invalid choice. Please select a number between " + min + " and " + max + ": ");
                }
            } else {
                System.out.print("Invalid input. Please enter a valid choice: ");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}