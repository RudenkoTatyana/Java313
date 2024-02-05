package Metod;

import java.util.Scanner;

public class homeWork10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер фигуры (1-прямоугольник, 2-треугольник, 3-круг): ");
        int a = input.nextInt();
        if (a==1){
            System.out.print("Сторона 1: ");
            int s1= input.nextInt();
            System.out.print("Сторона 2: ");
            int s2= input.nextInt();
            System.out.print("Площадь: ");
            pr(s1,s2);

        } else if (a==2){
            System.out.print("Основание: ");
            int o = input.nextInt();
            System.out.print("Высота: ");
            int h = input.nextInt();
            System.out.print("Площадь: ");
            tr(o,h);

        } else if (a==3) {
            System.out.print("Радиус: ");
            int r = input.nextInt();
            System.out.println("Площадь: ");
            k(r);

        } else {
            System.out.println("Введен неправильный номер.");
        }
    }
    public static void pr(int a, int b){
        System.out.println(a*b);
    }
    public static void tr(int a, int b){
        System.out.println(a*b/2);
    }
    public static void k(int r){
        System.out.println(Math.round(Math.pow(r,2)*Math.PI));
    }
}
