
class Payment {
    int paymentId;
    double paymentAmount;

    Payment(int paymentId, double paymentAmount) {
        this.paymentId = paymentId;
        this.paymentAmount = paymentAmount;
    }

    void processPayment() {
        System.out.println("Payment ID: " + this.paymentId);
        System.out.println("Payment Amount: Rs. " + this.paymentAmount);
        System.out.println("General payment processing");
    }
}
