package lesson7.shape;

public class Rectangle extends Figure{
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<0){
            throw new IllegalArgumentException("Необходимо ввести положительное число");
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>0)
        this.height = height;
        else
            System.out.println("Необходимо ввести положительное число");
    }
    int area(){
        return this.width * this.height;
    }
}
