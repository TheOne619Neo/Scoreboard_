package com.theOne.test;  //fix

/**
 * The Player class represents a player with a name and a score.
 * It implements Comparable to allow sorting by score in descending order.
 */
public class Player implements Comparable<Player> {
    private String name;
    private int score;


    /**
     * Constructor to initialize the player's name and score.
     * @param name The name of the player.
     * @param score The score of the player.
     */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }


    // Getter for the player's name
    public String getName()   {
        return name;
    }


    // Getter for the player's score
    public int getScore() {
        return score;
    }


    /**
     * Compares this player to another player based on score.
     * @param other The other player to compare to.
     * @return A negative integer, zero, or a positive integer as this player's score
     *         is greater than, equal to, or less than the other player's score.
     */
    @Override
    public int compareTo(Player other) {
        return Integer.compare(other.score, this.score);    // Descending order
    }
}