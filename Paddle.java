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
    private String whichPaddle;
    private static ArrayList<Paddle> paddles = new ArrayList<>();

    /**
     * Creates a new Paddle object with a default centered position
     */
    public Paddle(int x, int y, String leftOrRightPaddle) {
        xPos = x;
        yPos = y;
        whichPaddle = leftOrRightPaddle;
        addKeyListener(listener);
        setFocusable(true);
        paddles.add(this);
    }


    /**
     * Iterates through the collection of Paddle objects and calls drawPaddle() on each one
     * @param g the Graphics object
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Paddle p : paddles) {
            p.drawPaddle(g);
        }
        
    }

    /**
     * Draws a paddle
     * @param g
     */
    private void drawPaddle(Graphics g) {
        final int PADDLE_WIDTH = 20;
        final int PADDLE_HEIGHT = 100;
        g.fillRect(xPos, yPos, PADDLE_WIDTH, PADDLE_HEIGHT);
    }


    KeyListener listener = new PaddleListener();

    class PaddleListener implements KeyListener {

        // Specify the Paddle behavior
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == VK_UP) {
                for (Paddle p : getPaddles()) {
                    if (p.getWhichPaddle().equals("left") && p.isInBounds("up")) {
                        p.moveUp();
                    }
                }
            } else if (e.getKeyCode() == VK_DOWN) {
                for (Paddle p : getPaddles()) {
                    if (p.getWhichPaddle().equals("left") && p.isInBounds("down")) {
                        p.moveDown();
                    }
                }
            } else if (e.getKeyCode() == VK_LEFT) {
                for (Paddle p : getPaddles()) {
                    if (p.getWhichPaddle().equals("right") && p.isInBounds("down")) {
                        p.moveDown();
                    }
                }
            } else if (e.getKeyCode() == VK_RIGHT) {
                for (Paddle p : getPaddles()) {
                    if (p.getWhichPaddle().equals("right") && p.isInBounds("up")) {
                        p.moveUp();
                    }
                }
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
    private void moveUp() {
        yPos -= 20;
        int i = 1;
        for (Paddle p : getPaddles()) {
            p.repaint();
            System.out.println("p" + i + " Y-coord: " + p.paddleY());
            i++;
        }
        System.out.println("-----------------------------");
    }

    /**
     * Moves the Paddle object down by a pre-specified amount and then repaints it
     */
    private void moveDown() {
        yPos += 20;
        int i = 1;
        for (Paddle p : getPaddles()) {
            p.repaint();
            System.out.println("p" + i + " Y-coord: " + p.paddleY());
            i++;
        }
        System.out.println("-----------------------------");
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
    private int paddleY() {
        return yPos;
    }

    /**
     * Gets the collection of Paddles
     * @return    An array list of Paddle objects
     */
    private static ArrayList<Paddle> getPaddles() {
        return paddles;
    }

    /**
     * Gets whether the Paddle object is the left or right Paddle
     * @return    'Left' if left Paddle, 'Right' if right Paddle
     */
    private String getWhichPaddle() {
        return whichPaddle;
    }

    /**
     * Checks if the Paddles are in the Frame
     * @return    true if in-bounds, false otherwise
     */
    private boolean isInBounds(String moveDirection) {
        if (moveDirection.equals("down")) {
            return this.paddleY() <= 560;
        } else if (moveDirection.equals("up")) {
            return this.paddleY() >= 20;
        } else {
            return false;
        }
    }


}
