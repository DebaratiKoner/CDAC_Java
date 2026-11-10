

import java.util.Scanner;

public class Delivery_Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Standard delivery details
        System.out.println("Enter Standard Order ID:");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String name1 = sc.nextLine();

        System.out.println("Enter Distance in km:");
        double distance1 = sc.nextDouble();

        DeliveryService d1 = new StandardDelivery(
            id1, name1, distance1);

        // Express delivery details
        System.out.println("\nEnter Express Order ID:");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String name2 = sc.nextLine();

        System.out.println("Enter Distance in km:");
        double distance2 = sc.nextDouble();

        DeliveryService d2 = new ExpressDelivery(
            id2, name2, distance2);

        // Display delivery details
        d1.displayDeliveryDetails();
        d2.displayDeliveryDetails();

        sc.close();
    }
}
