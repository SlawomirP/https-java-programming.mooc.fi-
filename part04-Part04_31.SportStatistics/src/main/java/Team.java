/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slawo
 */
public class Team {
        private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public Team (String homeTeam, String visitingTeam, int homePoints, int visitingPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public int getVisitingPoints() {
        return visitingPoints;
    }
    
    public String toString (){
    return this.homeTeam + ", " + this.visitingTeam + ", " + this.homePoints + ", " + this.visitingPoints;}
}
