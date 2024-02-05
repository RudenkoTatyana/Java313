package Metod;
import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = 11, b = 6;
//        int c = min(a, b);
//        System.out.println("Минимальное значение: " + c);
//        System.out.print("a = ");
//        int a = input.nextInt();
//        System.out.print("b = ");
//        int b = input.nextInt();
//        int r = c(a, b);
//        System.out.print("Результат: " + r);
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + " в кубе = " + cub(i));
//        }
//           printLine(1,1);
//           printLine(1,2);
//           printLine(1,3);
//           printLine(1,4);
//           printLine(1,5);
//        int n = 5;
//        for(int i = 0; i <= n; i++){
//            printLine(1,i);
//        }
//        for (int i = n-1; i > 0; i--){
//            printLine(1,i);
//        }
//sum(1,2,3,4,5);
//sum(1,2,3);
//sum();
//        sum("Welcome!", 20,10);

//
//        func_num(2, 7, 0, 3, 1, 5, -13);
//        func_num(2, 7, 0, 3, 1, 5, -13, 13);
//        func_num(26);
//        func_num(99, 99, 100, 34, -39);
//        func_num(99, 39, 99, 100, 34);

//        System.out.println(num(1,2,3,4,5,6,7,8,9));
//        System.out.println(num(3,6,1,9,5));
//    }

//    public static ArrayList num(int... args) {
//    ArrayList <Integer> mas = new ArrayList<>();
//    int sum = 0;
//    int count = 0;
//    float average;
//        for (int i:
//             args) {
//            sum += i;
//            count += 1;
//        }
//        average = (float) sum / count;
//        System.out.println(average);
//        for (int i : args){
//            if (i<average){
//                mas.add(i);
//            }
//        }
//    return mas;
//    }

//    int max = args[0];
////        System.out.println(max);
//        for(
//    int i :args)
//
//    {
//        if (i % 13 == 0 && i > 0) {
//            max = i;
//        }
//    }
//        if(args[0]%13!=0&&max ==args[0])
//
//    {
//        System.out.println("Число не найдено");
//    }else
//
//    {
//        System.out.println(max);
//    }
//}


//    public static void sum(String message, int ...nums){
//        System.out.println(message);
//int res = 0;
//        for (int n : nums) {
//            res +=n;
//        }
//        System.out.println(res);
//    }
//    public static void printLine(int start, int end){
//        for (int i = start; i <= end; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//    public static int cub(int a){
//        return a * a * a;
//    }
//    public static int c(int a, int b){
//        int c;
//        if(a > b){
//            c = a - b;
//        }
//        else {
//            c = a + b;
//        } return c;
//    }

//    public static int min(int n1, int n2) {
//        int min;
//        if (n1 > n2) {
//            min = n2;
//        } else {
//            min = n1;
//        }
//        return min;
//    }
//}


//        symbolDraw(9, '+', '-');
//        symbolDraw(7, 'X', 'O');
//int a = 30, b = 45;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        swapFanshion(a,b);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//    }
//    public static void  swapFanshion(int n, int m){
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
//        int c = n;
//        m = n;
//        m = c;


//    public static void symbolDraw(int count, char a, char b){
//        for (int i = 0; i < count; i++) {
//            if (i % 2==0){
//                System.out.print(a);
//            } else {
//                System.out.print(b);
//            }
//
//        }
//        System.out.println();
//

//    hello("Лиза");
//    hello("Игорь");

//getSum(2, 5);
//int a = 1, b = 7;
//getSum(a, b);
//int a1 = 3, b1 = 4;
//getSum(a1, b1);
//    }
//
//    public static void getSum(int a, int b){
//        System.out.println(a + b);
//    }
//    public static void hello(String name){
//        System.out.println("Hello, " + name + "!");
//    }


