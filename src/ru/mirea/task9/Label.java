package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;


public class Label extends JLabel {
    Label(int leftScore, int rightScore) {
        String tmp = "Result: " + leftScore + "X" + rightScore;
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Arial", Font.PLAIN, 50));
        this.setText(tmp);
    }
    public void changeText(int leftScore, int rightScore) {
        String tmp = "Result: " + leftScore + "X" + rightScore;
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Arial", Font.PLAIN, 50));
        this.setText(tmp);
    }
}
