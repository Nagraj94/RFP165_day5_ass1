package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        String  year;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("enter year to find leap year: ");
            year = sc.next();
            if (year.length() != 3)
                break;
            System.out.println("enter valid year.");
        }
        int a = Integer.parseInt(year);
        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
        {
            System.out.println("you have entered leap year");
        }
        else
        {
            System.out.println("you have not entered leap year");
        }

    }
}
