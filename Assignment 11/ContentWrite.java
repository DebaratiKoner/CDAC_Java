
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContentWrite {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("content.txt");

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter line " + i + ": ");
            String line = sc.nextLine();

            fw.write(line + "\n");
        }

        System.out.println("Content Written Successfully");

        fw.close();
        sc.close();
    }
}
