package com.qsiq.zeroJudge.loop;

import java.util.Scanner;

public class EvaAssignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();

        for (int i = 0; i < loop; i++) {

            Scanner scanner1 = new Scanner(System.in);

            int num1 = scanner1.nextInt();
            int num2 = scanner1.nextInt();
            int num3 = scanner1.nextInt();
            int num4 = scanner1.nextInt();

            if ((num3 - num2) == (num2 - num1)) {
                System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + (num4 + (num2 - num1)));
            } else {
                System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + (num4 * (num2 / num1)));
            }
        }
    }
}
