import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        String[] students = {"John", "Alice", "Bob", "Eve"};
        int[] scores = {85, 92, 76, 88};
        displayScores(students, scores);
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the name of the student to update the score: ");
        String studentName = scnr.nextLine();

        System.out.print("Enter the new score: ");
        int newScore = scnr.nextInt();
        updateScore(students, scores, studentName, newScore);
        System.out.println("\nUpdated list of students:");
        displayScores(students, scores);
    }
    public static void displayScores(String[] students, int[] scores) {
        System.out.println("Student List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - " + scores[i]);
        }
    }
    public static void updateScore(String[] students, int[] scores, String studentName, int newScore) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(studentName)) {
                scores[i] = newScore;
                System.out.println(studentName + "score has been updated to " + newScore);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
