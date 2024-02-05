package regularVirasheniya;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homeWork16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество символов: ");
        int n = input.nextInt();
        String [][] arr = new String[n][n];
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (((i + j) & 1) == 0){
                    arr[i][j] = "X ";
                }
                if (((i + j) & 1) == 1){
                    arr[i][j] = "0 ";
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 7 (499) 456-45-78";
        String pattern ="[\\w-+()\\d\\s]*";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }



    }
}
