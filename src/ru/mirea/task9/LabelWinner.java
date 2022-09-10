package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;



public class LabelWinner extends JLabel {
    LabelWinner(String winner) {
        String tmp = "Winner: " + winner;
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Arial", Font.PLAIN, 40));
        this.setText(tmp);
    }
    public void changeText(String winner) {
        String tmp = "Winner: " + winner;
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Arial", Font.PLAIN, 40));
        this.setText(tmp);
    }
}