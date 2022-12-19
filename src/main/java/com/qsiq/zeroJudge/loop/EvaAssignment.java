package com.qsiq.zeroJudge.loop;

import java.util.Scanner;

public class EvaAssignment {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int seqNumber = scanner1.nextInt();
        for (int j = 0; j < seqNumber; j++) {

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int inputNumber1 = scanner.nextInt();
                int inputNumber2 = scanner.nextInt();
                int inputNumber3 = scanner.nextInt();
                int inputNumber4 = scanner.nextInt();

                int additionCheck1 = inputNumber2 - inputNumber1;
                int additionCheck2 = inputNumber3 - inputNumber2;
                int additionCheck3 = inputNumber4 - inputNumber3;

                if ((additionCheck1 == additionCheck2) && (additionCheck2 == additionCheck3)) {
                    int firstInput = inputNumber1;
                    for (int i = 1; i < 6; i++) {
                        if (i == 1) {
                            System.out.print(inputNumber1 + " ");
                        }
                        if (i > 1) {
                            int output;
                            int commonDifference = additionCheck1;
                            output = firstInput + commonDifference;
                            System.out.print(output + " ");
                            firstInput = output;
                        }

                    }
                }

                int multipleCheck1 = inputNumber2 % inputNumber1;
                int multipleCheck2 = inputNumber3 % inputNumber2;
                int multipleCheck3 = inputNumber4 % inputNumber3;

                if ((multipleCheck1 == multipleCheck2) && (multipleCheck2 == multipleCheck3)) {
                    int firstInput = inputNumber1;
                    for (int i = 0; i < 6; i++) {
                        if (i == 1) {
                            System.out.print(inputNumber1 + " ");
                        }
                        if (i > 1) {
                            int commonRatio = inputNumber3 / inputNumber2;
                            int output = firstInput * commonRatio;
                            System.out.print(output + " ");
                            firstInput = output;
                        }
                    }
                }
                break;
            }
        }
    }
}
