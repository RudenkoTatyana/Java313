package lesson7.Test;

public class Test {
    public static void main(String[] args) {
Line l1 = new Line();
//l1.color = "red";
//l1.width = 5;
//l1.x1 = l1.x2 = 0;
//l1.y1 = l1.y2 = 10;
////l1.showProp();
//l1.show();
////Properties p = l1;
////p.color = "yellow";
////p.width = 1;
////p.showProp();
//        l1.showId();

//        Object g1 = new Line();
//        Object g2 = new Triangle();
//        Object g3 = new Properties();
//
////        Line l1 = (Line) g1;
////        Line l2 = (Line) g2;
//        System.out.println(g1 instanceof Line);
//        System.out.println(g2 instanceof Line);
//
//        Line l1 = null, l2 = null;
//        if (g1 instanceof Line){
//            l1 = (Line) g1;
//        }
//        if (g2 instanceof Line){
//            l2 = (Line) g2;
//        }
//        System.out.println(l1.id);
        l1.setId(-6);
        System.out.println(l1.getId());
    }
}

class Properties{
    int width;
    String color;
//    protected int id = 1;
    private int id = 1;

    public int getId() {
        return id;
    }

    final void setId(int id) {
        if (id>0)
        this.id = id;
    }

    public Properties() {
        System.out.println("Конструктор Properties");
    }

    public Properties(int width, String color) {
        this.width = width;
        this.color = color;
        System.out.println("Конструктор Properties(width, color)");
    }

//    void showProp(){
    void show(){
        System.out.println("Ширина - " + this.width + "px, Цвет - " + this.color);

    }
}

class Line extends Properties{
    double x1, y1;
    double x2, y2;
    int id = 2;

    public Line(){
        super(0, " ");
        System.out.println("Конструктор Line");
    }

    void show(){
        super.show();
        System.out.println("Координаты линии - х1: " + this.x1 + ", x2: " + this.x2 + ", y1: " + y1 + ", y2: " + y2);
    }
    void showId(){
        System.out.println("id: " + this.id + ", super.id: " + super.getId());
    }
}

class Triangle extends Properties{
    double x1, y1;
    double x2, y2;
    double x3, y3;

}
