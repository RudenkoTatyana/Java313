package HomeWork24;

public class Main {
    public static void main(String[] args) {
Rectangle rec = new Rectangle(100, 150);
rec.info();
rec.resizeWeight(250);
rec.resizeHeight(300);
rec.info();
    }
}
interface reSize{
void resizeWeight(int weight);
void resizeHeight(int height);
}
class Rectangle implements reSize{
    int weight;
    int height;

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    public void resizeWeight(int weight){
        this.weight = weight;
    }
    public void resizeHeight(int height){
        this.height = height;
    }
    public void info(){
        System.out.println("Weight: " + this.weight + " Height: " + this.height);
    }
}

