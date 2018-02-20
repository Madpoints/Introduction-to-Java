package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        FootballPlayer teddyBruschi = new FootballPlayer("Teddy Bruschi");
        Team patriots = new Team("Patriots");
        patriots.addPlayer(teddyBruschi);
    }
}
