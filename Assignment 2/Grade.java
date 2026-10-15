import java.util.*;

public class Grade {
    static char calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 75 && marks < 90) {
            return 'B';
        } else if (marks >= 60 && marks < 75) {
            return 'C';
        } else if (marks >= 50 && marks < 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else {
            char grade = calculateGrade(marks);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}