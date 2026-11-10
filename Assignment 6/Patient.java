class Patient {
    int patientID;
    String patientName;
    double consultationCharges;

    Patient(int patientID, String patientName, double consultationCharges) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.consultationCharges = consultationCharges;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + this.patientID);
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Consultation Charges: " + this.consultationCharges);
    }
}
