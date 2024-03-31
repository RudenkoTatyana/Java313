package lesson8.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 5, 3, 4};
        Double[] doubleArray = {3.3, 4.5, 8.8, 1.1};
        Character[] charArray = {'G', 'e', 'n', 'e', 'r', 'i', 'c'};
        System.out.println("Массив intArray содержит: ");
        printArray(intArray);
        System.out.println("Массив doubleArray содержит: ");
        printArray(doubleArray);
        System.out.println("Массив charArray содержит: ");
        printArray(charArray);
    }
    public static <T> void printArray(T[] inputArray){
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
