package ru.mirea.task26;
import java.util.Scanner;

public class CreditcardPaymentStrategy implements PaymentStrategy{
    private String cardNumber;
    public void pay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[+] Введите номер кредитной карты");
        this.cardNumber = sc.nextLine();
        System.out.println("Спасибо за покупку!");
    }
}
