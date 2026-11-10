
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class StudentRead {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("student.dat");

        ObjectInputStream ois = new ObjectInputStream(fis);

        for (int i = 1; i <= 5; i++) {

            Student s = (Student) ois.readObject();

            s.display();
        }

        ois.close();
        fis.close();
    }
}
