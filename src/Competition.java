public class Competition {

    String nameOfCompetition,
            nameOfWinningTeam,
            nameOfRunnerUp;
    int yearOfCompetition;


   Competition() {
        this.nameOfCompetition = "namecompetition";
        this.nameOfWinningTeam = "winners";
        this.nameOfRunnerUp = "runners";
        this.yearOfCompetition = 0;

    }

    Competition(String nameOfCompetition, String nameOfWinningTeam, String nameOfRunnerUp, int yearOfCompetition) {
        this.nameOfCompetition = nameOfCompetition;
        this.nameOfWinningTeam = nameOfWinningTeam;
        this.nameOfRunnerUp = nameOfRunnerUp;
        this.yearOfCompetition = yearOfCompetition;
    }

    // *** My COPY CONSTRUCTOR ***
    public void Competition(Competition object){
        this.nameOfCompetition = object.nameOfCompetition;
        this.nameOfWinningTeam = object.nameOfWinningTeam;
        this.nameOfRunnerUp = object.nameOfRunnerUp;
        this.yearOfCompetition = object.yearOfCompetition;
    }

    public String getNameOfCompetition() {
        return nameOfCompetition;
    }

    public String getNameOfWinningTeam() {
        return nameOfWinningTeam;
    }

    public String getNameOfRunnerUp() {
        return nameOfRunnerUp;
    }

    public int getYearOfCompetition() {
        return yearOfCompetition;
    }
}
