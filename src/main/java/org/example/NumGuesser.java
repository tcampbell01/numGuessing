package org.example;

import java.util.Random;
import java.util.Scanner;

public class NumGuesser {

    //TODO: add error handling
    //TODO: add loops and break;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game.");

        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(10) + 1;
            boolean correctChoice = false;

            while (!correctChoice) {
                System.out.print("Enter a number from 1 to 10: ");
                int num = input.nextInt();
                if (num == randomNumber) {
                    correctChoice = true;
                    System.out.println("Congratulations!");
                } else {
                    System.out.println("Sorry, try again.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        input.close();
    }
}
