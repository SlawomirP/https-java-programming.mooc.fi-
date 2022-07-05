
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        ArrayList<String> namesList = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try {
            Scanner readScanner = new Scanner(Paths.get(file));
            while (readScanner.hasNextLine()) {
                namesList.add(readScanner.nextLine());
            }
        } catch (IOException ex) {
            error = true;
//            System.out.println("Reading the file " + file + " failed.");
        }
        while (true) {
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            if (searchedFor.isEmpty()) {
                break;
            }
            if (error) {
                System.out.println("Reading the file " + file + " failed.");
                break;
            }
            if (namesList.contains(searchedFor)) {
                System.out.println("Found!");
                break;
            } else {
                System.out.println("Not found.");
                break;
            }
        }
    }
}
