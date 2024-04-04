package lesson11.collection8;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(3);
        lhs.add(1);
        lhs.add(4);
        lhs.add(9);
        System.out.println(lhs);
        lhs.remove(4);
        System.out.println(lhs);
        System.out.println(lhs.contains(8));
        System.out.println(lhs.removeIf(x -> x > 5));
    }
}
