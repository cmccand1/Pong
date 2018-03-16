package Pong;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class Main {

    private static final int HEIGHT = 800;
    private static final int WIDTH = 800;

    public static void main(String[] args) {

        // Create the frame
        JFrame frame = new JFrame("Pong");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Create the Pong game and create the Paddles and the Ball
        Pong pong = new Pong();
        Paddle paddle1 = new Paddle();
        frame.add(paddle1);

        class PaddleListener implements KeyListener {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == VK_DOWN) {
                    paddle1.moveDown();
                }
                else if (e.getKeyCode() == VK_UP) {
                    paddle1.moveUp();
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyTyped(KeyEvent e) {}
        }

        KeyListener listener = new PaddleListener();
        paddle1.addKeyListener(listener);
        paddle1.setFocusable(true);

        frame.setVisible(true);
    }
}
