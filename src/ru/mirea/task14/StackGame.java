package ru.mirea.task14;
import java.util.Stack;

public class StackGame {
    private int[] a1 = {9, 8, 7, 6, 5};
    private int[] a2 = {4, 3, 2, 1, 0};
    private Stack<Integer> arr1 = new Stack<Integer>();
    private Stack<Integer> arr2 = new Stack<Integer>();
    public StackGame() {
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
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);
            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
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
