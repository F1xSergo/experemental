package edu.academy.thirdhomework;

import java.util.Scanner;

public class ArraysForEach {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = new int[5];

        System.out.println("Введите элементы");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();

        }
        System.out.println("массив состоит из : ");
        for (int wd : ar) {
            System.out.print(wd + " ");
        }
    }
}
