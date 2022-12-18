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

            int additionCheck1 = inputNumber2-inputNumber1;
            int additionCheck2 = inputNumber3-inputNumber2;
            int additionCheck3 = inputNumber4-inputNumber3;

            if((additionCheck1==additionCheck2)&&(additionCheck2==additionCheck3)){
                for (int i=1;i<6;i++){
                    if (i==1){
                        System.out.println(inputNumber1);
                    }
                    if (i>1){
                        int output;
                        int commonDifference = additionCheck1;
                        output = inputNumber1 + commonDifference;
                        System.out.println(output);
                        inputNumber1 = output;
                    }

                }
            }

            int multipleCheck1 = inputNumber2 / inputNumber1;
            int multipleCheck2 = inputNumber3 / inputNumber2;
            int multipleCheck3 = inputNumber4 / inputNumber3;

            if ((multipleCheck1==multipleCheck2)&&(multipleCheck2==multipleCheck3)){
                for (int i=0;i<6;i++){
                    if (i==1){
                        System.out.println(inputNumber1);
                    }
                    if (i>1){
                        int commonRatio = inputNumber3 / inputNumber2;
                        int output = inputNumber1 * commonRatio;
                        System.out.println(output);
                        inputNumber1 = output;
                    }
                }
            }
        }
    }
}
