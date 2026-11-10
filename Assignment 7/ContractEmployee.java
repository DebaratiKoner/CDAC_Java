
class ContractEmployee extends Employee {
    double allowance;

    ContractEmployee(int employeeId, String employeeName,
                     double basicSalary, double allowance) {
        super(employeeId, employeeName, basicSalary);
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return this.basicSalary + this.allowance;
    }
}

