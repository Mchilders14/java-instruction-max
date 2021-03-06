import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberApp {

	private static void displayWelcome(int limit) {
		System.out.println("Guess the number!");
		System.out.println("I'm thinking of a number from 1 to " + limit);
		System.out.println();
	}

	public static int getRandomInt(int limit) {
		double d = Math.random() * limit; // d is >= 0.0 and < limit
		int randomInt = (int) d; // convert double to int
		randomInt++; // int is >= 1 and <= limit
		return randomInt;
	}

	public static void main(String[] args) {
		final int LIMIT = 10;

		displayWelcome(LIMIT);
		int number = getRandomInt(LIMIT);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int count = 1;

		while (true) {

			System.out.print("Your guess: ");
			int guess = 0;

			// Using hasNext method for data validation.
			if (sc.hasNextInt()) {

				guess = sc.nextInt();

				if (guess < 1 || guess > LIMIT) {
					System.out.println("Invalid guess. Try again.");
					continue;
				}

				if (guess < number) {
					System.out.println("Too low.");
				} else if (guess > number) {
					System.out.println("Too high.");
				} else {
					System.out.println("You guessed it in " + count + " tries.\n");
					break;
				}
				count++;

			} else {
				System.out.println("Error! Invalid number. Try again.");
			}
			
			sc.nextLine();

			/*
			 * // Try/catch validation method for number.
			 * try {
			 * System.out.print("Your guess: "); int guess = sc.nextInt(); if (guess < 1 ||
			 * guess > LIMIT) { System.out.println("Invalid guess. Try again."); continue; }
			 * 
			 * if (guess < number) { System.out.println("Too low."); } else if (guess >
			 * number) { System.out.println("Too high."); } else {
			 * System.out.println("You guessed it in " + count + " tries.\n"); break; }
			 * count++; } catch (InputMismatchException e) {
			 * System.out.println("Error! Invalid number. Try again.\n"); sc.nextLine();
			 * continue; }
			 */
		}

		System.out.println("Bye!");
	}
}