
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ParagraphWrite {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a paragraph: ");
        String paragraph = sc.nextLine();

        FileWriter fw = new FileWriter("paragraph.txt");

        fw.write(paragraph);

        System.out.println("Paragraph Written Successfully");

        fw.close();

        FileReader fr = new FileReader("paragraph.txt");

        int ch;

        System.out.println("\nFile Contents:");

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
        sc.close();
    }
}
