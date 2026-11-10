
public class StandardDelivery implements DeliveryService {
    int orderId;
    String customerName;
    double distance;

    StandardDelivery(int id, String name, double distance) {
        orderId = id;
        customerName = name;
        this.distance = distance;
    }

    @Override
    public double calculateDeliveryCharge(double distance) {
        return distance * 10;
    }

    @Override
    public void displayDeliveryDetails() {
        System.out.println("\nStandard Delivery");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Delivery Charge: Rs. "
            + calculateDeliveryCharge(distance));
    }
}
