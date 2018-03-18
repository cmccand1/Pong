package Pong;

import javax.swing.*;

public class Main {

    private static final int HEIGHT = 800;
    private static final int WIDTH = 800;


    public static void main(String[] args) {

        // Create the frame
        JFrame frame = new JFrame("Pong");
        Paddle paddle1 = new Paddle(5, 345, "left");
        Paddle paddle2 = new Paddle(775, 345, "right");
        frame.add(paddle1);
        frame.add(paddle2);
        //System.out.println(Paddle.getPaddles().size());

        frame.setVisible(true);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
}
