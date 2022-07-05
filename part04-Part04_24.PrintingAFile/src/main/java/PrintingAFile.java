
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Paths.get("data.txt"));
            while (scanner.hasNextLine()) {
                String wiersz = scanner.nextLine();
                System.out.println(wiersz);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
