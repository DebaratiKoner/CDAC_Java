
class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive."
            );
        }

        if (amount > balance) {
            throw new ArithmeticException(
                "Insufficient balance for withdrawal."
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Updated Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 5000.0);

        try {
            account.withdraw(1500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
