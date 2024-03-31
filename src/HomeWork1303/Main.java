package HomeWork1303;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add((int) (Math.random()*100));
        }
        System.out.println(array);
        int max = max(array);
        System.out.println("Максимальный элемент: " + max);
     int min = min(array);
        System.out.println("Минимальный элемент: " + min);
        double aver = average(array);
        System.out.printf("Среднее арифметическое: %.1f", aver);


    }
    public static int max(ArrayList<Integer> arr){
         int maxValue = arr.get(0);
    for(int i=1; i < arr.size(); i++){
        if(arr.get(i) > maxValue){
         maxValue = arr.get(i);
      }
    }
    return maxValue;
    }
    public static int min(ArrayList<Integer> arr){
        int min = arr.get(0);
        for (Integer i: arr) {
            if(i < min) min = i;
        }
        return min;
    }
    public static double average(ArrayList<Integer> arr){
        double sum = arr.get(0);
        double aver = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            aver = sum / i;
        }

        return aver;
    }

}
