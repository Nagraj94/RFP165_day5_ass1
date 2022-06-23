package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Java Program to Swap Two Numbers");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value for a: ");
        a = scanner.nextInt();
        System.out.print("enter value for b: ");
        b = scanner.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("after swapping number value of 'a' is "+ a + " and value for 'b' is " +b);

    }
}
