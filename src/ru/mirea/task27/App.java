package ru.mirea.task27;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;



public class App {
    public static void main(String[] args) {
        // Task1
        System.out.println("[+] Task1: ");
        Map<String, String> names = new HashMap<>();
        names.put("Волков", "Артем");
        names.put("Казаков", "Дмитрий");
        names.put("Петров", "Антон");
        names.put("Вязин", "Артем");
        names.put("Семенов", "Степан");
        names.put("Карасев", "Артем");
        names.put("Вилков", "Александр");
        names.put("Мельников", "Иван");
        names.put("Мальцев", "Даниил");
        names.put("Плотников", "Александр");
        System.out.println("[+] Not sorted: ");
        System.out.println(names.toString());
        HashMap<String, String> map = new HashMap<String, String>();
        Set<String> keys = names.keySet(); // The set of keys in the map.
        Iterator<String> keyIter = keys.iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = names.get(key);
            map.put(value, key);
        }
        System.out.println("[+] Sorted: ");
        System.out.println(map.toString());
        // Task2
        Map<String,ArrayList<String>> cities = new HashMap();
        // 1
        String russia = "Россия";
        ArrayList<String> citiesOfRussia = new ArrayList<>();
        citiesOfRussia.add("Москва");
        citiesOfRussia.add("Воронеж");
        citiesOfRussia.add("Ярославль");
        citiesOfRussia.add("Саранск");
        citiesOfRussia.add("Ухта");
        cities.put(russia, citiesOfRussia);
        // 2
        String germany = "Германия";
        ArrayList<String> citiesOfGermany = new ArrayList<>();
        citiesOfGermany.add("Берлин");
        citiesOfGermany.add("Гамбург");
        citiesOfGermany.add("Мюнхен");
        citiesOfGermany.add("Кельн");
        citiesOfGermany.add("Лейпциг");
        cities.put(germany, citiesOfGermany);
        // 3
        String france = "Франция";
        ArrayList<String> citiesOfFrance = new ArrayList<>();
        citiesOfFrance.add("Париж");
        citiesOfFrance.add("Ницца");
        citiesOfFrance.add("Лион");
        citiesOfFrance.add("Марсель");
        citiesOfFrance.add("Нант");
        cities.put(france, citiesOfFrance);
        // 4
        String china = "Китай";
        ArrayList<String> citiesOfChina = new ArrayList<>();
        citiesOfChina.add("Пекин");
        citiesOfChina.add("Шанхай");
        citiesOfChina.add("Ухань");
        citiesOfChina.add("Нанкин");
        citiesOfChina.add("Чунцин");
        cities.put(china, citiesOfChina);
        // 5
        String sweden = "Швеция";
        ArrayList<String> citiesOfSweden = new ArrayList<>();
        citiesOfSweden.add("Лунд");
        citiesOfSweden.add("Мерста");
        citiesOfSweden.add("Питео");
        citiesOfSweden.add("Фалун");
        citiesOfSweden.add("Умео");
        cities.put(sweden, citiesOfSweden);
        // Output
        System.out.println("[+] Task2: ");
        System.out.println(cities.toString());
    }
}
