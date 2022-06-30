
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countNr = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Write numbers:");
        while (true) {
            int userNr = Integer.valueOf(scanner.nextLine());
            if (userNr == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (userNr % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            System.out.println(userNr);
            sum += userNr;
            countNr++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countNr);
        System.out.println("Average: " + (float) sum / countNr);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
