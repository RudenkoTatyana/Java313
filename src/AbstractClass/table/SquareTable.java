package AbstractClass.table;

public class SquareTable extends Table {
    public SquareTable(int width, int height) {
        super(width, height);
    }

    public SquareTable(int width) {
        super(width);
    }

    public void calcArea(){
        System.out.printf("Ширина: %d%nВысота: %d%nПлощадь: %d%n%n", getWidth(), getHeight(), getWidth()*getHeight());
    }
}
