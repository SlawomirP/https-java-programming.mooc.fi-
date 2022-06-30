
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int userNr = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int userEnd = Integer.valueOf(scanner.nextLine());
        for (int i = userEnd; i <= userNr; i++) {
            System.out.println(i);
        }
    }
}
