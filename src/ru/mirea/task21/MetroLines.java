package ru.mirea.task21;

import java.util.ArrayList;

public class MetroLines {
    private ArrayList<String> array = new ArrayList<>();
    public MetroLines() {
        array.add("Cокольническая");
        array.add("Замоскворецкая");
        array.add("Арбатско-Покровская");
        array.add("Филевская");
        array.add("Кольцевая");
        array.add("Калужско-Рижская");
        array.add("Таганско-Краснопресненская");
        array.add("Калининская");
        array.add("Сурпуховско-Тимирязевская");
        array.add("Люблинская");
        array.add("Каховская");
        array.add("Бутовская");
    }
    public void printList(boolean flag) {
        if (flag) {
            System.out.println("[+] Нечетные");
            for (int i = 0; i < array.size(); i++) {
                if (i % 2 == 1) {
                    System.out.print(array.get(i) + " ");
                }
            }
        }
        else {
            System.out.println("[+] Четные");
            for (int i = 0; i < array.size(); i++) {
                if (i % 2 == 0) {
                    System.out.print(array.get(i) + " ");
                }
            }
        }
        System.out.println();
    }
}
