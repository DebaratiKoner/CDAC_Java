class Employee {
    private int employeeId;
    private String employeeName;
    private int availableLeaveDays;

    Employee(int employeeId, String employeeName, int availableLeaveDays) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.availableLeaveDays = availableLeaveDays;
    }

    void applyLeave(int days) throws InsufficientLeaveException {
        if (days <= 0) {
            throw new InsufficientLeaveException(
                "Leave days must be greater than zero."
            );
        }

        if (days > availableLeaveDays) {
            throw new InsufficientLeaveException(
                "Insufficient leave balance."
            );
        }

        availableLeaveDays -= days;

        System.out.println("Leave approved successfully.");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Remaining Leave Days: " + availableLeaveDays);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Rahul", 10);

        try {
            emp.applyLeave(4);
        } catch (InsufficientLeaveException e) {
            System.out.println("Leave Request Error: " + e.getMessage());
        }
    }
}