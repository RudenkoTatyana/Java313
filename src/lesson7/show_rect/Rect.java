package lesson7.show_rect;

public class Rect {
    private int width;
    public int height;
    public Rect(){};

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void showRect(){
        System.out.printf("*** Прямоугольник ***%nШирина: %d%nВысота: %d", this.width, this.height);

    }
}
