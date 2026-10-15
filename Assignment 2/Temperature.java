import java.util.*;

public class Temperature {
    static double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextDouble();

        double fahrenheit = convertTemperature(celsius);

        System.out.println("Fahrenheit: " + fahrenheit);

        if (fahrenheit > 100) {
            System.out.println("Above 100 Fahrenheit");
        } else {
            System.out.println("100 Fahrenheit or below");
        }

        sc.close();
    }
}