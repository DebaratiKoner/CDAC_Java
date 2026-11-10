
public class PayrollMain {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee(
            101, "Ramesh", 30000.0, 5000.0, 3000.0
        );

        Employee e2 = new ContractEmployee(
            102, "Suresh", 20000.0, 4000.0
        );

        System.out.println("Permanent Employee Details:");
        e1.displayDetails();
        System.out.println("Calculated Salary: Rs. " + e1.calculateSalary());
        System.out.println();
        System.out.println("Contract Employee Details:");
        e2.displayDetails();
        System.out.println("Calculated Salary: Rs. " + e2.calculateSalary());
    }
}
