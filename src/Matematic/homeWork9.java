package Matematic;
import java.util.*;
public class homeWork9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Выбор фигуры: \n 1- треугольник\n 2- прямоугольник\n 3- круг\n: ");
        int f = input.nextInt();
        if (f==1){
            System.out.print("Введите длину основания: ");
            int a = input.nextInt();
            System.out.print("Введите высоту: ");
            int h = input.nextInt();
            System.out.print("Площадь треугольника: " + (a * h)/2);
        } else if (f==2){
            System.out.print("Введите длину: ");
            int a = input.nextInt();
            System.out.print("Введите ширину: ");
            int b = input.nextInt();
            System.out.print("Площадь прямоугольника: " + (a * b));
        } else if (f==3) {
            System.out.print("Введите радиус: ");
            int r = input.nextInt();
            System.out.print("Площадь круга: " + Math.round(Math.pow(r,2)*Math.PI));

        } else {
            System.out.print("Неправильно введен номер фигуры.");
        }


    }
}
