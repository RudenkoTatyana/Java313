package lesson8.sample_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("red", "green", "orange"));
        System.out.println("Исходный список чисел: " + numbers);
        ArrayList<Integer> reversNumbers = reversList(numbers);
        System.out.println("Перевернутый список: " + reversNumbers);
        System.out.println("Исходный список цветов: " + colors);
        ArrayList<String> reverseColors = reversList(colors);
        System.out.println("Перевернутый список цветов: " + reverseColors);
    }

    public static <T> ArrayList<T> reversList(ArrayList <T> originalList){
        ArrayList<T> reversedList = new ArrayList<>();
        for(int i = originalList.size() - 1; i >= 0; i--){
            reversedList.add(originalList.get(i));
        }
        return reversedList;
    }
}
