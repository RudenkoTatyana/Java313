package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Циклы
//        while (условие){
//            тело цикла
//        }
//        Интеграция - один шаг цикла
//

//        int i = 0; // переменная счетчик
//        while (i < 5){   // условие
//            System.out.println("i =" + i);
//            i++;     // шаг цикла
//        }

//        int i = 5;
//        while (i > 0){
//            System.out.println(i);
//            i--;
//        }

//        int i = 0;
//        while (i <= 20){
//            { if (i % 2 == 0)
//            System.out.println("i= " + i);
//            }
//            i++;
//        }
//                 int count = 3;
//                 int n, sum = 0;
//                 while (count > 0){
//                     System.out.print("Введите число: ");
//                     n = input.nextInt();
//                     sum += n;
//                     count--;
//                 }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int n, sum = 0;
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()){
//            System.out.print("Введите число: ");
//                     n = input.nextInt();
//                     sum += n;
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int n, n1, sum = 0;
//        System.out.print("Введите начало диапазона: ");
//        n = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        n1 = input.nextInt();
//        while (n <= n1) {
//            if (n % 2 != 0){
//                sum += n;
//            }
//            n++;
//        }
//        System.out.println("Сумма нечетных чисел: " + sum);

//          int n, orient;
//        System.out.print("Количество символов: ");
//          n = input.nextInt();
//          String simbol;
//        System.out.print("Тип символа: ");
//          simbol = input.next();
//        System.out.print("Ориентация линии (0-горизонтальная, 1-вертикальная): ");
//        orient = input.nextInt();
//
//        while (n > 0){
//            if(orient == 0){
//                System.out.print(simbol + " ");
//            }else{
//                System.out.println(simbol);
//            }
//            n--;
//        }



//         int n;
//         String str;
//         n = input.nextInt();
//         input.nextLine();
//         str = input.next();
//        System.out.println(n);
//        System.out.println(str);


//        int i = 0;
//        do {
//            System.out.println("i = " + i);
//            i++;
//        }while (i < 5);


//        int i, sum = 0, n = 0;
//        double avarage;
//        do {
//            System.out.print("Введите число (0-прервать): ");
//            i = input.nextInt();
//            if(i < 0){
//                sum += i;
//                n++;
//            }
//        } while (i != 0);
//        avarage = (double)sum / n;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f", avarage);



//        int number, copy, reverse_number=0, i;
//        System.out.print("Введите число: ");
//        number = input.nextInt();
//        copy = number;
//        do{
////          i = copy %10;
////          reverse_number = reverse_number * 10 + i;
//
//            reverse_number *=10;
//            reverse_number += copy %10;
//          copy /=10;
//        }while (copy > 0);
////        System.out.println(reverse_number);
//        System.out.println("Число " + number + (number == reverse_number ? " " : " не ") + "палиндром");


//          int i = 0;
//          while (i < 10){
//              if(i == 3){
//                  i++;
//                  continue;
//              }
//              System.out.println(i);
//              if(i == 5) {
//                  break;
//              }
//              i++;
//          }
//        System.out.println("Цикл завершен");


//        int n;
//        while (true){
//            System.out.print("Введите положительное число: ");
//            n = input.nextInt();
//            if(n <= 0){
//                break;
//            }
//        }
//        int n = 0, n1 = 1;
//        while (true) {
//            System.out.print("Введите число кроме нуля: ");
//            n = input.nextInt();
//            n1 *= n;
//            if (n==0){
//                break;
//            }
//
//        }
//        System.out.print("произведение = " + n1 + ",");











    }
}
