import java.util.*;

public class Subject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        sc.close();
    }
}