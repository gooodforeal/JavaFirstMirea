package ru.mirea.task14;
import java.util.LinkedList;
import java.util.Queue;


public class QueueGame {
    private int[] a1 = {9, 8, 7, 6, 5};
    private int[] a2 = {4, 3, 2, 1, 0};
    private Queue<Integer> arr1 = new LinkedList<>();
    private Queue<Integer> arr2 = new LinkedList<>();
    public QueueGame() {
        for (int i = 0; i < 5; i++) {
            arr1.add(a1[i]);
            arr2.add(a2[i]);
        }
    }
    public void playGame() {
        int count = 0;
        boolean res = false;
        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.peek() > arr2.peek() || ((arr1.peek() == 0) && (arr2.peek() == 9))) {
                arr1.offer(arr1.peek());
                arr1.offer(arr2.peek());
            } else if (arr1.peek() < arr2.peek() || ((arr1.peek() == 9) && (arr2.peek() == 0))) {
                arr2.offer(arr2.peek());
                arr2.offer(arr1.peek());
            }
            arr1.remove();
            arr2.remove();
            if (arr1.peek() == null) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.peek() == null) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) {
            System.out.println("Botva!");
        }
    }
}
