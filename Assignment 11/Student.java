
import java.io.Serializable;

public class Student implements Serializable {

    int sid;
    String name;
    int mark;

    Student(int sid, String name, int mark) {

        this.sid = sid;
        this.name = name;
        this.mark = mark;
    }

    void display() {

        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + mark);
        System.out.println("----------------------");
    }
}
