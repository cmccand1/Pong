package Pong;

import javax.swing.*;
import java.awt.*;

public class Ball extends JComponent {

    private static final int DIAMETER = 20;
    private int SPEED; // TODO: make field final
    private int xPos;
    private int yPos;

    /**
     * Constructor for the Ball object
     * @param x    the Ball's X coordinate
     * @param y    the Ball's Y coordinate
     */
    public Ball(int x, int y) {
        xPos = x;
        yPos = y;
    }

    /**
     * Paints the Ball object
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.drawOval(xPos, yPos, DIAMETER, DIAMETER); // the pong ball
        g.fillOval(xPos, yPos, DIAMETER, DIAMETER);
    }

    /**
     * Gets the Ball's current X coordinate
     * @return    X coordinate
     */
    private int getBallX() {
        return xPos;
    }

    /**
     * Gets the Ball's current Y coordinate
     * @return    Y coordinate
     */
    private int getBallY() {
        return yPos;
    }

    /**
     * Sets the Ball's X coordinate
     * @param x    the desired X coordinate
     */
    public void setBallX(int x) {
        xPos = x;
    }

    /**
     * Sets the Ball's Y coordinate
     * @param y    the desired Y coordinate
     */
    public void setBallY(int y) {
        yPos = y;
    }



}
