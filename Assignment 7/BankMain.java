
public class BankMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(12345, "Rahul", 5000.0);

        System.out.println("Initial Balance: Rs. " + b.balance);
        System.out.println();

        b.deposit(1000.0);
        System.out.println();

        b.deposit(2000.0, "TXN101");
        System.out.println();

        b.deposit(3000.0, "TXN102", "Online Transfer");
        System.out.println();

        b.displayAccount();
    }
}
