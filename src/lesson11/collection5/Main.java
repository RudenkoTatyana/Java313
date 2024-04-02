package lesson11.collection5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Валентин");
        set.add("Николай");
        set.add("Григорий");
        set.add("Александр");
        set.add("Александр");
        System.out.println(set);
        for (String s: set) {
            System.out.println(s);
        }
        set.remove("Александр");
        for (String s: set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.contains("Александр"));

    }
}
