package HomeWork404;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Color[] colors = new Color[10];
        colors[0] = new Color("red");
        colors[1] = new Color("orange");
        colors[2] = new Color("aqua");
        colors[3] = new Color("pink");
        colors[4] = new Color("gray");
        colors[5] = new Color("blue");
        colors[6] = new Color("white");
        colors[7] = new Color("black");
        colors[8] = new Color("yellow");
        colors[9] = new Color("brown");
        HashMap<String, Color> color = new HashMap<>();
       color.put("red", colors[0]);
       color.put("orange", colors[1]);
       color.put("aqua", colors[2]);
       color.put("pink", colors[3]);
       color.put("gray", colors[4]);
       color.put("blue", colors[5]);
       color.put("white", colors[6]);
       color.put("black", colors[7]);
       color.put("yellow", colors[8]);
       color.put("brown", colors[9]);
        System.out.println(color);

        for (Map.Entry<String, Color> entry : color.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
class Color{
    String name;

    public Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return  " : " + this.name.toUpperCase();
    }

}