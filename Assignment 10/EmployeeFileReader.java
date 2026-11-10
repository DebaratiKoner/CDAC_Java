
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class EmployeeFileReader {

    void readEmployeeDetails() throws IOException {
        String path = "C:/Users/DBDA45/Downloads/Assignment_10/employee.txt";

        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {

            String line;
            System.out.println("Employee Details:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeFileReader reader = new EmployeeFileReader();

        try {
            reader.readEmployeeDetails();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
