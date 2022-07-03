
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userText = scanner.nextLine();
            if (userText.equals("")) {
                break;
            }
            String[] splitText = userText.split(" ");
            for (String a : splitText) {
                System.out.println(a);
            }
        }
    }
}
