
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit Amount: Rs. " + amount);
    }

    void deposit(double amount, String transactionReference) {
        this.balance += amount;
        System.out.println("Deposit Amount: Rs. " + amount);
        System.out.println("Transaction Reference: " + transactionReference);
    }

    void deposit(double amount, String transactionReference, String depositMode) {
        this.balance += amount;
        System.out.println("Deposit Amount: Rs. " + amount);
        System.out.println("Transaction Reference: " + transactionReference);
        System.out.println("Deposit Mode: " + depositMode);
    }

    void displayAccount() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Final Balance: Rs. " + this.balance);
    }
}
