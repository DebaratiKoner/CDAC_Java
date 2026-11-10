
public class ExpressDelivery implements DeliveryService {
    int orderId;
    String customerName;
    double distance;

    ExpressDelivery(int id, String name, double distance) {
        orderId = id;
        customerName = name;
        this.distance = distance;
    }

    @Override
    public double calculateDeliveryCharge(double distance) {
        return (distance * 20) + 50;
    }

    @Override
    public void displayDeliveryDetails() {
        System.out.println("\nExpress Delivery");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Delivery Charge: Rs. "
            + calculateDeliveryCharge(distance));
    }
}
