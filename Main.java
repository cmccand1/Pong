package Pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import static java.awt.event.KeyEvent.*;

public class Main {

    private static final int HEIGHT = 800;
    private static final int WIDTH = 800;


    public static void main(String[] args) {

        // Create the frame
        JFrame frame = new JFrame("Pong");
        Paddle paddle1 = new Paddle(5, 345);
        frame.add(paddle1);
        //Paddle paddle2 = new Paddle(775, 345);
        //frame.add(paddle2);

        frame.setVisible(true);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
}
