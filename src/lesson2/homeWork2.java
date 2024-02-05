package lesson2;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("How old are you? ");
        int age = input.nextInt();
        System.out.print("Where are you live? ");
        String city = input.next();
        System.out.printf(" This is %s.%n It is %d.%n He lives in %s.%n", name, age, city);
        input.close();

        String a = "Переменная типа byte занимает ";
        String b = " Байт памяти (";
        String c = " бит памяти), и принимает значения в диапазоне от ";
        String d = " до ";

        System.out.printf( "%-30s%3d" , a , Byte.BYTES );
        System.out.printf( "%-2s%2d", b , Byte.SIZE );
        System.out.printf( "%-2s%2d", c , Byte.MIN_VALUE );
        System.out.printf( "%-2s%2d%n", d , Byte.MAX_VALUE );
        a = "Переменная типа short занимает ";
        System.out.printf( "%-30s%2d" , a , Short.BYTES );
        System.out.printf( "%-2s%2d", b , Short.SIZE );
        System.out.printf( "%-2s%2d", c , Short.MIN_VALUE );
        System.out.printf( "%-2s%2d%n", d , Short.MAX_VALUE );
        a = "Переменная типа int занимает ";
        System.out.printf( "%-30s%3d" , a , Integer.BYTES );
        System.out.printf( "%-2s%2d", b , Integer.SIZE );
        System.out.printf( "%-2s%2d", c , Integer.MIN_VALUE );
        System.out.printf( "%-2s%2d%n", d , Integer.MAX_VALUE );
        a = "Переменная типа long занимает ";
        System.out.printf( "%-30s%3d" , a , Long.BYTES );
        System.out.printf( "%-2s%2d", b , Long.SIZE );
        System.out.printf( "%-2s%2d", c , Long.MIN_VALUE );
        System.out.printf( "%-2s%2d%n", d , Long.MAX_VALUE );
        a = "Переменная типа float занимает ";
        System.out.printf( "%-30s%2d" , a , Float.BYTES );
        System.out.printf( "%-2s%2d", b , Float.SIZE );
        System.out.printf( "%s%f", c , Float.MIN_VALUE );
        System.out.printf( "%s%f%n", d , Float.MAX_VALUE );
        a = "Переменная типа double занимает ";
        System.out.printf( "%-30s%1d" , a , Double.BYTES );
        System.out.printf( "%-2s%2d", b , Double.SIZE );
        System.out.printf( "%s%f", c , Double.MIN_VALUE );
        System.out.printf( "%s%f%n", d , Double.MAX_VALUE );
    }
}
