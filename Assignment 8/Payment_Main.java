

import java.util.Scanner;

public class Payment_Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Credit card payment details
        System.out.println("Enter Card Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Card Number:");
        String number = sc.nextLine();

        System.out.println("Enter Bank Name:");
        String bank = sc.nextLine();

        System.out.println("Enter Payment Amount:");
        double amount1 = sc.nextDouble();
        sc.nextLine();

        Payment p1 = new CreditCardPayment(name, number, bank);

        // UPI payment details
        System.out.println("\nEnter UPI ID:");
        String upi = sc.nextLine();

        System.out.println("Enter Mobile Number:");
        String mobile = sc.nextLine();

        System.out.println("Enter Payment Amount:");
        double amount2 = sc.nextDouble();

        Payment p2 = new UPIPayment(upi, mobile);

        // Process payments using interface references
        p1.makePayment(amount1);
        p2.makePayment(amount2);

        sc.close();
    }
}
