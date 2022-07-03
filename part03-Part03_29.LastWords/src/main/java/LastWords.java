
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String user = scanner.nextLine();
            if (user.equals("")) {
                break;
            }
            String[] tabl = user.split(" ");
            System.out.println(tabl[tabl.length - 1]);
        }
    }
}
