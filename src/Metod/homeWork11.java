package Metod;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class homeWork11 {
    public static void main(String[] args) {
        int [] mas1 = {3, 8, 9, 4, 1, 2, 5};
        int [] mas2 = {1, 2, 5};
        mas(mas1);
        mas(mas2);
    }

    public static void mas(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] < arr[i]) {
                arr[0] = arr[i+1];
                System.out.println(arr[0]);
            }

        }

    }
}
