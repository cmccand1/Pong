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
        paddles.add(this);
        if (whichPaddle.equals("left")) {
            addKeyListener(leftListener);
            setFocusable(true);
        }
        else if (whichPaddle.equals("right")) {
            addKeyListener(rightListener);
            setFocusable(true);
        }
    }



    /**
     * Paints the Paddle object
     * @param g the Graphics object
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Paddle paddle : paddles) {
            paddle.drawPaddles(g);
        }
        
    }

    public void drawPaddles(Graphics g) {
        final int PADDLE_WIDTH = 20;
        final int PADDLE_HEIGHT = 110;
        g.fillRect(xPos, yPos, PADDLE_WIDTH, PADDLE_HEIGHT);
    }


    KeyListener leftListener = new LeftPaddleListener();
    KeyListener rightListener = new RightPaddleListener();
    class LeftPaddleListener implements KeyListener {

        // Specify the Paddle behavior
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == VK_DOWN) {
                moveDown();
            } else if (e.getKeyCode() == VK_UP) {
                moveUp();
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {}

        @Override
        public void keyTyped(KeyEvent e) {}
    }

    class RightPaddleListener implements KeyListener {

        // Specify the Paddle behavior
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == VK_LEFT) {
                moveDown();
            } else if (e.getKeyCode() == VK_RIGHT) {
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
    private void moveUp() {
        yPos -= 35;
        repaint();
    }

    /**
     * Moves the Paddle object down by a pre-specified amount and then repaints it
     */
    private void moveDown() {
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

    public static ArrayList<Paddle> getPaddles() {
        return paddles;
    }


}
