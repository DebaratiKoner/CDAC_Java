import java.util.Scanner;

public class Patient_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- InPatient Details ---");

        System.out.print("Enter Patient ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days1 = sc.nextInt();

        Patient p1 = new InPatient(id1, name1, days1);

        System.out.println("\n--- OutPatient Details ---");

        System.out.print("Enter Patient ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days2 = sc.nextInt();

        System.out.print("Enter Medicine Charge: ");
        double medicine = sc.nextDouble();

        Patient p2 = new OutPatient(id2, name2, days2, medicine);

        System.out.println("\n===== InPatient Bill =====");
        p1.displayPatientDetails();

        System.out.println("\n===== OutPatient Bill =====");
        p2.displayPatientDetails();

        sc.close();
    }
}