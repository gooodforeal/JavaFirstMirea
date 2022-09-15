package ru.mirea.task23;


public class App {
    public static void main(String[] args) {
        // Objects
        Human ob1 = new Human(12, "Ben");
        Human ob2 = new Human(12, "Ben");
        Human ob3 = new Human(13, "Max");
        Human ob4 = new Human(14, "Kate");
        Human ob5 = new Human(14, "Kate");
        // 1 test
        System.out.println("[+] Test 1:");
        System.out.println("ob1=" + ob1.hashCode() + ", ob2=" + ob2.hashCode());
        if (ob1.hashCode() == ob2.hashCode()) {
            System.out.println("ob1 = ob2");
        }
        else {
            System.out.println("ob1 != ob2");
        }
        // 2 Test
        System.out.println("[+] Test 2:");
        System.out.println("ob3=" + ob3.hashCode() + ", ob3=" + ob3.hashCode());
        if (ob3.hashCode() == ob3.hashCode()) {
            System.out.println("ob3 = ob3");
        }
        else {
            System.out.println("ob3 != ob3");
        }
        // 3 Test
        System.out.println("[+] Test 3:");
        System.out.println("ob2=" + ob2.hashCode() + ", ob4=" + ob4.hashCode());
        if (ob2.hashCode() == ob4.hashCode()) {
            System.out.println("ob2 = ob4");
        }
        else {
            System.out.println("ob2 != ob4");
        }
        // 4 Test
        System.out.println("[+] Test 4:");
        System.out.println("ob5=" + ob5.hashCode() + ", ob4=" + ob4.hashCode());
        if (ob5.hashCode() == ob4.hashCode()) {
            System.out.println("ob5 = ob4");
        }
        else {
            System.out.println("ob5 != ob4");
        }
        // 5 Test
        System.out.println("[+] Test 5:");
        System.out.println("ob1=" + ob1.hashCode() + ", ob5=" + ob5.hashCode());
        if (ob1.hashCode() == ob5.hashCode()) {
            System.out.println("ob1 = ob5");
        }
        else {
            System.out.println("ob1 != ob5");
        }
    }
}
