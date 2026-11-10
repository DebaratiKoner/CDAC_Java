
public class HospitalMain {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Ravi", "Cardiologist");
        Doctor d2 = new Doctor(102, "Priya", "Neurologist");

        Patient p1 = new Patient(1, "Arun", d1);
        Patient p2 = new Patient(2, "Sneha", d2);
        Patient p3 = new Patient(3, "Kiran", d1);

        p1.displayPatient();
        p2.displayPatient();
        p3.displayPatient();
    }
}
