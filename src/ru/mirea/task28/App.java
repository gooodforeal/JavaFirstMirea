package ru.mirea.task28;


public class App {
    public static void main(String[] args) {
        Auto auto = new Auto("BMW", 127000000);
        // Inner no static
        Auto.InnerNoStatic autoNoStatic = auto.new InnerNoStatic();
        System.out.println(autoNoStatic.getPrice());
        // Inner static
        Auto.InnerStatic autoStatic = new Auto.InnerStatic();
        // Local
        System.out.println(auto.getName());
        // Anonymus
        Auto autoAnonymus = new Auto("Merc", 1234444) {
            public String getName() {
                return "Anonymus";
            }
        };
        System.out.println(autoAnonymus.getName());
    }
}
