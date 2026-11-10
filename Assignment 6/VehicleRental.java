

import java.util.Scanner;

class CarRental extends Rental {
    int seats;
    double driverCharges;

    CarRental(String reg, String brand, double rate,
              int seats, double driverCharges) {
        super(reg, brand, rate);
        this.seats = seats;
        this.driverCharges = driverCharges;
    }

    double totalRental(int days) {
        return (this.rentalRate + this.driverCharges) * days;
    }
}

class BikeRental extends Rental {
    int engineCC;
    double helmetCharges;

    BikeRental(String reg, String brand, double rate,
               int engineCC, double helmetCharges) {
        super(reg, brand, rate);
        this.engineCC = engineCC;
        this.helmetCharges = helmetCharges;
    }

    double totalRental(int days) {
        return (this.rentalRate * days) + this.helmetCharges;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Car Rental  2. Bike Rental");
        System.out.print("Choose vehicle type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Registration Number: ");
        String reg = sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Rental Rate per Day: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Rental Days: ");
        int days = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Number of Seats: ");
            int seats = sc.nextInt();

            System.out.print("Enter Driver Charges per Day: ");
            double driver = sc.nextDouble();

            CarRental car = new CarRental(reg, brand, rate, seats, driver);
            car.displayVehicle();
            System.out.println("Seats: " + car.seats);
            System.out.println("Total Rental Amount: " + car.totalRental(days));
        } else if (choice == 2) {
            System.out.print("Enter Engine Capacity (CC): ");
            int cc = sc.nextInt();

            System.out.print("Enter Helmet Charges: ");
            double helmet = sc.nextDouble();

            BikeRental bike = new BikeRental(reg, brand, rate, cc, helmet);
            bike.displayVehicle();
            System.out.println("Engine Capacity: " + bike.engineCC + " CC");
            System.out.println("Total Rental Amount: " + bike.totalRental(days));
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
