package lesson13API.Test2;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Stream<String> phoneStream = Stream.of("iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8");
//        phoneStream.skip(1).limit(2).forEach(n-> System.out.println(n));
        List<String> phones = new ArrayList<>();
        phones.addAll(Arrays.asList("iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8", "LG G6", "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2"));

        boolean any = phones.stream().anyMatch(s-> s.length() > 10);
        System.out.println(any);
        boolean all = phones.stream().allMatch(s-> s.length() > 10);
        System.out.println(all);
        boolean non = phones.stream().noneMatch(s-> s.length() > 10);
        System.out.println(non);
//        System.out.println(phones);
//        Optional<String> first = phones.stream().findFirst();
//        System.out.println(first.get());
//        Optional<String> any = phones.stream().findAny();
//        System.out.println(any.get());
//        int pageSize = 3;
//        Scanner input = new Scanner(System.in);
//        while (true){
//            System.out.print("Введите номер страницы: ");
//            int page = input.nextInt();
//            if (page<1){
//                break;
//            }
//            phones.stream().skip((page -1) * pageSize).limit(pageSize).forEach(s-> System.out.println(s));
//        }
//        List<String> phones = new ArrayList<>();
//        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8", "LG G6", "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2");
//        System.out.println(phones);
//        phones.stream().filter(p->p.length() < 12).sorted().forEach(s-> System.out.println(s));'

    }
}
