package ru.mirea.task10;


public class OneAndZero {
    public int getOneZero(int a, int b) {
        if (a == 0 & b != 0) {
            return 1;
        }
        else if (a == 1 & b != 0) {
            return b + 1;
        }
        else if (a > 1 & b == 0) {
            return 0;
        }
        else {
            return getOneZero(a - 1, b - 1) + getOneZero(a, b - 1);
        }
    }
}
