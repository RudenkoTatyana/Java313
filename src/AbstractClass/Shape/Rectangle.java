package AbstractClass.Shape;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle( int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width)*2;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void info1() {
        System.out.printf("=== Прямоугольник ===%nШирина: %d%nВысота: %d%nЦвет: %s%nПлощадь: %.1f%nПериметр: %.1f%n", this.width, this.height, getColor(), getArea(), getPerimeter());
        draw();
    }
}
