package HomeWork0604;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("X", 1);
        map.put("Y", 2);
        map.put("Z", 3);
        System.out.println("Исходный Map: " + map);
        HashMap<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Измененный Map: " + newMap);

    }
    }

