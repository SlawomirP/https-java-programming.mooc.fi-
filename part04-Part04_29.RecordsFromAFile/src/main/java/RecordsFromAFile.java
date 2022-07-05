
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try {
            Scanner readScanner = new Scanner(Paths.get(file));
            while (readScanner.hasNextLine()) {
                String row = readScanner.nextLine();
                String[] tabl = row.split(",");
                String name = tabl[0];
                int age = Integer.valueOf(tabl[1]);
                System.out.println(name + ", age: " + age + " " + ((age == 1) ? "year" : "years"));
            }
        } catch (IOException ex) {
            System.out.println("Error.");
        }
    }
}
