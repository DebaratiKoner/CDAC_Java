
import java.util.Scanner;

class ShoppingBill {
    int orderId;
    String customerName;
    double purchaseAmount;

    void read(Scanner sc) {
        System.out.print("Enter Order ID: ");
        orderId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Purchase Amount: ");
        purchaseAmount = sc.nextDouble();
    }

    double calculateDiscount() {
        if (purchaseAmount >= 10000) {
            return purchaseAmount * 0.15;
        } else if (purchaseAmount >= 5000) {
            return purchaseAmount * 0.10;
        } else if (purchaseAmount >= 1000) {
            return purchaseAmount * 0.05;
        } else {
            return 0;
        }
    }

    void display() {
        double discount = calculateDiscount();
        double finalAmount = purchaseAmount - discount;

        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.printf("Purchase Amount: Rs. %.2f%n", purchaseAmount);
        System.out.printf("Discount Amount: Rs. %.2f%n", discount);
        System.out.printf("Final Payable Amount: Rs. %.2f%n", finalAmount);
    }
}

public class ShoppingBillManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShoppingBill s1 = new ShoppingBill();
        ShoppingBill s2 = new ShoppingBill();
        ShoppingBill s3 = new ShoppingBill();

        System.out.println("Enter details of Order 1:");
        s1.read(sc);

        System.out.println("\nEnter details of Order 2:");
        s2.read(sc);

        System.out.println("\nEnter details of Order 3:");
        s3.read(sc);

        System.out.println("\n--- Shopping Bill Details ---");
        s1.display();
        s2.display();
        s3.display();

        sc.close();
    }
}
