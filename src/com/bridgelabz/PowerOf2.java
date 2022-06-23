package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    static final int a = 2;

    public static void main(String[] args) {
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter power of 2 : ");
        b = sc.nextInt();
        System.out.println(Math.pow(a,b));
    }
}
