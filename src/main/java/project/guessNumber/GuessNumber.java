package project.guessNumber;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(1, 10 + 1);
        System.out.println(secretNumber);
        Scanner scanner = new Scanner(System.in);
        try {

            for (int i = 0; i < 5; i++) {
                System.out.println("Please enter your number: ");
                String str = scanner.next();
                int guessNumber = Integer.parseInt(str);
                if (guessNumber >= 1 && guessNumber <= 10) {
                    if (guessNumber > secretNumber) {
                        System.out.println("Smaller.");
                    } else if (guessNumber < secretNumber) {
                        System.out.println("Bigger.");
                    } else {
                        System.out.println("Correct!");
                        break;
                    }
                } else {
                    System.out.println("Out of bound.");
                }

            }
        } catch (Exception e) {
            System.out.println("Do not enter something else rather than an integer.");
        }
    }
}
