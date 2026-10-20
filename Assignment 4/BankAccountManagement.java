
import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String accountHolderName;
    double accountBalance;

    void read(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        accountBalance = sc.nextDouble();
    }

    String checkCategory() {
        if (accountBalance >= 100000) {
            return "Premium";
        } else if (accountBalance >= 25000) {
            return "Standard";
        } else {
            return "Basic";
        }
    }

    void display() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Account Balance: Rs. %.2f%n", accountBalance);
        System.out.println("Account Category: " + checkCategory());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        BankAccount a3 = new BankAccount();

        System.out.println("Enter details of Account 1:");
        a1.read(sc);

        System.out.println("\nEnter details of Account 2:");
        a2.read(sc);

        System.out.println("\nEnter details of Account 3:");
        a3.read(sc);

        System.out.println("\n--- Bank Account Details ---");
        a1.display();
        a2.display();
        a3.display();

        sc.close();
    }
}
