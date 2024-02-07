package getHub.rect;

public class Main {
    public static void main(String[] args) {
        rectangle rect1 = new rectangle(4, 12);
        rect1.setLenght(3);
        rect1.setWidht(9);
        System.out.printf("Длина прямоугольника: %d%n", rect1.getLenght());
        System.out.printf("Ширина прямоугольника: %d%n", rect1.getWidht());
        System.out.printf("Площадь прямоугольника: %d%n", rect1.getArea());
        System.out.printf("Периметр прямоугольника: %d%n", rect1.getPerimetr());
        System.out.printf("Гипотенуза прямоугольника: %.2f%n", rect1.getHipotenus());
        rect1.getDraw();
    }
}
