
public class CreditCardPayment implements Payment {
    String cardHolderName;
    String cardNumber;
    String bankName;

    CreditCardPayment(String name, String number, String bank) {
        cardHolderName = name;
        cardNumber = number;
        bankName = bank;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("\nCredit Card Payment");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Payment Amount: Rs. " + amount);
    }
}
