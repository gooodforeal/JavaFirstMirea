package ru.mirea.task19;


public class RightTriangle {
    private int A;
    private int B;
    private int C;
    RightTriangle(int a, int b, int c) throws TriangleException {
        if (a == 90 & (b + c) == 90) {
            A = a;
            B = b;
            C = c;
        }
        else if (b == 90 & (a + c) == 90) {
            A = a;
            B = b;
            C = c;
        }
        else if (c == 90 & (a + b) == 90) {
            A = a;
            B = b;
            C = c;
        }
        else {
            throw new TriangleException("Wrong angles for right triangle!");
        }
    }
}
