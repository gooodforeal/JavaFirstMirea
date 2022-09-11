package ru.mirea.task15;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class App {
    static void fileWrite(String s){
        try {
            FileWriter fW = new FileWriter("src/ru/mirea/task15/file.txt");
            fW.write(s);
            fW.close();
        }
        catch (IOException ex){
            System.out.println("Ошибка открытия файла!");
        }
    }
    static void fileReWrite(String s){
        try {
            FileWriter fW = new FileWriter("src/ru/mirea/task15/file.txt");
            fW.write(s);
            fW.close();
        }
        catch (IOException ex){
            System.out.println("Ошибка открытия файла!");
        }
    }
    static void filePrint(){
        try {
            FileReader fR = new FileReader("src/ru/mirea/task15/file.txt");
            int ch;
            while ((ch = fR.read()) != -1) {
                System.out.print((char)ch);
            }
            fR.close();
        }
        catch (IOException ex){
            System.out.println("Ошибка открытия файла!");
        }
    }
    static void fileAppend(String s){
        try {
            File file = new File("src/ru/mirea/task15/file.txt");
            FileWriter fr = new FileWriter(file, true);
            fr.write(s);
            fr.close();
        }
        catch (IOException ex){
            System.out.println("Ошибка открытия файла!");
        }
    }
    // Main
    public static void main(String[] args) {
        // Variables
        String inputString, inputString2, inputString3;
        Scanner sc = new Scanner(System.in);
        // Write
        System.out.println("[+] Введите что записать в файл: ");
        inputString = sc.nextLine();
        fileWrite(inputString);
        System.out.print("[+] Текущие данные в файле: ");
        filePrint();
        System.out.println();
        // Append
        System.out.println("[+] Введите что добавить в файл: ");
        inputString2 = sc.nextLine();
        fileAppend(inputString2);
        System.out.print("[+] Текущие данные в файле: ");
        filePrint();
        System.out.println();
        // Rewrite
        System.out.println("[+] Введите на что заменить в файле: ");
        inputString3 = sc.nextLine();
        fileReWrite(inputString3);
        System.out.print("[+] Текущие данные в файле: ");
        filePrint();
    }
}
