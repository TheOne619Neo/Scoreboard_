package com.theOne.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Scoreboard class manages a list of players and keeps track of the top 10 scores.
 */
public class Scoreboard {
    private List<Player> players = new ArrayList<>();


    /**
     * Adds a player to the scoreboard. If the list exceeds 10 players,
     * the player with the lowest score is removed.
     * @param player The player to add.
     */
    public void addPlayer(Player player) {
        players.add(player);
        Collections.sort(players);                       // Sort players by score in descending order
        if (players.size() > 10) {
            players.remove(players.size() - 1);   // Remove the player with the lowest score
        }
    }

    /**
     * Returns the list of top players.
     * @return A list of the top players.
     */
    public List<Player> getTopPlayers() {
        return players;
    }
}