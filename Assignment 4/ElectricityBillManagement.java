
import java.util.Scanner;

class ElectricityBill {
    int consumerNumber;
    String consumerName;
    int unitsConsumed;

    void read(Scanner sc) {
        System.out.print("Enter Consumer Number: ");
        consumerNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        unitsConsumed = sc.nextInt();
    }

    double calculateBill() {
        double bill;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 3.0;
        } else if (unitsConsumed <= 200) {
            bill = (100 * 3.0)
                 + (unitsConsumed - 100) * 5.0;
        } else {
            bill = (100 * 3.0)
                 + (100 * 5.0)
                 + (unitsConsumed - 200) * 8.0;
        }

        return bill;
    }

    void display() {
        System.out.println("\nConsumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.printf("Bill Amount: Rs. %.2f%n", calculateBill());
    }
}

public class ElectricityBillManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ElectricityBill b1 = new ElectricityBill();
        ElectricityBill b2 = new ElectricityBill();
        ElectricityBill b3 = new ElectricityBill();

        System.out.println("Enter details of Consumer 1:");
        b1.read(sc);

        System.out.println("\nEnter details of Consumer 2:");
        b2.read(sc);

        System.out.println("\nEnter details of Consumer 3:");
        b3.read(sc);

        System.out.println("\n--- Electricity Bill Details ---");
        b1.display();
        b2.display();
        b3.display();

        sc.close();
    }
}
