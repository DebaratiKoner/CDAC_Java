public class UPIPayment implements Payment {
    String upiId;
    String mobileNumber;

    UPIPayment(String upiId, String mobileNumber) {
        this.upiId = upiId;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("\nUPI Payment");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Payment Amount: Rs. " + amount);
    }
}
