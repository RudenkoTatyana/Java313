package lesson13API.Test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("Pixel 2", 500),
                new Phone("iPhone X",  600),
                new Phone("Nokia",  150),
                new Phone("iPhone 8",  450),
                new Phone("Galaxy S9",  300)
        ));
        Map<String, Integer> phoneMap = phones.stream().collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));
        phoneMap.forEach((k,v)-> System.out.println(k  + ": " + v));
//        Phone min = phones.stream().min(Phone::compare).get();
//        Phone max = phones.stream().max(Phone::compare).get();
//        System.out.printf("Min: name = %s, price = %d%n", min.getName(), min.getPrice());
//        System.out.printf("Max: name = %s, price = %d", max.getName(), max.getPrice());
    }
}
class Phone{
    private String name;
    private  int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public static int compare (Phone p1, Phone p2){
        if (p1.getPrice() > p2.getPrice()){
            return 1;
        }
        return -1;

    }
}
