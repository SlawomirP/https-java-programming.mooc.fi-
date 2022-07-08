import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Identifier?");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name?");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item item = new Item(identifier,name);
            
            if(!(items.contains(item))){
                items.add(item);
            }

        }
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
