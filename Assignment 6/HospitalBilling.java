import java.util.Scanner;

class InPatient extends Patient {
    int admissionDays;
    double dailyRoomCharges, medicineCharges;

    InPatient(int id, String name, double consultation,
              int days, double room, double medicine) {
        super(id, name, consultation);
        this.admissionDays = days;
        this.dailyRoomCharges = room;
        this.medicineCharges = medicine;
    }

    double totalBill() {
        return this.consultationCharges+ (this.admissionDays * this.dailyRoomCharges)+ this.medicineCharges;
    }

    void display() {
        this.displayPatient();
        System.out.println("Admission Days: " + this.admissionDays);
        System.out.println("Daily Room Charges: " + this.dailyRoomCharges);
        System.out.println("Medicine Charges: " + this.medicineCharges);
        System.out.println("Total InPatient Bill: " + this.totalBill());
    }
}

class OutPatient extends Patient {
    double laboratoryCharges, prescribedMedicineCharges;

    OutPatient(int id, String name, double consultation,
               double lab, double medicine) {
        super(id, name, consultation);
        this.laboratoryCharges = lab;
        this.prescribedMedicineCharges = medicine;
    }

    double totalBill() {
        return this.consultationCharges
            + this.laboratoryCharges
            + this.prescribedMedicineCharges;
    }

    void display() {
        this.displayPatient();
        System.out.println("Laboratory Charges: " + this.laboratoryCharges);
        System.out.println("Prescribed Medicine Charges: "
                           + this.prescribedMedicineCharges);
        System.out.println("Total OutPatient Bill: " + this.totalBill());
    }
}

public class HospitalBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. InPatient  2. OutPatient");
        System.out.print("Choose patient type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Consultation Charges: ");
        double consultation = sc.nextDouble();

        if (choice == 1) {
            System.out.print("Enter Admission Days: ");
            int days = sc.nextInt();

            System.out.print("Enter Daily Room Charges: ");
            double room = sc.nextDouble();

            System.out.print("Enter Medicine Charges: ");
            double medicine = sc.nextDouble();

            InPatient p = new InPatient(
                id, name, consultation, days, room, medicine
            );
            p.display();
        } else if (choice == 2) {
            System.out.print("Enter Laboratory Charges: ");
            double lab = sc.nextDouble();

            System.out.print("Enter Prescribed Medicine Charges: ");
            double medicine = sc.nextDouble();

            OutPatient p = new OutPatient(
                id, name, consultation, lab, medicine
            );
            p.display();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
