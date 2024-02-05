package Metod;

import java.util.*;
public class Metod2 {
//    public static void main(String[] args) {
//int a = 7;
//int b = 3;
//double c = 5.1;
//double d = 7.2;
//int res1 = min (a,b);
//double res2 = min (c,d);
//        System.out.println(res1);
//        System.out.println(res2);
//    }
//    public static int min(int n1, int n2){
//        int min;
//        if (n1>n2){
//            min = n2;
//        }
//        else{
//            min = n1;
//        }
//        return min;
//    }
//    public static double min(double n1, double n2){
//        double min;
//        if (n1>n2){
//            min = n2;
//        }
//        else{
//            min = n1;
//        }
//        return min;
//
//    }
//    int num = 4;
//    String str = "2x2 = ";
//    print(str);
//    print(num);
//    print(str, num);
//
//    }
//    public static void print(String text){
//        System.out.println(text);
//    }
//    public static void print(int num){
//        System.out.println(num);
//    }
//    public static void print(String text, int num){
//        System.out.println(text + num);
//    }

//    int a = 7, b = 3, c= 5;
//    int res1 = sum(a,b);
//    int res2 = sum(a,b,c);
//        System.out.println(res1);
//        System.out.println(res2);
//    }
//public static int sum(int n1, int n2){
//int sum = n1 + n2;
//return sum;
//}
//    public static int sum(int n1, int n2, int n3){
//        int sum = n1 + n2 + n3;
//        return sum;
//
//double num1 = get_number();
//double num2 = get_number();
//char operation = getOperation();
////        System.out.println(operation);
//        double result = calc(num1, num2, operation);
//        System.out.println("Результат: " + result);
//
//    }
//    public static double get_number(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        if (input.hasNextDouble()){
//            return input.nextDouble();
//        }else{
//            System.out.println("Ошибка при вводе. Повторите ввод.");
//            return get_number();
//        }
//
//    }
//public static char getOperation() {
//    Scanner input = new Scanner(System.in);
//    System.out.print("1-сумма/n2-разность/n3-произведение/n4-частное/nВыберите номер операции: ");
//    int operationNumber = 0;
//    if (input.hasNextInt()) {
//        operationNumber = input.nextInt();
//    } else {
//        System.out.println("Повторите ввод.");
//        return getOperation();
//    }
//    switch (operationNumber) {
//        case 1:
//            return '+';
//        case 2:
//            return '-';
//        case 3:
//            return '*';
//        case 4:
//            return '/';
//        default:
//            System.out.println("Неправильная операция.");
//            return getOperation();
//    }
//}
//    public static double add(double a, double b){
//        return a + b;
//    }
//    public static double calc(double num1, double num2, char operation){
//        switch (operation){
//            case '+':
//                return add(num1, num2);
//            case '-':
//                return sub(num1, num2);
//            case '*':
//                return mul(num1, num2);
//            case '/':
//                return div(num1, num2);
//            default:
//                return Double.NaN;
//        }
//    }
//    public static double sub(double a, double b){
//        return a - b;
//    }
//    public static double mul(double a, double b){
//        return a * b;
//    }
//    public static double div(double a, double b) {
//        if (b != 0.0) {
//            return a / b;
//        }
//else{
//            System.out.println("На ноль делить нельзя.");
//            return Double.NaN;
//        }
//    }

//int[] mas = {1, 3, 5, 7, 9};
////        System.out.println(sumList(mas));
//        System.out.println(sumList(0, mas));
//    }
//
//        System.out.println(toStr(254, 10));
//    }
//    public static String toStr(int n, int base){
//        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "F"};
//        if (n<base){
//            return convert[n];
//        } else {
//            return toStr(n/base, base) + convert[n%base];
//        }
//    }


//public static int sumList(int i, int[] arr){
//        if (i == arr.length - 1){
//            return arr[i];
//        }
//        return arr[i] + sumList( i + 1, arr);
//
//}
//public static int sumList(int[] arr){
//        int sum = 0;
//    for (int i: arr) {
//        sum +=i;
//    }
//        return sum;
//}

}
