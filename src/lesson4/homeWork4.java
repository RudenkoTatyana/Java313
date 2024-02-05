package lesson4;

import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, iMin = Integer.MAX_VALUE, iMax = Integer.MIN_VALUE, sum = 0, count = 0;

        do {
            System.out.print("Введите число кроме нуля: ");
            do {
                i = input.nextInt();
                if(i < 0){
                    System.out.print("Вы ввели отрицательное число.\nВведите положительное число: ");
                }
            }while (i < 0);
            if(i < iMin && i != 0) {
                iMin = i;
            }
            if (i > iMax) {
                iMax = i;
            }
            sum += i;
            if(i > 0){
                count++;
            }

        }while (i != 0);
        if(sum != 0) {
            System.out.printf("Среднее арифметическое: %.2f", (double) sum / count);
            System.out.println("Минимальное число: " + iMin);
            System.out.println("Максимальное число: " + iMax);

        } else{
            System.out.println("Вы вводили только отрицательные числа.");
        }









    }
}
