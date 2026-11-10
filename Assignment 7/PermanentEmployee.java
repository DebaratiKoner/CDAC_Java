
class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int employeeId, String employeeName,
                      double basicSalary, double hra, double da) {
        super(employeeId, employeeName, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    @Override
    double calculateSalary() {
        return this.basicSalary + this.hra + this.da;
    }
}
