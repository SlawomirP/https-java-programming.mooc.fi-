
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            String userWord = scanner.nextLine();
            if (userWord.equals("end")) {
                break;
            }
            int stringToNr = Integer.valueOf(userWord);
            System.out.println((int) Math.pow(stringToNr, 3));
        }
    }
}
