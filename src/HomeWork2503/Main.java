package HomeWork2503;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("->");
            int numer = input.nextInt();
            num.add(numer);
        }
        System.out.println(num);
        System.out.println(Collections.min(num));


    }
}
