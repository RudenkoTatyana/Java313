package lesson7.show_rect;

public class RectBorder extends Rect{
    private String frame;

    public RectBorder(int width, int height, String frame) {
        super(width, height);
        this.frame = frame;
    }
    @Override
    void showRect(){
        super.showRect();
        System.out.println("\nРамка: " + frame + "\n");
    }
}
