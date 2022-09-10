package ru.mirea.task10;
import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        // Task 1
        String inputString;
        System.out.println("[Задание 1]");
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        inputString = sc.nextLine();
        Palindrome p = new Palindrome();
        if (p.isPalindrome(inputString) == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        // Task 2
        int intInput;
        System.out.println("[Задание 2]");
        System.out.println("Введите целое число: ");
        intInput = sc.nextInt();
        SimpleNumbers s = new SimpleNumbers();
        ArrayList<Integer> result = s.getSimples(intInput);
        System.out.println(result.toString());
        // Task 3
        int a, b;
        System.out.println("[Задание 3]");
        System.out.println("Введите 1 целое число (Количество нулей): ");
        a = sc.nextInt();
        System.out.println("Введите 2 целое число (Количество единиц): ");
        b = sc.nextInt();
        OneAndZero o = new OneAndZero();
        int result1 = o.getOneZero(a, b);
        System.out.println(result1);
    }
}
