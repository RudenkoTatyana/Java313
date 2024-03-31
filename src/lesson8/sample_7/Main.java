package lesson8.sample_7;

public class Main {
    public static void main(String[] args) {
Point <Float> pt = new Point<>();
pt.setCoord(10f, 20f);
        System.out.println(pt.getCoord(TypeCoord.COORD_X));
        System.out.println(pt.getCoord(TypeCoord.COORD_Y));
    }
}
enum TypeCoord{
    COORD_X, COORD_Y;
}
interface GeomIntercase<T>{
    void setCoord(T x, T y);
    T getCoord(TypeCoord type);
}

class Point <TT> implements GeomIntercase<TT>{
    private TT x, y;

    @Override
    public void setCoord(TT x, TT y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public TT getCoord(TypeCoord type) {
        return (type == TypeCoord.COORD_X) ? x : y;
    }
}
