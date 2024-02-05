package Metod;
import java.util.*;
public class homeWork12 {
    public static void main(String[] args) {
       int[] mas = new int []{-2, 3, 8, -11, -4, 6};
        System.out.print("n: ");
        minus(mas);
    }
    public static void minus(int[] array){
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                n++;
            }
        } System.out.print(n);

    }

}
