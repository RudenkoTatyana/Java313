package lesson13API.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = {-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5};
//        int count = 0;
//        for (int i : numbers) {
//            if (i>0) count++;
//        }
//        System.out.println(count);
//        Stream<String> cityStream = Arrays.stream(new String[]{"Сочи", "Москва", "Калининград"});
//        cityStream.filter(s -> s.length() >= 6).forEach(System.out::println);

////        cityStream.forEach(s-> System.out.println(s));
////        System.out.println();
//        Stream<String> cityStream = Stream.of("Сочи", "Москва", "Калининград");
//        System.out.println(cityStream.getClass());
//        cityStream.forEach(System.out::println);
//        System.out.println();
////        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5});
////        intStream.forEach(i-> System.out.println(i + " "));
//        String[] arguments = {"one", "first", "two", "second", "three", "third", "four", "fourth", "five", "fifth"};
//        Map<String, String> aMap = new LinkedHashMap<>(arguments.length/2);
//        for (int i = 0; i < arguments.length; i+= 2) {
//            aMap.put(arguments[i], arguments[i+1]);
//        }
//        System.out.println(aMap);
//        aMap.forEach((key, value) -> System.out.printf("%s: %s %n", key, value));

//        long count = IntStream.of(-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5).filter(w -> w>0).count();
//        System.out.println(count);
        List<String> colors = Arrays.asList("Красный", "Кремовый", "Синий", "Зеленый", "Коричневый");
        System.out.println("Исходный список цветов: " + colors);
        char start = 'К';
        long ctr = colors.stream().filter(s -> s.startsWith(String.valueOf(start))).count();
        System.out.println("\nКоличество цветов, которые начинаются с '" + start + "': " + ctr);
    }
}
