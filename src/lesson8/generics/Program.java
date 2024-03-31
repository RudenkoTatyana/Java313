package lesson8.generics;

public class Program {
    public static void main(String[] args) {
        Point<Integer, String> pt = new Point<>(7,15, "point_1");
//        pt.x = 10;
//        pt.y = 20;
        System.out.println(pt.getX() + " " + pt.getY());
        Point<Double, Integer> pt2 = new Point<>(20.4, 6.8, 1);
//        pt2.x = 15.5;
//        pt2.y = 20.4;
        System.out.println(pt2.getX() + " " + pt2.getY());
    }
}

class Point<T, V>{
    private T x, y;
    private V id;

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public V getId() {
        return id;
    }

    public Point(T x, T y, V id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
}
