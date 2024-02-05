package massiv;
import java.util.*;
public class newHomeWork7 {
    public static void main(String[] args) {

        int[] mas = new int[10];
        int c;
        for (int i = 0; i < 10; i++){
            c = (int) (Math.random()*10);
            int j = 0;
            while (j < i){
                if (c != mas[j]){
                    j++;
                } else {
                    c = (int) (Math.random()*10);
                    j = 0;
                }

            }
            mas[i] = c;
        }
        System.out.println(Arrays.toString(mas));

    }
}
