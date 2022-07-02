
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        return Collections.max(numbers);
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
