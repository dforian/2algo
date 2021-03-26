package com.codecool;

public class Player implements Comparable<Player> {
    public String name;
    public int score = 0;

    @Override
    public int compareTo(Player o) {
        return o.score - score;
    }

    @Override
    public String toString() {
        return "\""+name+"\"";
    }
}
