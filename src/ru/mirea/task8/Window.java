package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Window extends JFrame{
    class MyImage extends JComponent {
        private String imagePath;
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image image = new ImageIcon(imagePath).getImage();
            g.drawImage(image, 0, 0, null);
        }
        public void addPath(String path) {
            this.imagePath = path;
        }
    }
    class MyFigure extends JComponent {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Random rnd = new Random();
            for (int i = 0; i < 20; i++) {
                boolean tmp = rnd.nextBoolean();
                if (tmp) {
                    Circle objectCircle = new Circle();
                    g.drawOval(objectCircle.getX1(), objectCircle.getY1(), objectCircle.getRadius(), objectCircle.getRadius());
                    g.setColor(objectCircle.getColor());
                }
                else {
                    Rectangle obRect = new Rectangle();
                    g.drawRect(obRect.getX1(), obRect.getY1(), obRect.getWidth(), obRect.getHeight());
                    g.setColor(obRect.getColor());
                }
            }
        }
    }
    class MyAnimation extends JComponent {
        private String path;
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image image = new ImageIcon(path).getImage();
            g.drawImage(image, 0, 0, null);
        }
        public void setPath(String path) {
            this.path = path;
        }
    }

    public Window(String windowTitle) {
        super(windowTitle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1920, 1080);
        setVisible(true);
    }
    public void drawImage(String imagePath) {
        MyImage myImage1 = new MyImage();
        myImage1.addPath(imagePath);
        add(myImage1);
    }
    public void drawFigures() {
            MyFigure myFigure = new MyFigure();
            add(myFigure);
    }
}
