package ru.mirea.task13;


public class MyArrayList<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;
    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }
    public T get(int index) {
        return (T) array[index];
    }
    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);
    }
    public int size() {
        return pointer;
    }
    public boolean isEmpty() {
        if (pointer == 0) {
            return true;
        }
        return false;
    }
    public String toString() {
        String s = "";
        for (int i = pointer - 1; i >= 0; i--) {
            if (i == 0) {
                s += array[i];
            }
            else {
                s += array[i] + " ";
            }
        }
        return reverseString(s);
    }
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
