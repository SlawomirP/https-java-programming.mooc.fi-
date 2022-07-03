
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String user = scanner.nextLine();
            if (user.equals("")) {
                break;
            }
            String[] tabl = user.split(" ");
            for (String a : tabl) {
                if (a.contains("av")) {
                    System.out.println(a);
                }
            }
        }
    }
}
