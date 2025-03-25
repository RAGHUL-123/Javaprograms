import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import java.util.Scanner;

public class StylishPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n==============================================");
        System.out.println("!!WELCOME TO THE EPIC PASSWORD GENERATOR !!");
        System.out.println("==============================================\n");

        System.out.println("🔹 [1] Weak (6 characters)");
        System.out.println("🔹 [2] Medium (12 characters)");
        System.out.println("🔹 [3] Strong (16+ characters)");
        System.out.println("🔹 [4] Ultra-Strong (24+ characters) ");
        System.out.print("\n💡 Select Password Strength (1/2/3/4): ");
        
        int choice = scanner.nextInt();
        int length = switch (choice) {
            case 1 -> 6;
            case 2 -> 12;
            case 3 -> 16;
            case 4 -> 24;  // Ultra-Strong
            default -> 12;
        };

        String password = generatePassword(length);
        
        System.out.println("\nYour Super Secure Password: ");
        System.out.println( ""+ password);
        System.out.println("\nPassword copied to clipboard! Paste it using Ctrl + V");

        copyToClipboard(password);
        
        System.out.println("\nPassword Strength Meter: " + getStrengthMessage(length));
        System.out.println("==============================================");

        scanner.close();
    }

    private static String generatePassword(int length) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_=+<>?/";

        String allChars = upperCase + lowerCase + numbers + symbols;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }
        return password.toString();
    }

    private static void copyToClipboard(String password) {
        StringSelection selection = new StringSelection(password);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    }

    private static String getStrengthMessage(int length) {
        if (length <= 6) return "Weak (Use a stronger one)";
        if (length <= 12) return "Medium (Decent, but could be better)";
        if (length <= 16) return "Strong (Good for most cases)";
        return "Ultra-Strong (Unhackable!)";
    }
}
