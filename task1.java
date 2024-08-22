import java.util.Random;
import java.util.Scanner;

public class Numberguessing{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Maxattempts = 7;
        int score = 0;
        boolean playAgain;

        do {
            int targetnum = random.nextInt(100) + 1;
            int Attempts = 0;
            boolean isCorrect = false;

            System.out.println("Welcome to Number Guessing Game!");
            System.out.println("Guess any number between 1 & 100:");

            while (true) {
                if (attempts >= Maxattempts) {
                    break;
                }

                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                Attempts++;

                if (userGuess < targetnumr) {
                    System.out.println("Your guess is wrong. Don't loose hope try again.");
                } else if (userGuess > targetnum) {
                    System.out.println("Too high! Give it another shot.");
                } else {
                    System.out.println("Awesome! You've guessed the number correctly in " + Attempts + " attempts.");
                    score += Maxattempts - Attempts + 1;
                    isCorrect= true;
                    break;
                }
            }

            if (!isCorrect) {
                System.out.println("Unfortunately, you've used up all your attempts. The correct number was " + targetnumr + ".");
            }

            System.out.println("Your current total score: " + score);
            System.out.print("Do you want another chance? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thanks for playing! Your total score is: " + score);
        scanner.close();
    }
}
