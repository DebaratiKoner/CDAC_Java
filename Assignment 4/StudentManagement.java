
import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    double marks;

    void read(Scanner sc) {
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    String findResult() {
        if (marks >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    void display() {
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + findResult());
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Enter details of Student 1:");
        s1.read(sc);

        System.out.println("\nEnter details of Student 2:");
        s2.read(sc);

        System.out.println("\nEnter details of Student 3:");
        s3.read(sc);

        System.out.println("\n--- Student Details ---");
        s1.display();
        s2.display();
        s3.display();

        sc.close();
    }
}
