package cdac;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList_Main {
    public static void main(String[] args) {
        LinkedList<Song> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Music Playlist Menu ---");
            System.out.println("1. Add Song at Beginning");
            System.out.println("2. Add Song at End");
            System.out.println("3. Remove Song by ID");
            System.out.println("4. Display All Songs");
            System.out.println("5. Display First Song");
            System.out.println("6. Display Last Song");
            System.out.println("7. Navigate Next Song");
            System.out.println("8. Navigate Previous Song");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Enter Song ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();

                    Song song = new Song(id, title, artist);

                    if (choice == 1) {
                        playlist.addFirst(song);
                        System.out.println("Song added at beginning.");
                    } else {
                        playlist.addLast(song);
                        System.out.println("Song added at end.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Song ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean found = false;

                    for (Song s : playlist) {
                        if (s.songId == removeId) {
                            playlist.remove(s);
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Song removed successfully.");
                    } else {
                        System.out.println("Song not found.");
                    }
                    break;

                case 4:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty.");
                    } else {
                        System.out.println("All Songs in Playlist:");
                        for (Song s : playlist) {
                            s.display();
                        }
                    }
                    break;

                case 5:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty.");
                    } else {
                        System.out.println("First Song:");
                        playlist.getFirst().display();
                    }
                    break;

                case 6:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty.");
                    } else {
                        System.out.println("Last Song:");
                        playlist.getLast().display();
                    }
                    break;

                case 7:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty.");
                    } else {
                        ListIterator<Song> nextIterator =
                                playlist.listIterator();

                        if (nextIterator.hasNext()) {
                            System.out.println("Next Song:");
                            nextIterator.next().display();
                        }
                    }
                    break;

                case 8:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty.");
                    } else {
                        ListIterator<Song> prevIterator =
                                playlist.listIterator(playlist.size());

                        if (prevIterator.hasPrevious()) {
                            System.out.println("Previous Song:");
                            prevIterator.previous().display();
                        }
                    }
                    break;

                case 9:
                    System.out.println("Exiting Music Playlist.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}
