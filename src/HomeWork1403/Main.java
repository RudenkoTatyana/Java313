package HomeWork1403;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество элементов числового массива: ");
        int n = input.nextInt();
        Integer[] arr1 = new Integer[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("-> ");
            arr1[i] = input.nextInt();
        }
        System.out.print("Введите количество элементов массива строк: ");
        n = input.nextInt();
        String[] arr2 = new String[n];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("-> ");
            arr2[i] = input.next();

        }
        Print<Integer> arrPrint = new Print<>();
        Print<String> arr2Print = new Print<>();
        arrPrint.printArray(arr1);
        arr2Print.printArray(arr2);

    }
}
class Print<T>{
    public static <E> void printArray(E[] generic) {
        System.out.println("Массив: ");
        for (E e : generic) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
