import java.lang.String;
import java.util.Scanner;

public class DriverClass {

    public static void main(String [] args) {

        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);

        Competition pastCompetition = new Competition("Robotics",
                "The Winners",
                "The Runner-ups",
                2017);

        //Team team1 = new Team();
        Team team1 = new Team("Froggers",
                "John",
                pastCompetition);

        Team team2 = new Team(team1);

        System.out.println("Before copy constructor- TEAM-2 is the same as TEAM-1...");
        team1.printIt();
        System.out.println();
        team2.printIt();
        System.out.println();

        System.out.println("Enter your team name: ");
        String teamName = keyboard1.nextLine();
        //team2.setTeamName(teamName);


        System.out.println("Enter your name: ");
        String name = keyboard1.nextLine();
        //team2.setName(name);


        System.out.println("Name of Competition: ");
        String competitionName = keyboard1.nextLine();
        //team2.competition1.setNameOfCompetition(competitionName);

        System.out.println("Winners are: ");
        String winnerTeamName = keyboard1.nextLine();
        //team2.competition1.setNameOfWinningTeam(winnerTeamName);

        System.out.println("Runner-ups are: ");
        String runnerUps = keyboard1.nextLine();
        //team2.competition1.setNameOfRunnerUp(runnerUps);

        System.out.println("Year: ");
        int yearComp = keyboard1.nextInt();
        //team2.competition1.setYearOfCompetition(yearComp);

        //team2.setCompetition(competitionName,winnerTeamName,runnerUps,yearComp);


        //Team team2 = new Team(team1);
        //Team(teamName, name, competitionName, winnerTeamName, runnerUps, yearComp);

//        team1.printIt();
//        System.out.println();
//        team2.printIt();


    }

}
