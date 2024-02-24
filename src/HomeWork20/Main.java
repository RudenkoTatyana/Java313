package HomeWork20;

public class Main {
    public static void main(String[] args) {
        Square a = new Square();

        System.out.println("Площадь треугольника по формуле Герона (3, 4, 5): " + a.geron(3,4,5));

        System.out.println("Площадь треугольника через основание и высоту (6, 7): " + a.height(6, 7));

        System.out.println("Площадь квадрата (7): " + a.square(7));

        System.out.println("Площадь прямоугольника (2, 6): " + a.rectangle(2, 6));

        System.out.println("Количество подсчетов площади: " + a.d);
    }
}
