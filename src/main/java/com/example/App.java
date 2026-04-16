import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Number of books: ");
        int books = sc.nextInt();
        System.out.print("Days borrowed: ");
        int days = sc.nextInt();

        int limit = 7;
        int finePerDay = 2;
        int fine = 0;

        if (days > limit) {
            fine = (days - limit) * finePerDay * books;
        }

        System.out.println("\n--- Borrowing Status ---");
        System.out.println("User: " + name + " (ID: " + id + ")");
        System.out.println("Books Issued: " + books);
        System.out.println("Total Fine: $" + fine);
    }
}
