
class Patient {
    int patientId;
    String patientName;
    int daysAdmitted;
    double dailyRoomCharges;

    static int patientCount = 0;
    static String hospitalName = "City Care Hospital";

    Patient(int id, String name, int days, double charges) {
        patientId = id;
        patientName = name;
        daysAdmitted = days;
        dailyRoomCharges = charges;
        patientCount++;
    }

    double calculateRoomBill() {
        return daysAdmitted * dailyRoomCharges;
    }

    void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Room Charges: " + dailyRoomCharges);
        System.out.println("Room Bill: " + calculateRoomBill());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Patient[] p = new Patient[5];

        p[0] = new Patient(101, "Ravi", 3, 1500);
        p[1] = new Patient(102, "Priya", 5, 2000);
        p[2] = new Patient(103, "Arun", 2, 1200);
        p[3] = new Patient(104, "Sneha", 4, 1800);
        p[4] = new Patient(105, "Kiran", 6, 1000);

        for (int i = 0; i < p.length; i++) {
            p[i].display();
        }

        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Total Patients: " + patientCount);
    }
}
