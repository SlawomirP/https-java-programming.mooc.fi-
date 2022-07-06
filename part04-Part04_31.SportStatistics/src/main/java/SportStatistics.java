
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int winCounter = 0;
        int loseCounter = 0;
        ArrayList<Team> teams = new ArrayList<>();
        System.out.println("Write file:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String userTeam = scanner.nextLine();
        try {
            Scanner readScanner = new Scanner(Paths.get(file));
            while (readScanner.hasNextLine()) {
                String temp = readScanner.nextLine();
                String[] data = temp.split(",");
                String homeTeam = data[0];
                String visitingTeam = data[1];
                int homePoints = Integer.valueOf(data[2]);
                int visitingPoints = Integer.valueOf(data[3]);
                teams.add(new Team(homeTeam, visitingTeam, homePoints, visitingPoints));
                if (homeTeam.contains(userTeam) || (visitingTeam.contains(userTeam))) {
                    counter++;
                }
                if (homeTeam.equals(userTeam)) {
                    if (homePoints > visitingPoints) {
                        winCounter++;
                    }
                    if (homePoints < visitingPoints) {
                        loseCounter++;
                    }
                }
                if (visitingTeam.equals(userTeam)) {
                    if (visitingPoints > homePoints) {
                        winCounter++;
                    }
                    if (visitingPoints < homePoints) {
                        loseCounter++;
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("ReadScanner error.");
        }
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + loseCounter);
    }
}
