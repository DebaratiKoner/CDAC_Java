
class Billing {

    double calculateBill(double price) {
        return price;
    }

    double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    double calculateBill(double price, int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
}
