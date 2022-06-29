
import com.sun.jdi.IntegerValue;
import sun.awt.image.IntegerComponentRaster;

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
        int number = Integer.valueOf(scanner.nextLine());
        int result = number*number;
        System.out.println(result);

    }
}
