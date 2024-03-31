package lesson11.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Валерий");
        arrayList1.add("Ирина");
        arrayList1.add("Игорь");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>(2);
        arrayList2.add("Валерий");
        arrayList2.add("Ирина");
        arrayList2.add("Игорь");
        System.out.println(arrayList2.size());
        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Валерий");
        arrayList3.add("Ирина");
        System.out.println(arrayList3);

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        arrayList4.add("Олеся");
        System.out.println(arrayList4);
        System.out.println(arrayList1);

        ArrayList arrayList5 = new ArrayList<>();
        arrayList5.add("Валерий");
        arrayList5.add(15);
        arrayList5.add(true);
        System.out.println(arrayList5);

        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("&&&");
//        arrayList6.addAll(arrayList1);
//        System.out.println(arrayList6);
        arrayList6.addAll(0, arrayList1);
        System.out.println(arrayList6);
////        arrayList6.removeAll(arrayList1);
////        System.out.println(arrayList6);
////        arrayList6.retainAll(arrayList1);
////        System.out.println(arrayList6);
//
//        List<String> myList = arrayList6.subList(0, 3);
//        System.out.println(myList);
//        myList.add("Борис");
//        System.out.println(myList);
//        System.out.println(arrayList6);
//
//        String[] array = arrayList6.toArray(new String[8]);
//        for (String s:array) {
//            System.out.print(s + " ");
//        }
//        System.out.println("\n" + array.length);
//Collections.sort(arrayList6);
//Collections.shuffle(arrayList6);
//Collections.reverse(arrayList6);
//Collections.swap(arrayList6, 0, 2);
//        System.out.println(arrayList6);
//
        Iterator<String> iterator = arrayList6.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList6);

    }
}
