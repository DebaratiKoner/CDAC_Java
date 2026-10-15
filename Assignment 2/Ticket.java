import java.util.*;

public class Ticket {
    static int calculateFare(int age) {
        if (age < 5) {
            return 0;
        } else if (age <= 12) {
            return 20;
        } else if (age <= 59) {
            return 40;
        } else {
            return 25;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            int fare = calculateFare(age);

            System.out.println("Passenger Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ticket Fare: " + fare);
        }

        sc.close();
    }
}