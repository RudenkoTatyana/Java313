package lesson11.collection6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbers();
            System.out.println(numbers);
            checkDublicates(numbers);
            System.out.println("Нет дубликатов.");
        } catch (Dublicate_Number_Exception e){
            System.out.println("Ошибка." + e.getMessage());
        }
    }

    public static List<Integer> readNumbers(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Количество чисел: ");
        int count = input.nextInt();
        System.out.println("Введите целые числа: ");
        for (int i = 0; i < count; i++) {
            System.out.print("->");
            int num = input.nextInt();
            numbers.add(num);
        }
        return numbers;
    }
    public static void checkDublicates (List<Integer> numbers) throws Dublicate_Number_Exception{
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            if (uniqueNumbers.contains(num)){
                throw new Dublicate_Number_Exception("Обнаружен повторяющейся номер: " + num);
            }
            uniqueNumbers.add(num);
        }
    }
}
