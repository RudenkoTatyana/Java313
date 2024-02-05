package massiv;
import java.util.Scanner;

public class homeWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("n = ");
        n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("-> ");
            array[i] = input.nextInt();
        }
        for (int i = 1; i < n; i++){
            if (array[i] > array[i - 1]){
                System.out.print(array[i] + " ");
            }
        }



    }
}
