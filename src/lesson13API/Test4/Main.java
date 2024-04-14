package lesson13API.Test4;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> people1 = Stream.of("Виктор", "Екатерина", "Дмитрий");
        Stream<String> people2 = Stream.of("Александр", "Виктория", "Дмитрий");

//        Stream.concat(people1, people2).forEach(n-> System.out.println(n));
        Stream.concat(people1, people2).distinct().forEach(n-> System.out.println(n));
//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.sorted().dropWhile(n-> n< 0).forEach(n-> System.out.println(n));
//        numbers.takeWhile(n-> n< 0).forEach(n-> System.out.println(n));
    }
}
