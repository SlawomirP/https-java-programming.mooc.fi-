
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int counter = 0;

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try {
            Scanner readScanner = new Scanner(Paths.get(file));
            while (readScanner.hasNextLine()) {
                numbers.add(Integer.valueOf(readScanner.nextLine()));
            }
        } catch (IOException ex) {
            System.out.println("readScanner error.");
        }
        for (Integer number : numbers) {
            if (number >= lowerBound && number <= upperBound) {
                counter++;
            }
        }
        System.out.println("Numbers: " + counter);
    }
}
