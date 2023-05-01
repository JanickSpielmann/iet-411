package ch.gibb.gameOfLife;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BooleanArrayDisplay extends JFrame {
    private int ROWS = GameOfLife.DIM1;
    private  int COLS = GameOfLife.DIM2;
    private static int count = 0;
    private JPanel[][] squares;

    public boolean[][] world;


    public BooleanArrayDisplay(boolean[][] world) {
        this.world = world;
        count++;
        setTitle(count+ " output");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(ROWS, COLS));

        // Create the 2D array of JPanels
        squares = new JPanel[ROWS][COLS];
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                squares[row][col] = new JPanel();
                add(squares[row][col]);
            }
        }

        // Set the background color of each JPanel based on the corresponding value in the boolean array
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (world[row][col]) {
                    squares[row][col].setBackground(Color.BLACK);
                } else {
                    squares[row][col].setBackground(Color.WHITE);
                }
            }
        }
        setSize(500, 500);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
