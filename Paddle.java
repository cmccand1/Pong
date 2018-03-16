package Pong;

import javax.swing.*;
import java.awt.*;

public class Paddle extends JComponent {

    private final int paddleWidth = 20;
    private final int paddleHeight = 110;
    private int xPos;
    private int yPos;

    /**
     * Creates a new Paddle object with a default centered position
     */
    public Paddle() {
        xPos = 5;
        yPos = 345;
    }

    /**
     * Paints the Paddle object
     * @param g
     */
    public void paintComponent(Graphics g) {
        //g.drawRect(xPos, yPos, paddleWidth, paddleHeight);
        g.fillRect(xPos, yPos, paddleWidth, paddleHeight);
    }

    /**
     * Repaints the Paddle object with it's new (X,Y) coordinates
     * @param g
     */
    public void repaint(Graphics g) {
        //g.drawRect(xPos, yPos, paddleWidth, paddleHeight);
        g.fillRect(xPos, yPos, paddleWidth, paddleHeight);
    }

    /**
     * Moves the Paddle object up by a pre-specified amount and then repaints it
     */
    public void moveUp() {
        yPos -= 35;
        repaint();
    }

    /**
     * Moves the Paddle object down by a pre-specified amount and then repaints it
     */
    public void moveDown() {
        yPos += 35;
        repaint();
    }

    /**
     * Gets the Paddle object's X coordinate
     * @return    X coordinate
     */
    public int paddleX() {
        return xPos;
    }

    /**
     * Gets the Paddle object's Y coordinate
     * @return    Y coordinate
     */
    public int paddleY() {
        return yPos;
    }


}
