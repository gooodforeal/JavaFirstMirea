package ru.mirea.task11;
import ru.mirea.task9.Label;
import ru.mirea.task9.LabelLast;
import ru.mirea.task9.LabelWinner;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class Frame3 extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final Font aFont = new Font("Arial", Font.PLAIN, 12);
    private final Font iFont = new Font("Impact", Font.PLAIN, 12);
    private final Font gFont = new Font("Georgia", Font.PLAIN, 12);
    private String font;
    private String color;
    Frame3(){
        // Settings
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(null);
        // Text
        JTextArea textArea = new JTextArea();
        textArea.setBounds(0, 200, WIDTH, 50);
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.GRAY);
        add(textArea);
        // MenuBar
        JMenuBar menuBar = new JMenuBar();
        // Menu 1
        JMenu fontMenu = new JMenu("Fonts");
        JMenuItem arialBtn = new JMenuItem("Arial");
        arialBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(aFont);
            }
        });
        JMenuItem impactBtn = new JMenuItem("Impact");
        impactBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(iFont);
            }
        });
        JMenuItem georgiaBtn = new JMenuItem("Georgia");
        georgiaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(gFont);
            }
        });
        fontMenu.add(arialBtn);
        fontMenu.add(impactBtn);
        fontMenu.add(georgiaBtn);
        menuBar.add(fontMenu);
        // Menu 2
        JMenu colorMenu = new JMenu("Colours");
        JMenuItem blueBtn = new JMenuItem("Blue");
        blueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });
        JMenuItem greenBtn = new JMenuItem("Green");
        greenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.GREEN);
            }
        });
        JMenuItem redBtn = new JMenuItem("Red");
        redBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        colorMenu.add(blueBtn);
        colorMenu.add(greenBtn);
        colorMenu.add(redBtn);
        menuBar.add(colorMenu);
        // Menu bar add
        setJMenuBar(menuBar);
    }
    public void paint(Graphics g) {
        super.paint(g); // paint background
    }
}

