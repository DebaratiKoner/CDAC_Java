import java.util.*;

public class Discount {
    static double calculateFinalPrice(double price) {
        if (price >= 10000) {
            return price - (price * 0.20);
        } else if (price >= 5000) {
            return price - (price * 0.10);
        } else if (price >= 2000) {
            return price - (price * 0.05);
        } else {
            return price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productId = sc.nextInt();
        sc.nextLine();

        String productName = sc.nextLine();
        double price = sc.nextDouble();

        double finalPrice = calculateFinalPrice(price);

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Final Price: " + finalPrice);

        sc.close();
    }
}