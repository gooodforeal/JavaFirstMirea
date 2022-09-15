package ru.mirea.task18;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String FIO, INN;
        System.out.println("-----~WELCOME TO SHOP~-----");
        System.out.print("[+] Input your FIO: ");
        FIO = sc.nextLine();
        try {
            System.out.print("[+] Input your INN: ");
            INN = sc.nextLine();
            new Registration(FIO, INN);
        }
        catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
