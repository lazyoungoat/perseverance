package com.qsiq.zeroJudge.calendar;

import java.util.Scanner;

public class DodoFortuneTeller {
    public static void main(String[] args){
//        System.out.println("Enter the date: ");
        Scanner scanner = new Scanner(System.in);

        scanner.hasNextInt();

        int month = Integer.parseInt(scanner.next());
        int day = Integer.parseInt(scanner.next());
        int fortune = (month*2+day)%3;

        switch (fortune){
            case 0:
                System.out.println("normal");
                break;
            case 1:
                System.out.println("lucky");
                break;
            case 2:
                System.out.println("very lucky");
                break;
        }
//        switch (fortune) {
//            case 0 -> System.out.println("normal");
//            case 1 -> System.out.println("lucky");
//            case 2 -> System.out.println("very lucky");
//        }
    }
}
