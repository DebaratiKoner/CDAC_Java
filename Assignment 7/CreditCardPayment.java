
class CreditCardPayment extends Payment {
    String cardTransactionReference;
    double processingFee;

    CreditCardPayment(int paymentId, double paymentAmount,
                      String cardTransactionReference, double processingFee) {
        super(paymentId, paymentAmount);
        this.cardTransactionReference = cardTransactionReference;
        this.processingFee = processingFee;
    }

    @Override
    void processPayment() {
        System.out.println("Credit Card Payment");
        System.out.println("Payment ID: " + this.paymentId);
        System.out.println("Payment Amount: Rs. " + this.paymentAmount);
        System.out.println("Transaction Reference: " + this.cardTransactionReference);
        System.out.println("Processing Fee: Rs. " + this.processingFee);
        System.out.println("Total Amount: Rs. " +
                           (this.paymentAmount + this.processingFee));
    }
}
