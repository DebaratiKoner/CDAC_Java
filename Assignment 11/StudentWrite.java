
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StudentWrite {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        FileOutputStream fos = new FileOutputStream("student.dat");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter Student " + i + " Details");

            System.out.print("Enter Student ID: ");
            int sid = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Marks: ");
            int mark = sc.nextInt();

            Student s = new Student(sid, name, mark);

            oos.writeObject(s);
        }

        System.out.println("All Student Details Saved Successfully");

        oos.close();
        fos.close();
        sc.close();
    }
}
