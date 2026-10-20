
import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    void read(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    double calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;

        return basicSalary + hra + da;
    }

    void display() {
        System.out.println("\nEmployee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        System.out.println("Enter details of Employee 1:");
        e1.read(sc);

        System.out.println("\nEnter details of Employee 2:");
        e2.read(sc);

        System.out.println("\nEnter details of Employee 3:");
        e3.read(sc);

        System.out.println("\n--- Employee Details ---");
        e1.display();
        e2.display();
        e3.display();

        sc.close();
    }
}
