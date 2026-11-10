class ContractEmployee extends Employee {

    ContractEmployee(int employeeId, String employeeName,
                     double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    double calculateSalary() {
        return this.basicSalary + 3000;
    }
}