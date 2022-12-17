package com.qsiq.zeroJudge.calendar;

import java.util.Scanner;

public class WenProposal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int year = Integer.parseInt(scanner.next());
            if (year%4==0 && year%100!=0){
                System.out.println("leap year");
            }else if (year%400==0){
                System.out.println("leap year");
            }else{
                System.out.println("non-leap year");
            }
        }
    }
}
