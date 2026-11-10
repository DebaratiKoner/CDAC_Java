
package cdac;
class Employee {
    int empId;
    String empName;
    String department;
    double salary;

    Employee(int empId, String empName,
             String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + salary);
    }
}
