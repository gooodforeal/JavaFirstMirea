package ru.mirea.task26;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private PaymentStrategy paymentStrategy;
    private ArrayList<String> books = new ArrayList<>();
    private ArrayList<String> pencils = new ArrayList<>();
    public Shop() {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("[+] Добро пожаловать в интернет магазин!");
        while (true) {
            printMenu();
            t = sc.nextInt();
            if (t == 1) {
                books.add("Книга");
            }
            else if (t == 2) {
                pencils.add("Карандаш");
            }
            else if (t == 3) {
                printChart();
            }
            else {
                break;
            }
        }
        if (books.isEmpty() & pencils.isEmpty()) {
            System.out.println("[+] Ваша корзина пуста! Приходите в другой раз!");
            return;
        }
        else {
            int p;
            printChart();
            printPaymentMenu();
            p = sc.nextInt();
            if (p == 1) {
                setPaymentStrategy(new CreditcardPaymentStrategy());
                pay();
            }
            else if (p == 2) {
                setPaymentStrategy(new WalletPaymentStrategy());
                pay();
            }
            else {
                return;
            }
        }
    }
    private void pay() {
        paymentStrategy.pay();
    }
    private void printPaymentMenu() {
        System.out.println("[+] Выберите способ оплаты:");
        System.out.println("1) Оплата кредитной картой");
        System.out.println("2) Оплата электронным кашельком");
        System.out.println("0) Выход");
    }
    private void setPaymentStrategy(PaymentStrategy p) {
        this.paymentStrategy = p;
    }
    private void printChart() {
        System.out.println("[I] Корзина: ");
        System.out.println("Книга: " + books.size());
        System.out.println("Карандаш: " + pencils.size());
    }
    private void printMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1) Чтобы добавить книгу в корзину");
        System.out.println("2) Чтобы добавить карандаш в корзину");
        System.out.println("3) Чтобы посмотреть корзину");
        System.out.println("0) Чтобы выйти из магазина и перейти к оформлению заказа");
    }
}
