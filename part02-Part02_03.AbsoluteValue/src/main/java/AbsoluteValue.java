
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write a number");
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number < 0){
        System.out.println(number * -1);
        } else {
        System.out.println(number);
                }

    }
}
