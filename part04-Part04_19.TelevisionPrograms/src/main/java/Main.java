
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        while (true) {
            System.out.println("Name:");
            String userName = scanner.nextLine();
            if (userName.isEmpty()) {
                break;
            }
            System.out.println("Duration:");
            int userDuration = Integer.parseInt(scanner.nextLine());
            programs.add(new TelevisionProgram(userName, userDuration));
        }
        System.out.println("Program's maximum duration?");
        int durationLimit = Integer.parseInt(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= durationLimit) {
                System.out.println(program);
            }
        }
    }
}
