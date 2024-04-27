package HomeWork0304;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 20, 33, 45, 52);
        int a = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 4 == 0) {
                a += list.get(i) * 2;
            }

        }
        System.out.println(list + ": " + a);



    }
}
