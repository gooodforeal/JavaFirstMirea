package ru.mirea.task14;
import java.util.ArrayDeque;
import java.util.Deque;


public class DequeGame {
    private int[] a1 = {9, 8, 7, 6, 5};
    private int[] a2 = {4, 3, 2, 1, 0};
    private Deque<Integer> arr1 = new ArrayDeque<>();
    private Deque<Integer> arr2 = new ArrayDeque<>();
    public DequeGame() {
        for (int i = 0; i < 5; i++) {
            arr1.addLast(a1[i]);
            arr2.addLast(a2[i]);
        }
    }
    public void playGame() {
        int count = 0;
        boolean res = false;
        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.getFirst() > arr2.getFirst() || ((arr1.getFirst() == 0) && (arr2.getFirst() == 9))) {
                arr1.addLast(arr1.getFirst());
                arr1.addLast(arr2.getFirst());
            } else if (arr1.getFirst() < arr2.getFirst() || ((arr1.getFirst() == 9) && (arr2.getFirst() == 0))) {
                arr2.addLast(arr2.getFirst());
                arr2.addLast(arr1.getFirst());
            }
            arr1.removeFirst();
            arr2.removeFirst();
            if (arr1.peekFirst()  == null) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.peekFirst()  == null) {
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
