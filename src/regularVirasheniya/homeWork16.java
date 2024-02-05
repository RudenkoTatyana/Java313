package regularVirasheniya;
import java.util.*;
public class homeWork16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество символов: ");
        int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i & 1) == 0){
                        System.out.print(" X ");
                    } else {
                        System.out.print(" 0 ");
                    }
                } System.out.println(" ");
            }
    }
}
