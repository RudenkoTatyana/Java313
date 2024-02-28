package AbstractClass.base;

public class Base {
    public static void main(String[] args) {
final int N = 3;
Shape geon[] = new Shape[N];
geon[0] = new Line(5, "red", 1, 2, 3, 4);
geon[1] = new Rectangle(2, 10, "yellow");
geon[2] = new Triangle(3, "green", 10);
ShapeInterface sh[] = new ShapeInterface[N];
sh[0] = new Line(5,"red", 1, 2, 3, 4);
sh[1] = new Rectangle(2, 10, "yellow");
sh[2] = new Triangle(3, "green", 10);
//        for (Shape g:geon) {
//            g.draw();
//            g.getSquare();
//        }
        for (int i = 0; i < geon.length; i++) {
            geon[i].draw();
            if (geon[i] instanceof MathShape){
                double s = ((MathShape) geon[i]).getSquare();
                System.out.println("Площадь: " + s);
            }
            sh[i].info();
        }
    }
}
interface ShapeInterface{
    void info();
}
interface MathShape{
    double getSquare();
}
abstract class Shape{
    private int width;
    private String color;

    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    abstract void draw();
}
class Line extends Shape implements ShapeInterface{
    private int x1, x2, y1, y2;

    public Line(int width, String color, int x1, int x2, int y1, int y2) {
        super(width, color);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    @Override
    void draw() {
        System.out.println("Рисование линии");
    }
    public void info(){
        System.out.println("Координаты линий: " + this.x1 + " " + this.x2 + " " + this.y1 + " " + this.y2 + "\n");
    }
}
class Rectangle extends Shape implements MathShape, ShapeInterface{
    private int height;

    public Rectangle(int width, int height, String color) {
        super(width, color);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование прямоугольника");
    }

    public void info() {
        System.out.println("Ширина: " + getWidth() + "\nВысота: "+ this.height + "\n");
    }

    public double getSquare(){
        return getWidth()*this.height;
    }
}
class Triangle extends Shape implements MathShape, ShapeInterface{
    private int height;

    public Triangle(int width, String color, int height) {
        super(width, color);
        this.height = height;
    }
    public void info(){
        System.out.println("Длина: " + getWidth() + "\nВысота: "+ this.height);
    }

    @Override
    void draw() {
        System.out.println("Рисование треугольника");
    }
    public double getSquare(){
        return getWidth()*this.height*0.5;
    }
}
