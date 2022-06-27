package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int temp;
        int largest;
        System.out.println("Java Program to Find the Largest Among Three Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        a = sc.nextInt();
        System.out.print("enter second number: ");
        b = sc.nextInt();
        System.out.print("enter third number: ");
        c = sc.nextInt();

        temp = a>b?a:b;
        largest = temp>c?temp:c;
        System.out.println("******************************");
        System.out.print("largest number among you have entered: " + largest);
    }
}
