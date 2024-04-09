package lesson12.map1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(334455, "Михаил Борисов");
        map1.put(778899, "Олег Зуев");
        map1.put(443355, "Андрей Миронов");
        map1.put(556677, "Игорь Лавров");
//        System.out.println(map1);
//        map1.put(886622, "Игорь Лавров");
        map1.putIfAbsent(443355, "Ирина Мельник");
        System.out.println(map1);
        System.out.println(map1.get(443355));
        map1.remove(334455);
        System.out.println(map1);
        System.out.println(map1.containsValue("Андрей Миронов"));
        System.out.println(map1.keySet());
        System.out.println(map1.entrySet());
        System.out.println(map1.values());
    }
}
