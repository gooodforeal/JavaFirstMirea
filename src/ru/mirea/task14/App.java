package ru.mirea.task14;


public class App {
    public static void main(String[] args) {
        // Stack
        StackGame sG = new StackGame();
        sG.playGame();
        // Queue
        QueueGame qG = new QueueGame();
        qG.playGame();
        // Deque
        DequeGame dG = new DequeGame();
        dG.playGame();
        // Linked list
        DoubleListGame dLg = new DoubleListGame();
        dLg.playGame();
    }
}