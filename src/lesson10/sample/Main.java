package lesson10.sample;

public class Main {
    public static void main(String[] args) {
//        Printable printer = s -> System.out.println(s);
//        printer.print("Hello, Java!");
        Printable printer = () -> {
            System.out.println("Hello, Java!");
            System.out.println("Вторая строка");
        };
        printer.print();
    }
}
interface Printable{
//    void print(String s);
    void print();
}
