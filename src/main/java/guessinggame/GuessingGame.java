package guessinggame;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String[] args) {
		System.out.println("Welcome to the guessing game");
		System.out.println("Enter a number between 1-10:");

		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int numberOfGuesses = 1;
		int correctAnswer = rand.nextInt(10);
		correctAnswer += 1;
		System.out.println("The correct answer is: " + correctAnswer);
		int guess = input.nextInt();

		while (numberOfGuesses != 3 && guess != correctAnswer && guess != -1) {
			if (guess > 0 && guess < correctAnswer) {
				System.out.println("You guessed " + guess);
				System.out.println("Wrong answer, the correct number is higher, try again:");
				numberOfGuesses++;
				guess = input.nextInt();
			} else if (guess > correctAnswer) {
				System.out.println("You guessed " + guess);
				System.out.println("wrong answer, the correct number is lower, try again:");
				numberOfGuesses++;
				guess = input.nextInt();
			} else if (guess == 0) {
				System.out.println("Guess the correct number between 1 and 10");
				guess = input.nextInt();
			}
		}

		if (guess == correctAnswer) {
			System.out.println("You win");
		} else if (numberOfGuesses == 3 && guess != correctAnswer && guess != -1) {
			System.out.println("Sorry you lose! The correct answer was: " + correctAnswer);
		}
	}
}
