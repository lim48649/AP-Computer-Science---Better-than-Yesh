package unit3;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		boolean running = true;
		int num = (int) (Math.random() * 100);
		int tries = 0;
		
		System.out.println("Guess A Secret Number from 1 to 100: ");
		int guess;
		
		while (running) {
			System.out.print("> ");
			guess = input.nextInt();
			tries++;
			
			if (guess > num) {
				System.out.println("Too High. Guess again");
			}
			else if (guess < num) {
				System.out.println("Too Low. Guess again");
			}
			else {
				System.out.println("Exactly! You guessed it in " + tries + " tries!");
				running = false;
			}
		}
	}

}
