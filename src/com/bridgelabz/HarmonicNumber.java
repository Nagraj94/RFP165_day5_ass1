package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int num;
        double result = 0.0;
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("harmonic series is: ");
        for (int i=num;i>0;--i ){
            result = result + (double) 1 / i;
            System.out.print(result + ", ");
        }

    }
}
