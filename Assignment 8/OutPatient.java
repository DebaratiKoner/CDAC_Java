class OutPatient extends Patient {
    double medicineCharge;

    OutPatient(int patientId, String patientName, int numberOfDays,
               double medicineCharge) {
        super(patientId, patientName, numberOfDays);
        this.medicineCharge = medicineCharge;
    }

    @Override
    double calculateBill() {
        return 800 + this.medicineCharge;
    }
}