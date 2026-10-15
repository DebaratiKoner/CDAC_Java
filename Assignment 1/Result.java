import java.util.*;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}