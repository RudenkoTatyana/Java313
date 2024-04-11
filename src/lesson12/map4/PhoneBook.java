package lesson12.map4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        System.out.println(bookPhone);
        addNumber("Зотов", 778899, bookPhone);
        addNumber("Зотов", 112233, bookPhone);
        addNumber("Калинкин", 449988, bookPhone);
        addNumber("Романов", 889922, bookPhone);
        addNumber("Зотов", 445577, bookPhone);
        addNumber("Калинкин", 116655, bookPhone);
        System.out.println(bookPhone);
        printBook(bookPhone);

    }
    public static void printBook(HashMap<String, ArrayList<Integer>> map){
        for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
         String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s %n", item.getKey(), phones);
        }
    }
    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map){
if (map.containsKey(key)){
    map.get(key).add(value);
} else {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(value);
    map.put(key, list);
}
    }
}
