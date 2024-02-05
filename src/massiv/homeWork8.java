package massiv;
import java.util.*;
public class homeWork8 {
    public static void main(String[] args) {
        int n = 6, m = 6;
        int[][] mas = new int[n][m];
        System.out.println("Двумерный массив: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = (int) (Math.random() * 11);

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Одномерный массив: ");
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + "  ");

        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
               if (i %2 !=0){
                   mas[i] = array;
               }

            for (int j = 0; j < m; j++) {

                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }






        }
    }
