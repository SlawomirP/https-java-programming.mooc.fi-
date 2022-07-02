
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            numbers.add(number);
        }
        int min = numbers.get(0);
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Smallest number: " + min);
        for (int i = 0; i < numbers.size(); i++) {
            if (min == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
