import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxattempts = 10;
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int generateNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("Welcome to the Guess the Number Game!");
            System.out.println("Guess a number between " + minRange + " and " + maxRange + ". You have " + maxattempts + " attempts.");

            while (attempts < maxattempts) {
                System.out.print("Enter your guess number: ");
                int guess = scanner.nextInt();

                if (guess == generateNumber) {
                    System.out.println("Congratulations!! You guessed the number in " + attempts + "attempts");
                    score++;
                    break;
                } else if (guess < generateNumber) {
                    System.out.println("Too low!! Try again.");
                } else {
                    System.out.println("Too high!! Try again.");
                }
                attempts++;
            }

            if (attempts == maxattempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + generateNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Your final score is: " + score);
        System.out.println("Thanks for playing.");
        scanner.close();
    }
}
