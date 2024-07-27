import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> grades = new HashMap<>();

        while (true) {
            System.out.println("Enter subject (or 'quit' to stop):");
            String subject = scanner.next(); 

            if (subject.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Enter grade:");
            double grade = scanner.nextDouble();

            grades.put(subject, grade);
        }
         
        double averageGrade = 0;
        for (double grade : grades.values()) {
            averageGrade += grade;
        }

        averageGrade /= grades.size();

        System.out.println("Average grade: " + averageGrade);
    }
}


 