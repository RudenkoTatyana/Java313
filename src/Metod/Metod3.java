package Metod;
import java.util.*;

public class Metod3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] list = new int[size];
        int option;
        do{
            System.out.println("Меню:");
            System.out.println("1. Ввод элементов массива");
            System.out.println("2. Отображение массива");
            System.out.println("3. Поиск элементов в массиве");
            System.out.println("4. Сортировка массива");
            System.out.println("5. Выход");
            System.out.print("Сделайте свой выбор: ");
            option = input.nextInt();

            switch (option){
                case 1:
                    readArray(list);
                break;
                case 2:
                    displeyArray(list);
                    break;
                case 3:
                    System.out.print("Введите номер элемента в массиве: ");
                    int item = input.nextInt();
                    int index = searchArray(list, item);
                    if (index == -1){
                        System.out.println("Элемент не найден.");
                    }
                    else {
                        System.out.println("Элемент найден на позиции: " + (index+1));
                    }
                    break;
                case 4:
                    System.out.println("Отсортированный массив: ");
                    sortArray(list);
                    displeyArray(list);
                    break;

            }
        } while (option != 5);

    }
public static void readArray ( int[] array){
    for (int i = 0; i < array.length; i++) {
        System.out.print("->");
        array[i]= input.nextInt();
    }
}
public static void displeyArray(int[] array){
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
    }
    System.out.println();
}
public static int searchArray(int[] array, int data){
    for (int i = 0; i < array.length; i++) {
        if (array[i] == data){
            return i;
        }
    }
    return -1;
}
    public static void sortArray(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
            
        }
    }

}
