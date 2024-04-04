package lesson11.collection7;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(7);
        System.out.println(treeSet);
    }
}
