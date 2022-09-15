package ru.mirea.task20;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, day, hour, min;
        long millis;
        // Task1
        System.out.print("[+] Input year: "); year = sc.nextInt();
        System.out.print("[+] Input month: "); month = sc.nextInt();
        System.out.print("[+] Input day: "); day = sc.nextInt();
        System.out.print("[+] Input hour: "); hour = sc.nextInt();
        System.out.print("[+] Input minute: "); min = sc.nextInt();
        //millis =
        Date date = new Date();
        Calendar calendar = new GregorianCalendar(year, month, day);
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, min);
        System.out.println("[+] Task1: Введенная дата");
        System.out.println(calendar.getTime());
        // Task2
        millis = 1662550000000L;
        Date date1 = new Date(millis);
        System.out.println("[+] Task2: Гусев Тимофей");
        System.out.println("Дата получения: " + date1.toString());
        System.out.println("Дата сдачи: " + date.toString());
    }
}
