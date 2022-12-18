package com.qsiq.zeroJudge.loop;

import java.util.Scanner;

public class EvaAssignment {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int inputNumber1 = scanner.nextInt();
            int inputNumber2 = scanner.nextInt();
            int inputNumber3 = scanner.nextInt();
            int inputNumber4 = scanner.nextInt();

            int check1 = inputNumber2-inputNumber1;
            int check2 = inputNumber3-inputNumber2;
            int check3 = inputNumber4-inputNumber3;

            if((check1==check2)&&(check2==check3)){
                for (int i=1;i<6;i++){
                    if (i==1){
                        System.out.println(inputNumber1);
                    }
                    if (i>1){
                        int output;
                        output = inputNumber1 + check1;
                        System.out.println(output);
                        inputNumber1 = output;
                    }

                }
            }
        }
    }
}
