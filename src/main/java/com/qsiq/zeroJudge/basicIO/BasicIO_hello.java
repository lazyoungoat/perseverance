package com.qsiq.zeroJudge.basicIO;

import java.util.Scanner;

public class BasicIO_hello {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("hello, " + input);

    }
}
