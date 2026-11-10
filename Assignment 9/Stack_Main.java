package cdac;
import java.util.Stack;
import java.util.Scanner;

public class Stack_Main{
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String action;

        do {
            System.out.println("\n--- Text Editor Undo Menu ---");
            System.out.println("1. Add Editing Action");
            System.out.println("2. Undo Last Action");
            System.out.println("3. Display Most Recent Action");
            System.out.println("4. Display All Actions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter action:");
                    action = sc.nextLine();
                    s.push(action);
                    System.out.println("Action added successfully.");
                    break;

                case 2:
                    if (s.isEmpty()) {
                        System.out.println("No actions available to undo.");
                    } else {
                        System.out.println("Undoing action: " + s.pop());
                    }
                    break;

                case 3:
                    if (s.isEmpty()) {
                        System.out.println("No actions in history.");
                    } else {
                        System.out.println("Most recent action: " + s.peek());
                    }
                    break;

                case 4:
                    if (s.isEmpty()) {
                        System.out.println("No actions in history.");
                    } else {
                        System.out.println("Editing History (Most Recent First):");
                        for (int i = s.size() - 1; i >= 0; i--) {
                            System.out.println(s.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting Text Editor.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
