import java.util.*;

public class Salary {
    static double calculateSalary(double basic) {
        if (basic >= 50000) {
            return basic + (basic * 0.20);
        } else {
            return basic + (basic * 0.10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basic = sc.nextDouble();

        double salary = calculateSalary(basic);

        System.out.println("Basic Salary: " + basic);
        System.out.println("Final Salary: " + salary);

        sc.close();
    }
}