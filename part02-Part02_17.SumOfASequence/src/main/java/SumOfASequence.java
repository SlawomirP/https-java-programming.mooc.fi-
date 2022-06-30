
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int result = 0;
        for (int i = 1; i <= last; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
