
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userSearch;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.println("Search for?");
        if (list.contains(userSearch = scanner.nextLine())) {
            System.out.println(userSearch + " was found!");
        } else {
            System.out.println(userSearch + " was not found!");
        }
    }
}
