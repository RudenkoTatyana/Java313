package lesson3;

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество часов: ");
        int hour = input.nextInt();
        switch (hour >= 0 && hour < 6 ? 2 : hour >= 6 && hour < 13 ? 3 : hour >= 13 && hour < 17 ? 4 : hour >= 17 && hour < 24 ? 5 : 0) {
            case 2 -> System.out.println("Доброй ночи!");
            case 3 -> System.out.println("Доброе утро!");
            case 4 -> System.out.println("Добрый день!");
            case 5 -> System.out.println("Добрый вечер!");
            case 0 -> System.out.println("Такого значения нет.");
        }


    }
}
