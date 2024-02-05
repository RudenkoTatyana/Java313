package massiv;

//import java.util.Arrays;
//import java.util.Scanner;
import java.util.ArrayList;
 import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//
//       for (int i = 0; i < 3; i++){
//           System.out.println("+++ = " + i);
//           for (int j = 0; j < 2; j++){
//               System.out.println("----- = " + j);
//           }
//       }
//
//        int w = 0, h = 0;
//        System.out.print("Введите ширину прямоугольника: ");
//        w = input.nextInt();
//        System.out.print("Введите высоту прямоугольника: ");
//        h = input.nextInt();
//        for (int i = 0; i < h; i++){
//            for (int j = 0; j < w; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        int w = 0, h = 0;
//        System.out.print("Введите ширину прямоугольника: ");
//        w = input.nextInt();
//        System.out.print("Введите высоту прямоугольника: ");
//        h = input.nextInt();
//        for (int i = 0; i < h; i++){
//            for (int j = 0; j < w; j++){
//                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        int size = 4;
//        for (int i = 0; i < size; i++){
//            for (int j = 0; j < size; j++) {
//                if (i >= j) {
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println();
//        }
//
//        int size = 7;
//        int h = size *2 - 1;
//        int m = h / 2;
//        for (int i = 0, l = m, r = m; i < size; i++, r++, l--){
//            for (int j = 0; j < h; j++) {
//                if (j >= l && j <= r) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//
//
//        int size = 8;
//        for (int i = 0; i < size; i++){
//            for (int j = 0; j < size; j++) {
//                if (i <= j) {
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println();
//        }
//
////         Массивы
//
//        int mas[] = new int[4];
//        int[] mas2 = new int[5];
//        int mas3[];
//        mas3 = new int[4];
//
//
//        int mas[] = new int[4];
//        int mas[] = new int[] {1, 2, 3, 4};
//        int mas[] = {1, 2, 3, 4};
//
//
//        int mas[] = new int[5];
//        mas[0] = 5;
//        mas[1] = 2;
//        mas[2] = 7;
//        mas[3] = mas[1] + mas[2];
////        System.out.println(mas[0]);
////        System.out.println(mas[1]);
////        System.out.println(mas[2]);
////        System.out.println(mas[3]);
////        System.out.println(mas.length);
////        int last = mas[mas.length - 1];
////        System.out.println(last);
//        for(int i = 0; i < mas.length; i++){
//            System.out.println(mas[i]);
//        }
//
//
//        int n = 100;
//        int[] a = new int[n*2+3];
//        System.out.println(a.length);
//
//        int n = 10;
//        int[] a = new int[n];
//        a[n - 1] = 2;
//        a[n - 2] = 3;
//        a[n / 5] = a[n - 1] + a[n - 2];
////        System.out.println(a[n / 5]);
//        for(int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//
//
//        int[] array = new int[4];
//        System.out.print("-> ");
//        array[0] = input.nextInt();
//        System.out.print("-> ");
//        array[1] = input.nextInt();
//        System.out.print("-> ");
//        array[2] = input.nextInt();
//        System.out.print("-> ");
//        array[3] = input.nextInt();
//
//        for(int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//
//        for(int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//        System.out.print("Введите количество элементов массива: ");
//        int a = input.nextInt();
//        int[] array;
//        if (a < 5){
//            array = new int[a];
//        }
//        else{
//            array = new int[a];
//            for(int i = 0; i < array.length; i++) {
//                System.out.print("-> ");
//                array[i] = input.nextInt();
//            }
//        }
//        for(int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//        int[] array = new int[10];
//        for(int i = 0; i < array.length; i++) {
//                System.out.print("-> ");
//                array[i] = input.nextInt();
//            }
//                for(int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//            }
//
//        int[] array = {1, 4, 6, 3, 8};
//        System.out.println(Arrays.toString(array));
//
//
//        int n, sum = 0;
//        System.out.print("n = ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++){
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//            if (array[i] < 0){
//                sum += array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(sum);
//
//        int n;
//        System.out.print("n = ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++){
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        int min = array[0];
//        for (int i = 0; i < array.length; i++){
//            if (array[i] < min){
//                min = array[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(min);
//
//        int a, b;
//        System.out.print("Введите начало диапазона: ");
//        a = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        b = input.nextInt();
//        int[] array = new int[b];
//
//        for(int i = 0, g = a; i <= b-a; i++, g++) {
//            array[i] = g;
//            System.out.print(array[i] + " ");
//        }
//
//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length];
//        for (int i = 0; i<a1.length; i++){
//
//        }
//        System.out.println("\n" + Arrays.toString(a1));
//        System.out.println("\n" + Arrays.toString(a2));
//
//        double a = Math.random() * 10;
//        System.out.println(a);
////         Элемент выводящий число от 2 до 7 не включая 7
//
//        double b = Math.random() * 5 + 2;
//        System.out.println(b);
//
//        int c = (int) (Math.random() * 3);
//        System.out.println(c);
//
//        int b = (int) (Math.random() * 2 + 3);
//        System.out.println(b);
//
////         Math.random *(max-min) + min; //(если включительно, то после умножения +1)
//
//        int b = (int) (Math.random() * 6 + 1 - 2);
//        System.out.println(b);
//
//        int [] array = new int[10];
//        for (int i = 0; i < array.length; i++){
//            array[i] = (int) (Math.random() * 10);
//        }
//        System.out.println(Arrays.toString(array));
//
//
//        int [] array = new int[20];
//        int sum=0, sum1=0;
//        for (int i = 0; i < array.length; i++){
//            array[i] = (int) (Math.random() * 40 + 10);
//            if (array[i] %2 == 0) {
//                sum += array[i];
//            } else {
//                sum1 += array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(sum);
//        System.out.println(sum1);
//
//
//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
////        for (объявление переменной: выражение)
//        for (int x:numbers) {
//            System.out.println(numbers[x] + " ");
//        }
//
//        String[] names = {"Олег", "Иван", "Юля", "Игорь"};
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        String[] cityes = {"Москва", "Калининград", "Пермь"};
//        System.out.println(Arrays.toString(cityes));
//        String[] cityes2 = new String[cityes.length + 1];
//        for (int i = 0; i< cityes.length;i++){
//            cityes2[i]=cityes[i];
//        }
//        cityes2[cityes.length] = "Красноярск";
//        System.out.println(Arrays.toString(cityes2));
//
//
//        ArrayList <String> cityes = new ArrayList<>();
//        cityes.add("Брянск");  // Добавляет элемент в массив
//        cityes.add("Пермь");
//        cityes.add("Иркутск");
//        cityes.add(0, "Мурманск");
//        cityes.add( "Сочи");
//        System.out.println(cityes.get(2)); // Получает элемент по заданному индексу
//        for(String city : cityes) {
//            System.out.print(city + " ");
//
//        }
//        System.out.println("\n" + cityes.indexOf("Брянск")); // Получает индекс по заданному значению
//
//       cityes.set(2, "Курск"); //Устанавливаем новое значение по заданному индексу
//        cityes.remove(1);
//        for(String city : cityes) {
//            System.out.print(city + " ");
//
//        }
//
//        if(cityes.contains("Курск")){ // Проверка на существование элемента в массиве
//            System.out.println("\n ArrayList содержит Курск");
//        }
//        System.out.println(cityes.contains("Курск"));
//
//        System.out.println(cityes.size());
//
//        for (int  i = 0; i < cityes.size(); i++){
//            System.out.println(cityes.get(i));
//        }
//        cityes.remove("Красноярск");
//
//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка. Условие выхода 0 или отрицательное число");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//        }
//        System.out.print("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//        for (int m : mas){
//            System.out.print(m + "\t");
//        }
//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++){
//            mas.add((int) (Math.random()*100));
//        }
//        for (int m : mas){
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//
//        for (int i = 0; i < 10; i++){
//            if (mas.get(i) > max){
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax:" + max);
//        ind = mas.indexOf(max);
//        mas.remove(ind);
//        mas.add(0, max);
//        for (int m : mas){
//            System.out.print(m + "\t");
//        }
//
//
//           ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//           ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44));
//           ArrayList<Integer> c = new ArrayList<>();
//           if (a.size() > b.size()) {
//               for (int i = 0; i < b.size(); i++) {
//                   c.add(a.get(i));
//                   c.add(b.get(i));
//               }
//               for (int i = b.size(); i < a.size(); i++) {
//                   c.add(a.get(i));
//               }
//               for (int m : c) {
//                   System.out.print(m + "\t");
//               }
//           } else {
//               for (int i = 0; i < a.size(); i++) {
//                   c.add(a.get(i));
//                   c.add(b.get(i));
//               }
//               for (int i = a.size(); i < b.size(); i++) {
//                   c.add(b.get(i));
//               }
//               for (int m : c) {
//                   System.out.print(m + "\t");
//               }
//           }
//
//             int[][] num = {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}};
//        System.out.println(num.length);
//             for (int i = 0; i < num.length; i++){
//                 System.out.println(Arrays.toString(num[i]));
//             }
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++){
//            for (int j = 0; j < num[i].length; j++){
//                System.out.print(num[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//
//        int[][] num = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
//        for (int i = 0; i < num.length; i++){
//            for (int j = 0; j < num[i].length; j++){
//                System.out.print(num[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < num.length; i++){
//            for (int j = 0; j < num[i].length; j++){
//                System.out.print(num[i][j]*num[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//
//        int n = 5, m = 7;
//        char[][] graph = new char[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                graph[i][j] = '*';
//                System.out.print(graph[i][j] + "  ");
//            }
//            System.out.println();
//
//        }
//
//        int n = 3, m = 4, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mas[i][j] =  (int)(Math.random() * 31 -20);
//                if (mas[i][j] > 0){
//                    count++;
//                }
//            }
//
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(mas[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        System.out.print("Количество отрицательных значений: " + count);
//
//
//
//
//
//             int sum = Integer.MAX_VALUE;
//             int tmp = 0, n = 1;
//             int arr[][] = new int[3][5];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 100);
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                tmp += arr[i][j];
//            }
//            if (sum > tmp){
//                sum = tmp;
//                n = i;
//            }
//
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + tmp);
//            tmp = 0;
//
//        }
//        System.out.println("\n Строка с минимальной суммой элементов: "+ sum + " имеет номер " + (n + 1));


//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = input.nextInt();
//            }
//        }
//            for (int i = 0; i < mas.length; i++) {
//                for (int j = 0; j < mas[i].length; j++) {
//                    System.out.print(mas[i][j] + "\t\t");
//                }
//                System.out.println();
//            }

//        int[][] mas = new int[3][];
//        mas[0] = new int[] {1, 2};
//        mas[1] = new int[] {3, 4, 5};
//        mas[2] = new int[] {6, 7, 8, 9};
//
//            for (int i = 0; i < mas.length; i++) {
//                for (int j = 0; j < mas[i].length; j++) {
//                    System.out.print(mas[i][j] + "\t\t");
//                }
//                System.out.println();
//            }
//
//            int[][] mas1 = new int[][] {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//        for (int i = 0; i < mas1.length; i++) {
//            for (int j = 0; j < mas1[i].length; j++) {
//                System.out.print(mas1[i][j] + "\t\t");
//            }
//            System.out.println();
//        }



//        int n = 5;
//        int [][] arr = new int[n][];
//        for (int i=0; i<arr.length; i++){
//            arr[i] = new int[i+1];
//        }
//int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//
//            }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        int [][] arr = new int[n][];
//        for (int i=0; i<arr.length; i++){
//            arr[i] = new int[n-i];
//        }
//        int count = 10;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }

//          int n = 6;
//          int tp[][] = new int[n][];
//          for (int i = 0; i< tp.length; i++){
//              tp[i] = new int[i + 1];
//              tp[i][0] = 1;
//              tp[i][i] = 1;
//              for (int j = 1; j < i; j++) {
//                  tp[i][j] = tp[i-1][j-1] + tp[i-1][j];
//              }
//          }
//                for (int i = 0; i < tp.length; i++) {
//                    for (int j = 0; j < n-i; j++) {
//                        System.out.print("  ");
//                    }
//            for (int j = 0; j < tp[i].length; j++) {
//                System.out.print(tp[i][j] + "   ");
//            }
//            System.out.println();
//        }










        }
    }
