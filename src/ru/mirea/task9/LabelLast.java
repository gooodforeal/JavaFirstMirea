package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;



public class LabelLast extends JLabel {
    LabelLast(String text) {
        String tmp = "Last scorer: " + "N/A";
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Arial", Font.PLAIN, 30));
        this.setText(tmp);
    }
    public void changeText(String lastScorer) {
        String tmp = "Last scorer: " + lastScorer;
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Arial", Font.PLAIN, 30));
        this.setText(tmp);
    }
}