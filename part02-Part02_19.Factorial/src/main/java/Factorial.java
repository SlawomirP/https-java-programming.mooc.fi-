
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int userNr = Integer.valueOf(scanner.nextLine());
        int result = 1;
        if (userNr != 0) {
            for (int i = 1; i <= userNr; i++) {
                result *= i;
            }
        }
        System.out.println("Factorial " + result);
    }
}
