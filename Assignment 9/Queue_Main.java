package cdac;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue_Main {
    public static void main(String[] args) {
        Queue<Ticket> tickets = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        int id;

        do {
            System.out.println("\n--- Customer Service Menu ---");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display Next Ticket");
            System.out.println("4. Display All Pending Tickets");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Issue Description: ");
                    String issue = sc.nextLine();

                    tickets.add(new Ticket(id, name, issue));
                    System.out.println("Ticket added successfully.");
                    break;

                case 2:
                    if (tickets.isEmpty()) {
                        System.out.println("No tickets pending.");
                    } else {
                        Ticket t = tickets.poll();
                        System.out.println("Processing Ticket:");
                        t.display();
                    }
                    break;

                case 3:
                    if (tickets.isEmpty()) {
                        System.out.println("No tickets pending.");
                    } else {
                        System.out.println("Next Ticket to Process:");
                        tickets.peek().display();
                    }
                    break;

                case 4:
                    if (tickets.isEmpty()) {
                        System.out.println("No tickets pending.");
                    } else {
                        System.out.println("All Pending Tickets:");
                        for (Ticket t : tickets) {
                            t.display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting Ticket Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
