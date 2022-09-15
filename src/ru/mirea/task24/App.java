package ru.mirea.task24;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        // Variables
        String inputIP;
        IPHandler ipHandler = new IPHandler();
        Scanner sc = new Scanner(System.in);
        // Getting input
        System.out.print("[+] Input your ip: ");
        inputIP = sc.nextLine();
        // Checking
        if (ipHandler.isValid(inputIP)) {
            System.out.println("[+] Your ip is valid!");
        } else {
            System.out.println("[+] Your ip is invalid!");
        }
    }
}
