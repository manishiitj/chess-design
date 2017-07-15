package com.chess.player;

import java.util.Stack;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class Player {
    private String name;
    private Stack<Pair> history;
    private int wins;
    private int draws;
    private int totalMatches;

    public Player(String name, Stack<Pair> history) {
        this.name = name;
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Pair> getHistory() {
        return history;
    }

    public void setHistory(Stack<Pair> history) {
        this.history = history;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }
}
