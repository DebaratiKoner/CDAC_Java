
class ShoppingCart {
    public static void main(String[] args) {
        double[] prices = {100.0, 200.0, 150.0};
        int[] quantities = {2, 1, 3};

        double totalCost = 0;
        int totalItems = 0;

        for (int i = 0; i < prices.length; i++) {
            totalCost += prices[i] * quantities[i];
            totalItems += quantities[i];
        }

        try {
            double averageCost = totalCost / totalItems;

            System.out.println("Total Cost: Rs. " + totalCost);
            System.out.println("Average Cost per Item: Rs. "
                    + averageCost);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }
    }
}
