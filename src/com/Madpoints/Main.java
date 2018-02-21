package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        FootballPlayer teddyBruschi = new FootballPlayer("Teddy Bruschi");
        Team<FootballPlayer> patriots = new Team<>("New England Patriots");
        patriots.addPlayer(teddyBruschi);

        Team<BaseballPlayer> redSox = new Team<>("Boston Red Sox");
        BaseballPlayer davidOrtiz = new BaseballPlayer("David Ortiz");
        redSox.addPlayer(davidOrtiz);
        // cannot add to baseball team, not correct type
        //redSox.addPlayer(teddyBruschi);

        Team<SoccerPlayer> revolution = new Team<>("New England Revolution");
        SoccerPlayer wayneRooney = new SoccerPlayer("Wayne Rooney");
        revolution.addPlayer(wayneRooney);

    }
}
