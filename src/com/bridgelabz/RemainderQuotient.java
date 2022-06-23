package com.bridgelabz;

import java.util.Scanner;

public class RemainderQuotient {
    public static void main(String[] args) {
        int num1;
        int num2;
        int remainder = 0;
        int quotient = 0;
        System.out.println("Java Program to Compute Quotient and Remainder");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();

        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.println("when " + num1 + " is divided by "+ num2 + " we get quotient = " + quotient +" and remainder = "+ remainder);


    }
}
