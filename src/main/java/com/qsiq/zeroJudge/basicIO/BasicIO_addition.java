package com.qsiq.zeroJudge.basicIO;

import java.util.Scanner;

public class BasicIO_addition {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            if (-1000000<scanner.nextInt() && scanner.nextInt()<1000000) {
                System.out.println(scanner.nextInt() + scanner.nextInt());
            }
        }

    }
}
