abstract class Patient {
    int patientId;
    String patientName;
    int numberOfDays;

    Patient(int patientId, String patientName, int numberOfDays) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.numberOfDays = numberOfDays;
    }

    abstract double calculateBill();

    void displayPatientDetails() {
        System.out.println("Patient ID: " + this.patientId);
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Number of Days: " + this.numberOfDays);
        System.out.println("Total Bill: Rs. " + this.calculateBill());
    }
}