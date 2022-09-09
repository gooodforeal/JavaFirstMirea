package ru.mirea.task8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Animation extends JFrame{
    MyPanel panel;
    Animation(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements ActionListener{
    final int PANEL_WIDTH = 498;
    final int PANEL_HEIGHT = 366;
    private Image enemy;
    private Timer timer;
    private int i = 1;
    private String path = "C:\\Users\\23906\\Desktop\\Java\\src\\ru\\mirea\\task8\\" + i + ".jpg";
    MyPanel(){
        String tmp;
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        timer = new Timer(100, this);
        timer.start();
    }
    public void paint(Graphics g) {
        super.paint(g); // paint background
        Graphics2D g2D = (Graphics2D) g;
        enemy = new ImageIcon(path).getImage();
        g2D.drawImage(enemy, 0, 0, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switchPic();
        repaint();
    }
    public void switchPic() {
        if (this.i == 13) {
            this.i = 1;
        }
        else {
            this.i += 1;
        }
        this.path = "C:\\Users\\23906\\Desktop\\Java\\src\\ru\\mirea\\task8\\" + i + ".jpg";
    }
}