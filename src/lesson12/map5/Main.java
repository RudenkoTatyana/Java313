package lesson12.map5;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        TreeMap<String, String> fileExtentions = new TreeMap<>();
//        fileExtentions.put("Python", "*.py");
//        fileExtentions.put("C++", "*.cpp");
//        fileExtentions.put("JavaScript", "*.js");
//        fileExtentions.put("Goland", "*.go");
//        fileExtentions.put("Java", "*.java");
//        fileExtentions.put("java", "*.java");
//        System.out.println(fileExtentions);
//        System.out.println(fileExtentions.get("Java"));
//        System.out.println(fileExtentions.descendingMap());
//        TreeMap<String, String> fileExtentions = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        TreeMap<String, String> fileExtentions = new TreeMap<>((o1, o2)-> o2.compareTo(o1));
        TreeMap<String, String> fileExtentions = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        fileExtentions.put("Python", "*.py");
        fileExtentions.put("C++", "*.cpp");
        fileExtentions.put("JavaScript", "*.js");
        fileExtentions.put("Goland", "*.go");
        fileExtentions.put("Java", "*.java");
        fileExtentions.put("java", "*.java1");
        System.out.println(fileExtentions);

    }
}
