
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = 0;
        int sumNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            countNumbers++;
            sumNumbers += number;
        }
        System.out.println("Number of numbers: " + countNumbers);
        System.out.println("Sum of the numbers: " + sumNumbers);
    }
}
