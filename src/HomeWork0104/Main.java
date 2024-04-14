package HomeWork0104;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(3,4,2,5,1);
        numbers.skip(1).limit(3).forEach(s-> System.out.println(s*2));
    }
}
