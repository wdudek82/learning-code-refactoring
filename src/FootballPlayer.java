// Demonstrate the Creation Method replacement of Constructors

public class FootballPlayer {
    private double passerRating; // Specific to QBs
    private int rushingYards; // Specific to RBs & QBs
    private int receivingYards; // Specific to RBs & WRs
    private int totalTackles; // Specific to DEF
    private int interceptions; // Specific to DEF
    private int fieldGoals; // Specific to Kickers
    private double avgPunt; // Specific to Punters
    private double avgKickoffReturn; // Specific to Special Teams
    private double avgPuntReturn; // Specific to Special Teams

//    FootballPlayer(double passerRating, int rushingYards) {
//        this.passerRating = passerRating;
//        this.rushingYards = rushingYards;
//    }
//
//    FootballPlayer(int rushingYards) {
//        this.rushingYards = rushingYards;
//    }
//
//    // Problem with two constructor with attribute(s) of the same data type
//    FootballPlayer(int receivingYards) {
//        this.receivingYards = receivingYards;
//    }

    // Instead of absurdly many constructors it's better to write a catch-all constructor...
    private FootballPlayer(double passerRating, int rushingYards,
                           int receivingYards, int totalTackles, int interceptions,
                           int fieldGoals, double avgPunt, double avgKickoffReturn,
                           double avgPuntReturn){

        this.passerRating = passerRating;
        this.rushingYards = rushingYards;
        this.receivingYards = receivingYards;
        this.totalTackles = totalTackles;
        this.interceptions = interceptions;
        this.fieldGoals = fieldGoals;
        this.avgPunt = avgPunt;
        this.avgKickoffReturn = avgKickoffReturn;
        this.avgPuntReturn = avgPuntReturn;

    } // END OF FootballPlayer CONSTRUCTOR

    // ...and then creational method
    public static FootballPlayer createQB(double passerRating, int rushingYards) {
        return new FootballPlayer(passerRating, rushingYards, 0, 0,0, 0, 0.0, 0.0, 0.0);
    } // END OF createQB CREATION METHOD

    private double getPasserRating() { return this.passerRating; }

    public static void main(String[] args) {
        FootballPlayer aaronRodgers = FootballPlayer.createQB(108.0, 259);

        System.out.println("Aaron Rodgers Passer Rating: " + aaronRodgers.getPasserRating());
    } // END OF main

} // END OF FootballPlayer CLASS

