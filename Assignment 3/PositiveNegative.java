import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int zeroCount = 0;

        System.out.print("Positive numbers: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Negative numbers: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }

            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        System.out.println();
        System.out.println("Zero values: " + zeroCount);

        sc.close();
    }
}