/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sanidhya Singh
 */
public class Number_game {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        int secretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 10; // You can adjust the maximum number of attempts here

        while (attempts < maxAttempts) {
            System.out.print("\nEnter your guess (1-100): ");
            try {
                int guess = scanner.nextInt();
                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number within the valid range (1-100).");
                    continue;
                }

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts!");
                    break;
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("\nSorry, you've run out of attempts. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }
}
