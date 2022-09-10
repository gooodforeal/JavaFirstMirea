package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame{
    final int WIDTH = 600;
    final int HEIGHT = 600;
    private int leftPoints, rightPoints;
    private String lastScorer = "N/A";
    private String winner = "DRAW";
    private Timer timer;
    private String leftName = "Мадрид";
    private String rightName = "Милан";
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        // Madrid button
        JButton leftBtn = new JButton();
        leftBtn.setText(leftName);
        add(leftBtn, BorderLayout.WEST);
        // Milan button
        JButton rightBtn = new JButton();
        rightBtn.setText(rightName);
        add(rightBtn, BorderLayout.EAST);
        // Score
        Label score = new Label(leftPoints, rightPoints);
        add(score, BorderLayout.CENTER);
        // Last scorer
        LabelLast lastScore = new LabelLast(lastScorer);
        add(lastScore, BorderLayout.SOUTH);
        // Winner
        LabelWinner winnerLabel = new LabelWinner(winner);
        add(winnerLabel, BorderLayout.NORTH);
        // Action 1
        leftBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leftPoints += 1;
                score.changeText(leftPoints, rightPoints);
                lastScore.changeText(leftName);
                if (leftPoints > rightPoints) {
                    winnerLabel.changeText(leftName);
                }
                else if (leftPoints == rightPoints) {
                    winnerLabel.changeText("DRAW");
                }
                else {
                    winnerLabel.changeText(rightName);
                }
            }
        });
        // Action 2
        rightBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rightPoints += 1;
                score.changeText(leftPoints, rightPoints);
                lastScore.changeText(rightName);
                if (leftPoints > rightPoints) {
                    winnerLabel.changeText(leftName);
                }
                else if (leftPoints == rightPoints) {
                    winnerLabel.changeText("DRAW");
                }
                else {
                    winnerLabel.changeText(rightName);
                }
            }
        });

    }
    public void paint(Graphics g) {
        super.paint(g); // paint background
    }
}
