
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Paths.get("song.txt"));
            while (scanner.hasNextLine()) {
                String wiersz = scanner.nextLine();
                System.out.println(wiersz);
            }
        } catch (IOException ex) {
            Logger.getLogger(PrintingASpecifiedFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
