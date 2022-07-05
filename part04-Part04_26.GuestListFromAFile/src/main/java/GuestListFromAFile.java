
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String userFile = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner readScanner = new Scanner(Paths.get(userFile));
            while (readScanner.hasNextLine()) {
                list.add(readScanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("readScanner error");
        }
        System.out.println();

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}
