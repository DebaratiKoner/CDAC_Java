import java.util.Scanner;

public class Emp_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Permanent Employee Details");
        System.out.print("Enter Employee ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary1 = sc.nextDouble();

        Employee e1 = new PermanentEmployee(id1, name1, salary1);

        System.out.println("\nContract Employee Details");
        System.out.print("Enter Employee ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary2 = sc.nextDouble();

        Employee e2 = new ContractEmployee(id2, name2, salary2);

        System.out.println("\n--- Permanent Employee ---");
        e1.displayDetails();

        System.out.println("\n--- Contract Employee ---");
        e2.displayDetails();

        sc.close();
    }
}