import java.util.Scanner;

class MotorVehicle extends Vehicle {
    float engineCC;
    String fuelType;

    MotorVehicle(int id, String brand, int year,float engineCC, String fuelType) {
        super(id, brand, year);
        this.engineCC = engineCC;
        this.fuelType = fuelType;
    }
}

public class ElectricVehicle extends MotorVehicle {
    float batteryCapacity, drivingRange, chargingTime;

    ElectricVehicle(int id, String brand, int year, float cc,String fuel, float batteryCapacity,float drivingRange, float chargingTime) {
        super(id, brand, year, cc, fuel);
        this.batteryCapacity = batteryCapacity;
        this.drivingRange = drivingRange;
        this.chargingTime = chargingTime;
    }

    void displayDetails() {
        this.displayVehicle();
        System.out.println("Engine Capacity: " + this.engineCC + " CC");
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Battery Capacity: " + this.batteryCapacity + " kWh");
        System.out.println("Driving Range: " + this.drivingRange + " km");
        System.out.println("Charging Time: " + this.chargingTime + " hours");
        System.out.println("Vehicle Age: " + (2026 - this.manufacturingYear) + " years");

        if (this.drivingRange > 0) {
            System.out.println("Energy Consumption: "+ (this.batteryCapacity / this.drivingRange)+ " kWh/km");
        } else {
            System.out.println("Driving range must be greater than zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Engine CC: ");
        float cc = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuel = sc.nextLine();

        System.out.print("Enter Battery Capacity (kWh): ");
        float battery = sc.nextFloat();

        System.out.print("Enter Driving Range (km): ");
        float range = sc.nextFloat();

        System.out.print("Enter Charging Time (hours): ");
        float time = sc.nextFloat();

        ElectricVehicle ev = new ElectricVehicle(
            id, brand, year, cc, fuel, battery, range, time
        );

        ev.displayDetails();
        sc.close();
    }
}

