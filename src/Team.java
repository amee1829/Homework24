public class Team {

    String teamName;
    String name;
    Competition competition1;  // INFORMATION ON EACH COMPETITION

    public Team(){
        this.teamName = "";
        this.name = "";
        this.competition1 = new Competition();

    }

    Team(Team obj){
        this.teamName =obj.teamName;
        this.name = obj.name;
        this.competition1 =  new Competition(nameOfCompetition, nameOfWinningTeam,
                nameOfRunnerUp, yearOfCompetition);
    }

    Team(String teamName, String name, Competition competition1){
        this.teamName = teamName;
        this.name = name;
        this.competition1 = new Competition(competition1.nameOfCompetition, competition1.nameOfWinningTeam,
                competition1.nameOfRunnerUp, competition1.yearOfCompetition);
    }

    public Competition getCompetition1(){
        return this.competition1;
    }

    public void printIt(){
        System.out.println("Team Name: " + teamName);
        System.out.println("Person's Name: " + name);
        System.out.println("Competition Name: " + competition1.getNameOfCompetition());
        System.out.println("Winning Name: " + competition1.getNameOfWinningTeam());
        System.out.println("Runner-ups: " + competition1.getNameOfRunnerUp());
        System.out.println("Year of Competition: " + competition1.getYearOfCompetition());
    }
}
