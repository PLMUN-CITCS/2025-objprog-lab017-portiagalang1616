import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score from the user
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1; // Initialize with an invalid value

        // Input loop
        while (score < 0 || score > 100) {
            System.out.print("Enter your score (0-100): ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid input! Please enter a score between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
        return score;
    }

    // Method to determine the letter grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        double studentScore = getStudentScore(); // Get user input
        String grade = calculateGrade(studentScore); // Calculate grade
        System.out.println("Your Grade is: " + grade); // Display the result
    }
}
