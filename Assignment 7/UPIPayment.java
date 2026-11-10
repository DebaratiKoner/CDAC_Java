
class UPIPayment extends Payment {
    String upiTransactionReference;
    String upiId;

    UPIPayment(int paymentId, double paymentAmount,
               String upiTransactionReference, String upiId) {
        super(paymentId, paymentAmount);
        this.upiTransactionReference = upiTransactionReference;
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("UPI Payment");
        System.out.println("Payment ID: " + this.paymentId);
        System.out.println("Payment Amount: Rs. " + this.paymentAmount);
        System.out.println("Transaction Reference: " + this.upiTransactionReference);
        System.out.println("UPI ID: " + this.upiId);
        System.out.println("Transaction Status: Successful");
    }
}
