package String;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class homeWork13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите два слова через пробел: ");
        String words = input.nextLine();
        String[] arr = words.split(" ");
        System.out.print(arr[1] + " " + arr[0]);


        System.out.print("Введите строку: ");
        String line = input.nextLine();
        String a = line.substring(0, line.indexOf('о')+1);
        String b = line.substring(line.indexOf('о') + 1, line.lastIndexOf('о'));
        String c = line.substring(line.lastIndexOf('о'));
        System.out.println(a + b.replace('о', 'О') + c);

    }
    }
