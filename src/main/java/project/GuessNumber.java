package project;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(1, 10 + 1);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter your number: ");
            try {
                int guessNumber = scanner.nextInt();
                if (guessNumber >= 1 && guessNumber <= 10) {
                    if (guessNumber > secretNumber) {
                        System.out.println("smaller.");
                    } else if (guessNumber < secretNumber) {
                        System.out.println("bigger.");
                    } else {
                        System.out.println("correct!");
                        break;
                    }
                } else {
                    System.out.println("out of bound.");
                }
            } catch (Exception e) {
                System.out.println("something went wrong.");
                break;
            }
        }
    }
}
