class Vehicle {
    int vehicleID, manufacturingYear;
    String brand;

    Vehicle(int vehicleID, String brand, int manufacturingYear) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
    }

    void displayVehicle() {
        System.out.println("Vehicle ID: " + this.vehicleID);
        System.out.println("Brand: " + this.brand);
        System.out.println("Manufacturing Year: " + this.manufacturingYear);
    }
}