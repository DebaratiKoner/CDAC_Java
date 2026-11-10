
class Product {
    int productId;
    String productName;
    double unitPrice;
    int quantityAvailable;

    static int productCount = 0;
    static String storeName = "Smart Shopping Store";

    Product(int id, String name, double price, int quantity) {
        productId = id;
        productName = name;
        unitPrice = price;
        quantityAvailable = quantity;
        productCount++;
    }

    double calculateStockValue() {
        return unitPrice * quantityAvailable;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Stock Value: " + calculateStockValue());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Product[] p = new Product[5];

        p[0] = new Product(1, "Laptop", 50000, 5);
        p[1] = new Product(2, "Mobile", 20000, 10);
        p[2] = new Product(3, "Keyboard", 1000, 20);
        p[3] = new Product(4, "Monitor", 12000, 8);
        p[4] = new Product(5, "Mouse", 500, 30);

        int highest = 0;
        double totalInventoryValue = 0;

        for (int i = 0; i < p.length; i++) {
            p[i].display();
            totalInventoryValue += p[i].calculateStockValue();

            if (p[i].calculateStockValue() >
                p[highest].calculateStockValue()) {
                highest = i;
            }
        }

        System.out.println("Product with Highest Stock Value:");
        p[highest].display();

        System.out.println("Total Inventory Value: " + totalInventoryValue);
        System.out.println("Store Name: " + storeName);
        System.out.println("Total Products: " + productCount);
    }
}
