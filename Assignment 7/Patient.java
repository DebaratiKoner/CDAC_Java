
class Patient {
    int patientId;
    String patientName;
    Doctor doctor;

    Patient(int patientId, String patientName, Doctor doctor) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.doctor = doctor;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + this.patientId);
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Assigned Doctor Details:");
        this.doctor.displayDoctor();
        System.out.println("----------------------");
    }
}
