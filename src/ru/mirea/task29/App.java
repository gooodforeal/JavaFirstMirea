package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;


public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Creating obj
        CurrencyInfo myCurrency = new CurrencyInfo(17);
        // Serialize
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\23906\\Desktop\\Java\\src\\ru\\mirea\\task29\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        // Saving to file
        objectOutputStream.writeObject(myCurrency);
        // Closing
        objectOutputStream.close();
        // Deserialize
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\23906\\Desktop\\Java\\src\\ru\\mirea\\task29\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // Reading
        CurrencyInfo myCurrencyDeserialized = (CurrencyInfo) objectInputStream.readObject();
        // Printing
        System.out.println(myCurrencyDeserialized);
    }
}
