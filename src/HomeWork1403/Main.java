package HomeWork1403;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество элементов числового массива: ");
        int n = input.nextInt();
        System.out.print("-> ");
        ArrayList<Integer> arr = new ArrayList<>(n);
        arr.add(input.nextInt());
    }
}
