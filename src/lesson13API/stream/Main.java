package lesson13API.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Stream<String> cityStream = Arrays.stream(new String[]{"Сочи", "Москва", "Калининград"});
//        cityStream.forEach(s-> System.out.println(s));
//        System.out.println();
        Stream<String> cityStream = Stream.of("Сочи", "Москва", "Калининград");
        System.out.println(cityStream.getClass());
        cityStream.forEach(System.out::println);
        System.out.println();
//        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5});
//        intStream.forEach(i-> System.out.println(i + " "));
    }
}
