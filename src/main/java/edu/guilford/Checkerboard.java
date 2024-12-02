package edu.guilford;

import java.awt.Color;

// your name goes here

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Checkerboard extends JFrame {

    public Checkerboard() {
        setTitle("Checkers");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // insert code here to create an 8x8 grid of Square

        setVisible(true);
    }

    class Square extends JPanel {
        public Square() {
            Border border = new LineBorder(Color.BLACK, 2);
            setBorder(border);
        }
    }
    public static void main(String[] args) {
        new Checkerboard();
    }
}