package lesson1;

import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class HomeWorknew {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int penny;

        System.out.print("Введите число от 1 до 99: ");
        penny = input.nextInt();
        int a = penny %10;
        if (penny <= 99 && penny >= 1) {
            if (a >=5 || a==0 || penny>=10 && penny<=20){
                System.out.println(penny + " копеек");
            }
            else if(a >= 2 && a <=4){
                System.out.println(penny + " копейки");
            }
            else if(penny == 1 || a==1) {
                    System.out.println(penny + " копейка");
            }

        }
            else {
                System.out.println("Ошибка ввода данных");
            }

        }
    }