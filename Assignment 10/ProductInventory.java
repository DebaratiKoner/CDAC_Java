
import java.util.Scanner;

class ProductInventory {
    public static void main(String[] args) {
        String[] products = {
            "Laptop", "Mobile", "Keyboard", "Mouse", "Monitor"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Product Name: " + products[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Error: Product does not exist at the specified index."
            );
        }

        sc.close();
    }
}
