
public class BillingMain {
    public static void main(String[] args) {
        Billing b = new Billing();

        double bill1 = b.calculateBill(500.0);
        double bill2 = b.calculateBill(200.0, 3);
        double bill3 = b.calculateBill(1000.0, 2, 10.0);

        System.out.println("Single Product Bill: Rs. " + bill1);
        System.out.println("Multiple Products Bill: Rs. " + bill2);
        System.out.println("Bill After Discount: Rs. " + bill3);
    }
}
