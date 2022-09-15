package ru.mirea.task22;


public interface Chair {
    int size = 0;
    String color = "";
    void specialCharacteristic();
    int getSize();
    void setSize(int size);
    String getColor();
    void  setColor(String color);
    String toString();
}
