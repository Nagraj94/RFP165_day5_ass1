package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        double head = 0;
        double results;
        int nTimes;

        Scanner sc = new Scanner(System.in);
        while (true)
       {
           System.out.println("enter how many times to flip the coin: ");
            nTimes = sc.nextInt();
           if(nTimes>0)
               break;
           System.out.println("enter positive integer number");
           System.out.println("******************************");
       }
        while (nTimes<1000){
            results = Math.random();
            if (results<=0.5)
                head++;
            nTimes = nTimes+1;
        }
        double percentHeads = head/nTimes*100;
        double percentTails = (nTimes-head)/nTimes*100;
        System.out.println("percentage of heads is: " +percentHeads);
        System.out.println("percentage of tails is: " +percentTails);
    }
}
