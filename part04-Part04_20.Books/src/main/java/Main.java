
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Title:");
            String usTilte = scanner.nextLine();
            if (usTilte.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int usPages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year:");
            int usPublication = Integer.parseInt(scanner.nextLine());
            books.add(new Book(usTilte,usPages,usPublication));
        }
        System.out.println("What information will be printed?");
        String decision = scanner.nextLine();
        for (Book book : books) {
            if (decision.equals("everything")) {
                System.out.println(book);
            }
            if (decision.equals("name")) {
                System.out.println(book.getName());
            }
        }
    }
}
