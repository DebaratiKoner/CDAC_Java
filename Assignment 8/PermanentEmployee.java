class PermanentEmployee extends Employee {

    PermanentEmployee(int employeeId, String employeeName,
                      double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    double calculateSalary() {
        double hra = this.basicSalary * 0.20;
        double da = this.basicSalary * 0.10;
        return this.basicSalary + hra + da;
    }
}