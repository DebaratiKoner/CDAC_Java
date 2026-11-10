
class Rental {
    String registrationNumber, brand;
    double rentalRate;

    Rental(String registrationNumber, String brand, double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    void displayVehicle() {
        System.out.println("Registration Number: " + this.registrationNumber);
        System.out.println("Brand: " + this.brand);
        System.out.println("Rental Rate per Day: " + this.rentalRate);
    }
}

