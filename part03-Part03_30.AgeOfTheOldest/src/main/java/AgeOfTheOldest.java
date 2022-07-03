
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;
        while (true) {
            String user = scanner.nextLine();
            if (user.equals("")) {
                break;
            }
            String[] tabl = user.split(",");
            if (oldest < Integer.valueOf(tabl[1])) {
                oldest = Integer.valueOf(tabl[1]);
            }
        }
        System.out.println(oldest);
    }
}
