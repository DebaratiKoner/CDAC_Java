
class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return this.basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Basic Salary: Rs. " + this.basicSalary);
    }
}
