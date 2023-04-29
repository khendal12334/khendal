import java.util.Scanner;

public class ExamScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 25;

        // Arrays to store input and output data
        int[] studentIDs = new int[numStudents];
        int[] attendanceScores = new int[numStudents];
        int[] quizScores = new int[numStudents];
        int[] activityScores = new int[numStudents];
        int[] examScores = new int[numStudents];
        int[] totalScores = new int[numStudents];
        String[] grades = new String[numStudents];

        // Input data for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter data for student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            studentIDs[i] = scanner.nextInt();
            System.out.print("Attendance score: ");
            attendanceScores[i] = scanner.nextInt();
            System.out.print("Quiz score: ");
            quizScores[i] = scanner.nextInt();
            System.out.print("Activity score: ");
            activityScores[i] = scanner.nextInt();
            System.out.print("Exam score: ");
            examScores[i] = scanner.nextInt();

            // Compute total score
            totalScores[i] = attendanceScores[i] + quizScores[i] + activityScores[i] + examScores[i];

            // Determine grade based on total score
            if (totalScores[i] >= 90) {
                grades[i] = "A";
            } else if (totalScores[i] >= 80) {
                grades[i] = "B";
            } else if (totalScores[i] >= 70) {
                grades[i] = "C";
            } else if (totalScores[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        // Output data for each student
        System.out.println("\nExam Scores and Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student ID: " + studentIDs[i]);
            System.out.println("Total Score: " + totalScores[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }

        scanner.close();
    }
}