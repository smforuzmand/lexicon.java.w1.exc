import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args)
    {
        final int MAX = 500;
        int answer, guess;
        Scanner sc = new Scanner(System.in);
        Random number = new Random();
        boolean correct = false;
        answer = number.nextInt(MAX) + 1;

        while (!correct) {

            System.out.println("Guess a number between 1 and 500: ");

            guess = sc.nextInt();

            if (guess > answer) {
                System.out.println("Too big, try again");
            }

            else if (guess < answer) {
                System.out.println("Too low, try again");
            }

            else {

                System.out.println("correct guessed number.");
                correct = true;
            }
        }
    }
}
