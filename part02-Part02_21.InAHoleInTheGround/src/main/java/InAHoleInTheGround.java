
import java.util.Scanner;


public class InAHoleInTheGround {

    public static void main(String[] args) {
        int start = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int repeat = Integer.valueOf(scanner.nextLine());
        while (start <= repeat) {
            printText();
            start++;
        }

    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
