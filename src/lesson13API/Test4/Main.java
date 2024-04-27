package lesson13API.Test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = Stream.of("Язык", "програмирования", "Java").map(s->s.length()).reduce(0, Integer::sum);
        System.out.println(sum);

//        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        System.out.println(min.get());
//        Optional<Integer> max = numbers.stream().max(Integer::compare);
//        System.out.println(max.get());

//        Stream<String> people1 = Stream.of("Виктор", "Екатерина", "Дмитрий");
//        Stream<String> people2 = Stream.of("Александр", "Виктория", "Дмитрий");
//
////        Stream.concat(people1, people2).forEach(n-> System.out.println(n));
//        Stream.concat(people1, people2).distinct().forEach(n-> System.out.println(n));
////        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.sorted().dropWhile(n-> n< 0).forEach(n-> System.out.println(n));
//        numbers.takeWhile(n-> n< 0).forEach(n-> System.out.println(n));
    }
}
