
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int textLength = 0;
        String longestName = "";

        while (true) {
            String user = scanner.nextLine();
            if (user.equals("")) {
                break;
            }
            String[] tabl = user.split(",");
            sum += Integer.valueOf(tabl[1]);
            if (longestName.length() < tabl[0].length()) {
                longestName = tabl[0];
            }
            count++;
        }
        System.out.println("Longest name:" + longestName);
        System.out.println("Average of the birth years: " + (double) sum / count);
    }
}
