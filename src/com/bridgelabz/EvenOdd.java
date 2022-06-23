package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check even or odd");
        a = sc.nextInt();
        if (a % 2 == 0)
        {
            System.out.println("you have entered even number");
        }
        else
        {
            System.out.println("you have entered odd number");
        }
    }
}
