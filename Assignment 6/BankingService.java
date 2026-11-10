

import java.util.Scanner;

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(long number, String holder, double balance,
                   double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest(int years) {
        double interest = (this.balance * this.interestRate * years) / 100;
        this.balance = this.balance + interest;

        this.displayAccount();
        System.out.println("Interest Earned: " + interest);
        System.out.println("Balance After Interest: " + this.balance);
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(long number, String holder, double balance,
                   double overdraftLimit) {
        super(number, holder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance + this.overdraftLimit) {
            this.balance = this.balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal denied.");
        }

        this.displayAccount();
    }
}

public class BankingService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Savings Account  2. Current Account");
        System.out.print("Choose account type: ");
        int choice = sc.nextInt();

        System.out.print("Enter Account Number: ");
        long number = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        if (choice == 1) {
            System.out.print("Enter Annual Interest Rate (%): ");
            double rate = sc.nextDouble();

            System.out.print("Enter Number of Years: ");
            int years = sc.nextInt();

            SavingsAccount s = new SavingsAccount(number, holder, balance, rate);
            s.calculateInterest(years);
        } else if (choice == 2) {
            System.out.print("Enter Overdraft Limit: ");
            double limit = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            CurrentAccount c = new CurrentAccount(number, holder, balance, limit);
            c.withdraw(amount);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

