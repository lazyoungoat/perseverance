package com.qsiq.zeroJudge.loop;

import java.util.Scanner;

//seq = sequence
public class EvaAssignment2 {
    public static void main(String[] args) {
        int[][] seqValue = new int[20][5];
        Scanner scanner = new Scanner(System.in);
        int seqNumber = scanner.nextInt();
        int i;
        for (i = 0; i < seqNumber; i++) {
            for (int j = 0; j < 4; j++) {
                Scanner scanner1 = new Scanner(System.in);
                int inputValue = scanner1.nextInt();
                seqValue[i][j] = inputValue;
            }
            int additionCheck1 = seqValue[i][2] - seqValue[i][1];
            int additionCheck2 = seqValue[i][3] - seqValue[i][2];
            int additionCheck3 = seqValue[i][4] - seqValue[i][3];

            int multipleCheck1 = seqValue[i][2] / seqValue[i][1];
            int multipleCheck2 = seqValue[i][3] / seqValue[i][2];
            int multipleCheck3 = seqValue[i][4] / seqValue[i][3];

            seqValue[i][5] = 0;

            if ((additionCheck1==additionCheck2)&&(additionCheck2==additionCheck3)){
                seqValue[i][5] = seqValue[i][4] + additionCheck1;
                for (int k=0;k<5;k++){
                    System.out.println(seqValue[i][k] + " ");
                }
            }else if ((multipleCheck1==multipleCheck2)&&(multipleCheck2==multipleCheck3)){
                seqValue[i][5] = seqValue[i][4]*multipleCheck1;
                for (int k=0;k<5;k++){
                    System.out.println(seqValue[i][k] + " ");
                }
            }



        }


    }
}
