package ru.mirea.task10;
import java.util.ArrayList;


public class SimpleNumbers {
    public ArrayList<Integer> getSimples(int n) {
        ArrayList<Integer> simples = new ArrayList<Integer>();
        int d = 2;
        while (d * d <= n) {
            if (n % d == 0) {
                simples.add(d);
                n = n / d;
            }
            else {
                d += 1;
            }
        }
        if (n > 1) {
            simples.add(n);
        }
        return simples;
    }
}
