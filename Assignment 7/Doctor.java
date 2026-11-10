
class Doctor {
    int doctorId;
    String doctorName;
    String specialization;

    Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor ID: " + this.doctorId);
        System.out.println("Doctor Name: " + this.doctorName);
        System.out.println("Specialization: " + this.specialization);
    }
}
