package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    int age = 28;
//    boolean isYoung = age>=18;
//    boolean isOld = age <=65;
//    if(isYoung && isOld){
//        System.out.println("Вы можете работать");
//    }
//    else{
//        System.out.println("Работать не обязательно");
//    }
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите первую сторону: ");
//        int a = input.nextInt();
//        System.out.print("Введите вторую сторону: ");
//        int b = input.nextInt();
//        System.out.print("Введите третью сторону: ");
//        int c = input.nextInt();
//        if(a==b & b==c & c==a){
//            System.out.println("Треугольник равносторонний");
//        }
//        else if(a == b | b == c | c == a){
//            System.out.println("Треугольник равнобедренный");
//        }
//        else{
//            System.out.println("Треугольник разносторонний");
//        }
//        input.close();
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите количество ворон: ");
//        int v = input.nextInt();
//        if(v>= 0 && v<=9) {
//
//            System.out.print("на ветке ");
//             if (v == 1) {
//                System.out.println(v + " ворона");
//            } else if (v == 2 || v == 3 || v == 4) {
//                System.out.println(v + " вороны");
//            } else if (v >= 5 || v== 0) {
//                System.out.println(v + " ворон");
//            }
//        }
//        else{
//            System.out.println("Ошибка ввода");
//        }


//        input.close();
        Scanner input = new Scanner(System.in);

//        int day, time;
//        System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if(day >=1 && day <=5){
//            System.out.print("Введите время: ");
//            time = input.nextInt();
//            System.out.print(" Рабочий день. ");
//            if(time >=8 && time<=17){
//                System.out.println("Открыто.");
//            }
//            else{
//                System.out.println("Закрыто. Откроется в 8:00");
//            }
//        }
//        else if(day ==6 || day ==7){
//            System.out.println("Выходной день.");
//        }
//        else{
//            System.out.println("Такого дня недели не существует.");
//        }

//        int day;
//        System.out.print("Введите день недели (цифрами):");
//        day = input.nextInt();
//        if(day >=1 && day<=7){
//            if(day>=1 && day<=5){
//                System.out.print("Рабочий день - ");
//                if(day==1){
//                    System.out.print("Понедельник");
//                }
//                else if(day==2){
//                    System.out.print("Вторник");
//                }
//                else if(day==3){
//                    System.out.print("Среда");
//                }
//                else if(day==4){
//                    System.out.print("Четверг");
//                }
//                else{
//                    System.out.print("Пятница");
//                }
//            }
//            else{
//                System.out.print("Выходной день - ");
//            }
//            if(day==6){
//                System.out.print("Суббота");
//            }
//            else{
//                System.out.print("Воскресенье");
//            }
//
//        }
//        else{
//            System.out.println("Такого дня недели не существует.");
//        }

//        int number, res;
//        number = -10;
//        res = number >=0 ? number : -number;
//        System.out.println(res);

//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        System.out.println(age >=18 ? "Приятного просмотра." : "Вам рано смотреть этот фильм.");


//        int a = 20, b = 10;
//        System.out.println(a == b ? "a == b" : a > b ? "a > b" : "b > a");

//        int a = 5, b = 0;
//        System.out.println(b == 0 ? "На ноль делить нельзя" : (float)a/b);
//

//        int n;
//        System.out.print("\t Выберете цвет светофора \n1 (11) - красный, 2 (22) - желтый, 3 (33) - зеленый: ");
//        n = input.nextInt();
//
//        switch (n){
//            case 1:
//            case 11:
//                System.out.println("Стоим.");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились.");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем.");
//                break;
//            default:
//                System.out.println("Такого цвета у светофора нет.");
//                break;


//        int month, year, numDays = 0;
//        System.out.print("Введите месяц (числом): ");
//        month = input.nextInt();
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDays = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDays = 30;
//                break;
//            case 2:
//                System.out.print("Введите год: ");
//                year = input.nextInt();
//                if(year % 4 == 0){
//                    numDays = 29;
//                } else{
//                    numDays = 28;
//                } break;
//            default:
//                System.out.println("Такого месяца не существует.");
//        }
//        System.out.println("Количество дней: " + numDays);


//        int month;
//        System.out.print("Введите номер месяца (1-12): ");
//        month = input.nextInt();
//        switch (month) {
//            case 1, 2, 12 -> System.out.println("Зима");
//            case 3, 4, 5 -> System.out.println("Весна");
//            case 6, 7, 8 -> System.out.println("Осень");
//            case 9, 10, 11 -> System.out.println("Осень");
//
//            default -> System.out.println("Такого месяца не существует");
//        }
//        int month;
//        System.out.print("Введите номер месяца (1-12): ");
//        month = input.nextInt();
//        String s = switch (month) {
//            case 1, 2, 12 -> "Зима";
//            case 3, 4, 5 -> "Весна";
//            case 6, 7, 8 -> "Осень";
//            case 9, 10, 11 -> "Осень";
//
//            default -> "Такого месяца не существует";
//        };
//        System.out.println(s);

//        System.out.print("Введите балл по 12 бальной системе оценивания: ");
//        int num = input.nextInt();
//
//        System.out.print("Ваш балл по 5 бальной системе оценивания: ");
//        switch (num >= 1 && num <= 3 ? 2 : num >= 4 && num <= 6 ? 3 : num >= 7 && num <= 9 ? 4 : num >= 10 && num <= 12 ? 5 : 0) {
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Такого значения нет.");
//        }


    }
}
