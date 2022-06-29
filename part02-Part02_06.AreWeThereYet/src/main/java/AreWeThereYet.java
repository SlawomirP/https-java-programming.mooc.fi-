
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decision = 1;
         while(true){
            System.out.println("Give a number: ");
            decision = Integer.valueOf(scanner.nextInt());
            if (decision == 4){
                break;
            }
        }
    }
}
