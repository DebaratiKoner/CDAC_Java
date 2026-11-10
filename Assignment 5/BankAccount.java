
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double accountBalance;

    static int accountCount = 0;
    static String bankName = "State Bank";

    BankAccount(int number, String name, double balance) {
        accountNumber = number;
        accountHolderName = name;
        accountBalance = balance;
        accountCount++;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        BankAccount[] a = new BankAccount[5];

        a[0] = new BankAccount(1001, "Ravi", 25000);
        a[1] = new BankAccount(1002, "Priya", 45000);
        a[2] = new BankAccount(1003, "Arun", 30000);
        a[3] = new BankAccount(1004, "Sneha", 60000);
        a[4] = new BankAccount(1005, "Kiran", 40000);

        int highest = 0;
        double totalBalance = 0;

        for (int i = 0; i < a.length; i++) {
            a[i].display();
            totalBalance += a[i].accountBalance;

            if (a[i].accountBalance > a[highest].accountBalance) {
                highest = i;
            }
        }

        System.out.println("Account with Highest Balance:");
        a[highest].display();

        System.out.println("Combined Balance: " + totalBalance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Total Accounts: " + accountCount);
    }
}
