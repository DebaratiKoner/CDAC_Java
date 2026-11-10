
class ElectricityBill {
    int consumerNumber;
    String consumerName;
    double unitsConsumed;
    double costPerUnit;

    static int consumerCount = 0;
    static String electricityBoard = "AP Electricity Board";

    ElectricityBill(int number, String name, double units, double cost) {
        consumerNumber = number;
        consumerName = name;
        unitsConsumed = units;
        costPerUnit = cost;
        consumerCount++;
    }

    double calculateBill() {
        return unitsConsumed * costPerUnit;
    }

    void display() {
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Cost Per Unit: " + costPerUnit);
        System.out.println("Electricity Bill: " + calculateBill());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        ElectricityBill[] e = new ElectricityBill[5];

        e[0] = new ElectricityBill(201, "Ravi", 100, 5.0);
        e[1] = new ElectricityBill(202, "Priya", 150, 6.0);
        e[2] = new ElectricityBill(203, "Arun", 200, 4.5);
        e[3] = new ElectricityBill(204, "Sneha", 120, 5.5);
        e[4] = new ElectricityBill(205, "Kiran", 180, 6.5);

        for (int i = 0; i < e.length; i++) {
            e[i].display();
        }

        System.out.println("Electricity Board: " + electricityBoard);
        System.out.println("Total Consumers: " + consumerCount);
    }
}
