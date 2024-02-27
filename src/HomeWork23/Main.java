package HomeWork23;

import AbstractClass.Shape.Shape;

public class Main {
    public static void main(String[] args) {
final int N = 3;
Figure f[] = new Figure[N];
f[0] = new Ball(10);
f[1] = new Cylinder(10, 10);
f[2] = new Pyramid(10, 10, 20);
        for (int i = 0; i < f.length; i++) {
            f[i].volume();
        }
    }
}
abstract class Figure{
    abstract void volume();
}
class Ball extends Figure{
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    void volume() {
        System.out.printf("Фигура: шар %7s Объем фигуры: %.2f%n", "|", (double) 4/3*Math.PI*Math.pow(this.radius, 3));
    }
}
class Cylinder extends Figure {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    void volume() {
        System.out.printf("Фигура: цилиндр %3s Объем фигуры: %.2f%n", "|", Math.PI*Math.pow(this.radius, 2)*this.height);
    }
}
class Pyramid extends Figure{
    private double lenght;
    private double weght;
    private double height;

    public Pyramid(double lenght, double weght, double height) {
        this.lenght = lenght;
        this.weght = weght;
        this.height = height;
    }

    @Override
    void volume() {
        double S = this.lenght*this.weght;
        System.out.printf("Фигура: пирамида %2s Объем фигуры: %.2f", "|", (double)1/3*S*this.height);
    }
}
