package HomeWork22;

public class Main {
    public static void main(String[] args) {
Figure f[] = new Figure[3];
f[0] = new Figure(10, 20);
f[1] = new Triagle(10, 20);
f[2] = new Rectangle(10, 20);
        for (int i = 0; i < f.length; i++) {
            f[i].square();
        }

    }
}
class Figure{
   private double a;
     private double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    void square(){
        double c = 0;
        System.out.println("Площадь фигуры не определена: " + c);
    }
}
class Triagle extends Figure{
    public Triagle(double a, double b) {
        super(a, b);
    }

    void square(){
        System.out.println("Площадь треугольника: " + getA()*getB()/2);

    }
}
class Rectangle extends Figure{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    void square(){
        System.out.println("Площадь прямоугольника: " + getA()*getB());

    }
}
