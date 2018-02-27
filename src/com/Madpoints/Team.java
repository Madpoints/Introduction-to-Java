package com.Madpoints;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is now on the " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void gameResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            System.out.println("Won vs " + opponent.getName());
            won++;
        } else if (ourScore < theirScore) {
            System.out.println("Lost vs " + opponent.getName());
            lost++;
        } else {
            System.out.println("Tied vs " + opponent.getName());
            tied++;
        }
        played++;
        if (opponent != null) {
            opponent.gameResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won - lost) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
