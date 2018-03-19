package Pong;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    private static final int HEIGHT = 700;
    private static final int WIDTH = 700;
    private static final int STARTING_POINT = (HEIGHT/2) - 50; // 50 is half the size of the Paddles


    public static void main(String[] args) {

        // Create the frame
        JFrame frame = new JFrame("Pong");
        Paddle paddle1 = new Paddle(5, STARTING_POINT, "left");
        Paddle paddle2 = new Paddle(675, STARTING_POINT, "right");
        Ball ball = new Ball(400, 400);
        frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
        frame.add(ball);
        frame.add(paddle1);
        frame.add(paddle2);

        frame.setVisible(true);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
}
