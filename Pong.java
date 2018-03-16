package Pong;

import javax.swing.*;

public class Pong extends JPanel {

    private String player1, player2;
    private int score1;
    private int score2;

    /**
     * Creates a new Pong object which stores the names of the two player and their respective scores
     */
    public Pong() {
        player1 = JOptionPane.showInputDialog("Enter player 1: ");
        player2 = JOptionPane.showInputDialog("Enter player 2: ");
        score1 = 0;
        score2 = 0;
    }

    /**
     * Gets the name of player 1
     * @return    Player 1's name
     */
    public String getPlayer1() {
        return player1;
    }

    /**
     * Gets the name of player 2
     * @return    Player 2's name
     */
    public String getPlayer2() {
        return player2;
    }

    /**
     * Gets player 1's score
     * @return    the score
     */
    public int getScore1() {
        return score1;
    }

    /**
     * Gets player 2's score
     * @return    the score
     */
    public int getScore2() {
        return score2;
    }

    /**
     * Sets player 1's new score
     */
    public void player1Scored() {
        score1++;
    }

    /**
     * Sets player 2's new score
     */
    public void player2Scored() {
        score2++;
    }

}
