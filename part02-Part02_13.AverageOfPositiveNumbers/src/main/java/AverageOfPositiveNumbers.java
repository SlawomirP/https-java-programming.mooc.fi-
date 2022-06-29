
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }
            if (number > 0) {
                count++;
                sum += number;
            }
        }
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        }
        if (sum > 0) {
            double avg = (double) sum / count;
            System.out.println(avg);
        }
    }
}
