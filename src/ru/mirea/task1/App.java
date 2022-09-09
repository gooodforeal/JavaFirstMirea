package ru.mirea.task1;
import java.util.Random;
import java.util.Scanner;


public class App {
    int getFactorial(int number) {
        int res = 1;
        for (int i = 1; i < number + 1; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        // 3 задание
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arraySum = 0;
        System.out.println("ЗАДАНИЕ [3]:");
        // Цикл for
        for (int i = 0; i < array.length; i++) {
            arraySum = arraySum + array[i];
        }
        System.out.println("[-] Сумма(Цикл for)" + " " + arraySum + ";");
        arraySum = 0;
        // Цикл While
        int i = 0;
        while (i < array.length) {
            arraySum = arraySum + array[i];
            i++;
        }
        System.out.println("[-] Сумма(Цикл while)" + " " + arraySum + ";");
        arraySum = 0;
        // Цикл do...while
        i = 0;
        do {
            arraySum = arraySum + array[i];
            i++;
        }
        while (i < array.length);
        System.out.println("[-] Сумма(Цикл do...while)" + " " + arraySum + ";");
        // 4 задание
        System.out.println("ЗАДАНИЕ [4]:");
        String inputString;
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            System.out.println("[+] Введите строку: ");
            inputString = sc.nextLine();
            System.out.println("[-] Ваша строка: " + inputString);
        }
        // 5 задание
        System.out.println("ЗАДАНИЕ [5]:");
        float harmonicTemp = 1;
        System.out.print("[-] Первые 10 членов гармонического ряда: ");
        for (int j = 1; j < 10 + 1; j++) {
            System.out.print(harmonicTemp / j + " ");
        }
        System.out.println();
        // 6 задание
        System.out.println("ЗАДАНИЕ [6]:");
        int[] randomIntArray = new int[10];
        int randomIntTemp;
        Random rnd = new Random();
        System.out.print("[-] Рандомные числа: ");
        for (int j = 0; j < randomIntArray.length; j++) {
            if (j % 2 == 0) {
                randomIntTemp = (int) (Math.random() * 100);
            }
            else {
                randomIntTemp = rnd.nextInt(100);

            }
            randomIntArray[j] = randomIntTemp;
            System.out.print(randomIntArray[j] + " ");
        }
        System.out.println();
        // 7 задание
        System.out.println("ЗАДАНИЕ [7]:");
        System.out.print("[-] Факториалы (1-10): ");
        App factorialObject = new App();
        for (int j = 1; j < 10 + 1; j++) {
            System.out.print(factorialObject.getFactorial(j) + " ");
        }
    }
};
