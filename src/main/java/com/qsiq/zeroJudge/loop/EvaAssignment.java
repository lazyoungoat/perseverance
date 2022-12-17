package com.qsiq.zeroJudge.loop;

import java.util.Scanner;

public class EvaAssignment {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
        while(scanner.hasNextInt()){
            int i=0;
            int inputNumber1 = Integer.parseInt(scanner.next());
            i++;
//            int inputNumber2 = Integer.parseInt(input);
            int inputNumber2 = Integer.parseInt(scanner.next());
            i++;
//            int inputNumber3 = Integer.parseInt(input);
            int inputNumber3 = Integer.parseInt(scanner.next());
            i++;
//            int inputNumber4 = Integer.parseInt(input);
            int inputNumber4 = Integer.parseInt(scanner.next());
            i++;
//            if (inputNumber1<105 && inputNumber2<105 && inputNumber3<105 && inputNumber4<105){
//            };
            if (i==4){
                break;
            }
            int check1 = inputNumber1-inputNumber2;
            int check2 = inputNumber2-inputNumber3;
            int check3 = inputNumber3-inputNumber4;

            if((check1==check2)&&(check2==check3)){
                for (i=0;i<5;i++){
                    System.out.println(i+=check1);
                }
            }
        }
    }
}
