package edu.academy.firsthomework;

public class pobitovi2Main {
    public static void main(String[] args) {
        int x = 42;//00101010
        int y = 15;//00001111

            System.out.println("~x = " + ~x + "; " + (Integer.toBinaryString(~x)));
            System.out.println("~y = " + ~y + "; " + (Integer.toBinaryString(~y)));
            System.out.println("x & y = " + (x & y) + "; " + (Integer.toBinaryString(x & y)));
            System.out.println("x | y = " + (x | y) + "; " + (Integer.toBinaryString(x | y)));
            System.out.println("x ^ y = " + (x ^ y) + "; " + (Integer.toBinaryString(x ^ y)));
            System.out.println("x >> 2 = " + (x >> 2) + "; " + (Integer.toBinaryString(x >> 2)));
            System.out.println("x << 2 = " + (x << 2) + "; " + (Integer.toBinaryString(x << 2)));
            System.out.println("x >>> 2 = " + (x >>> 2) + "; " + (Integer.toBinaryString(x >>> 2)));
            System.out.println("y >> 2 = " + (y >> 2) + "; " + (Integer.toBinaryString(y >> 2)));
            System.out.println("y >>> 2 = " + (y >>> 2) + "; " + (Integer.toBinaryString(y >>> 2)));
            System.out.println("y << 2 = " + (y << 2) + "; " + (Integer.toBinaryString(y << 2)));
    }
}

