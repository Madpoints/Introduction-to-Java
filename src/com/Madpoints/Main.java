package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> patriots = new Team<>("New England Patriots");
        Team<FootballPlayer> jets = new Team<>("New York Jets");
        Team<FootballPlayer> bills = new Team<>("Buffalo Bills");
        Team<FootballPlayer> dolphins = new Team<>("Miami Dolphins");
        Team<BaseballPlayer> redSox = new Team<>("Boston Red Sox");

        //patriots.gameResult(jets, 21, 14);
//        patriots.gameResult(bills, 23, 17);
//        jets.gameResult(dolphins, 24, 12);

        footballLeague.add(patriots);
        footballLeague.add(jets);
        footballLeague.add(bills);
        footballLeague.add(dolphins);
        // cannot add baseball team to football league
        // incompatible types
        //footballLeague.add(redSox);

        footballLeague.showLeagueTable();
    }
}
