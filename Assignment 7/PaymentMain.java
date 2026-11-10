
public class PaymentMain {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(
            101, 5000.0, "CC12345", 100.0
        );

        Payment p2 = new UPIPayment(
            102, 2500.0, "UPI67890", "rahul@upi"
        );

        p1.processPayment();

        System.out.println();

        p2.processPayment();
    }
}
