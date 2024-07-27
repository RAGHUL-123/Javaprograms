import java.sql.*;
import java.util.Scanner;

public class QuizManagementSystem {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/QuizSystem";
    private static final String USER = "root";
    private static final String PASSWORD = "3278";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nQuiz Management System");
            System.out.println("1. Add Quiz");
            System.out.println("2. View Quizzes");
            System.out.println("3. Update Quiz");
            System.out.println("4. Delete Quiz");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addQuiz(scanner);
                    break;
                case 2:
                    viewQuizzes();
                    break;
                case 3:
                    updateQuiz(scanner);
                    break;
                case 4:
                    deleteQuiz(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to add a quiz
    private static void addQuiz(Scanner scanner) {
        System.out.print("Enter Quiz Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Quiz Description: ");
        String description = scanner.nextLine();

        String sql = "INSERT INTO quizzes (title, description) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, description);
            pstmt.executeUpdate();
            System.out.println("Quiz added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to add quiz!");
        }
    }

    // Method to view all quizzes
    private static void viewQuizzes() {
        String sql = "SELECT * FROM quizzes";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                System.out.println("ID: " + id + ", Title: " + title + ", Description: " + description);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to retrieve quizzes!");
        }
    }

    // Method to update a quiz
    private static void updateQuiz(Scanner scanner) {
        System.out.print("Enter Quiz ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new Quiz Title: ");
        String newTitle = scanner.nextLine();
        System.out.print("Enter new Quiz Description: ");
        String newDescription = scanner.nextLine();

        String sql = "UPDATE quizzes SET title = ?, description = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newTitle);
            pstmt.setString(2, newDescription);
            pstmt.setInt(3, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Quiz updated successfully!");
            } else {
                System.out.println("Quiz not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to update quiz!");
        }
    }

    // Method to delete a quiz
    private static void deleteQuiz(Scanner scanner) {
        System.out.print("Enter Quiz ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String sql = "DELETE FROM quizzes WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Quiz deleted successfully!");
            } else {
                System.out.println("Quiz not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to delete quiz!");
        }
    }
}