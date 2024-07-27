public class Exception {
    public static void main(String[] args) {
        int num = 10;
        int den = 0;
        int result;

        try {
            result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}