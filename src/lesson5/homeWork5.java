package lesson5;

import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int i = 0;
        while (i < 5) {
            if (i >= 1){
                System.out.print("*");
            }
            int j = 1;
            while (j < i) {
                if (i < 4) {
                    System.out.print(" ");
                }
                j++;
                if (i == 4){
                    System.out.print("*");
                }
            }
            System.out.println("*");
            i++;
        }




        }
    }
