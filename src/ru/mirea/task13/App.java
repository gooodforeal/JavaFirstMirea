package ru.mirea.task13;
import java.util.*;


public class App {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("===== ArrayList =====");
        arrayList.add(2);
        System.out.println("[+] Your list: " + arrayList.toString());
        arrayList.add(7);
        System.out.println("[+] Your list: " + arrayList.toString());
        arrayList.add(3);
        System.out.println("[+] Your list: " + arrayList.toString());
        arrayList.add(4);
        System.out.println("[+] Your list: " + arrayList.toString());
        arrayList.add(1);
        System.out.println("[+] Your list: " + arrayList.toString());
        arrayList.remove(0);
        System.out.println("[+] Your list: " + arrayList.toString());
        if (arrayList.isEmpty()) {
            System.out.println("[+] Your list is empty!");
        }
        else {
            System.out.println("[+] Your list is not empty!");
        }
        System.out.println("[+] Your list size: " + arrayList.size());
        System.out.println("[+] ArrayList 2 element: " + arrayList.get(2));
        arrayList.set(0, 111);
        System.out.println("[+] Your list: " + arrayList.toString());
        System.out.println("[+] Sublist from 1 to 4 element: " + arrayList.subList(1, 4));
        Collections.sort(arrayList);
        System.out.println("[+] Your list: " + arrayList.toString());
        arrayList.clear();
        System.out.println("[+] Your list: " + arrayList.toString());
        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("===== LinkedList =====");
        linkedList.add(2);
        System.out.println("[+] Your list: " + linkedList.toString());
        linkedList.add(7);
        System.out.println("[+] Your list: " + linkedList.toString());
        linkedList.add(3);
        System.out.println("[+] Your list: " + linkedList.toString());
        linkedList.add(4);
        System.out.println("[+] Your list: " + linkedList.toString());
        linkedList.add(1);
        System.out.println("[+] Your list: " + linkedList.toString());
        linkedList.remove(0);
        System.out.println("[+] Your list: " + linkedList.toString());
        if (linkedList.isEmpty()) {
            System.out.println("[+] Your list is empty!");
        }
        else {
            System.out.println("[+] Your list is not empty!");
        }
        System.out.println("[+] Your list size: " + linkedList.size());
        System.out.println("[+] ArrayList 2 element: " + linkedList.get(2));
        linkedList.set(0, 111);
        System.out.println("[+] Your list: " + linkedList.toString());
        System.out.println("[+] Sublist from 1 to 4 element: " + linkedList.subList(1, 4));
        Collections.sort(linkedList);
        System.out.println("[+] Your list: " + linkedList.toString());
        linkedList.clear();
        System.out.println("[+] Your list: " + linkedList.toString());
        // My list
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        System.out.println("===== MyArrayList =====");
        myArrayList.add(1);
        System.out.println("[+] Your list: " + myArrayList.toString());
        myArrayList.add(4);
        System.out.println("[+] Your list: " + myArrayList.toString());
        myArrayList.add(3);
        System.out.println("[+] Your list: " + myArrayList.toString());
        myArrayList.add(2);
        System.out.println("[+] Your list: " + myArrayList.toString());
        myArrayList.add(7);
        System.out.println("[+] Your list: " + myArrayList.toString());
        myArrayList.add(9);
        System.out.println("[+] Your list: " + myArrayList.toString());
        myArrayList.remove(0);
        System.out.println("[+] Your list: " + myArrayList.toString());
        if (myArrayList.isEmpty()) {
            System.out.println("[+] Your list is empty!");
        }
        else {
            System.out.println("[+] Your list is not empty!");
        }
        System.out.println("[+] MyArrayList 2 element: " + myArrayList.get(2));
        System.out.println("[+] Your list size: " + myArrayList.size());
    }
}
