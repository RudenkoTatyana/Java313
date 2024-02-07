package getHub;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rend = new Random();
int min = 5;
int max = 10;

        int cnt = 30;
        for (int i = 0; i < cnt; i++) {
//            System.out.println(rend.nextBoolean());
//            System.out.println(rend.nextDouble());
            System.out.println(rend.nextInt(max - min) + min);
        }

    }
}
