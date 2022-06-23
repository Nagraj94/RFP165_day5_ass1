package com.bridgelabz;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        char a,e,i,o,u,A,E,I,O,U;
        String alpha;
        System.out.println("Java Program to Check Whether an Alphabet is Vowel or Consonant");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alphabets");
        alpha = sc.next();
        char beta = alpha.charAt(0);

        if(beta == 'a' || beta == 'e' || beta == 'i' || beta == 'o' || beta == 'u' || beta == 'A' || beta == 'E' || beta == 'I' || beta == 'O' || beta == 'U')
        {
            System.out.println("you have entered Vowel: " + beta);
        }
        else
        {
            System.out.println("you have entered Consonant: " + beta);
        }
    }
}
