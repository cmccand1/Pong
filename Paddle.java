package Pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.*;

public class Paddle extends JComponent {

    private int xPos;
    private int yPos;
    private Paddle p;

    /**
     * Creates a new Paddle object with a default centered position
     */
    public Paddle(int x, int y) {
        xPos = x;
        yPos = y;
        addKeyListener(listener);
        setFocusable(true);
    }

    /**
     * Paints the Paddle object
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        final int PADDLE_WIDTH = 20;
        final int PADDLE_HEIGHT = 110;
        g.fillRect(xPos, yPos, PADDLE_WIDTH, PADDLE_HEIGHT);
        System.out.println("paintComponent() called on Paddle.");
    }


    KeyListener listener = new PaddleListener();
    class PaddleListener implements KeyListener {

        // Specify the Paddle behavior
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == VK_DOWN) {
                System.out.println("PaddleListener called.");
                moveDown();
            } else if (e.getKeyCode() == VK_UP) {
                System.out.println("PaddleListener called.");
                moveUp();
            } else if (e.getKeyCode() == VK_LEFT) {
                System.out.println("PaddleListener called.");
                moveDown();
            } else if (e.getKeyCode() == VK_RIGHT) {
                System.out.println("PaddleListener called.");
                moveUp();
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {}

        @Override
        public void keyTyped(KeyEvent e) {}
    }


    /**
     * Moves the Paddle object up by a pre-specified amount and then repaints it
     */
    public void moveUp() {
        System.out.println("moveUp() called.");
        yPos -= 35;
        System.out.println("Y = " + paddleY() + "\n");
        repaint();
    }

    /**
     * Moves the Paddle object down by a pre-specified amount and then repaints it
     */
    public void moveDown() {
        System.out.println("moveDown() called.");
        yPos += 35;
        System.out.println("Y = " + paddleY() + "\n");
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
