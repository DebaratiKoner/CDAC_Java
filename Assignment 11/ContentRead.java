
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ContentRead {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("content.txt");

        BufferedReader br = new BufferedReader(fr);

        String line;

        int characters = 0;
        int words = 0;
        int lines = 0;
        int vowels = 0;

        System.out.println("File Contents:\n");

        while ((line = br.readLine()) != null) {

            System.out.println(line);

            lines++;

            characters += line.length();

            String str = line.trim();

            if (!str.isEmpty()) {
                String arr[] = str.split("\\s+");
                words += arr.length;
            }

            for (int i = 0; i < line.length(); i++) {

                char ch = Character.toLowerCase(line.charAt(i));

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    vowels++;
                }
            }
        }

        System.out.println("\nTotal Characters: " + characters);
        System.out.println("Total Words: " + words);
        System.out.println("Total Lines: " + lines);
        System.out.println("Total Vowels: " + vowels);

        br.close();
        fr.close();
    }
}
