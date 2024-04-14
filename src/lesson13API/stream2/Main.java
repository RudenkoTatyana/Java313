package lesson13API.stream2;

import java.util.Locale;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("A", "B", "C").flatMap(s->Stream.of(s, s.toLowerCase(Locale.ROOT))).forEach(System.out::print);
//        Stream<Notebook> notebookStream = Stream.of(new Notebook("ThinkPad", 40000),
//        new Notebook("MacBook", 45000),
//        new Notebook("Legion", 55000));
//    notebookStream.flatMap(p-> Stream.of(
//            "название: " + p.getName() + " цена без скидки: " + p.getPrice(),
//            "название: " + p.getName() + " цена со скидкой: " + (p.getPrice() - (int)(p.getPrice() * 0.1))
//    )).forEach(s-> System.out.println(s));
//        notebookStream.map(p-> p.getName()).forEach(s-> System.out.println(s));
//notebookStream.filter(p-> p.getPrice() <50000).forEach(p-> System.out.println(p.getName()));



    }
}

class Notebook{
    private String name;
    private int price;

    public Notebook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
