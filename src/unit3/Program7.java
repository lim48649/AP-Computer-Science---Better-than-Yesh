package unit3;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("I am trying to guess your number. Use -1, 0, 1 for indicate if my guess was too low, correct, or too high.");
		
		int guess;
		int max = 100;
		int min = 1;
		boolean running = true;
		int res;
		
		while (running) {
			guess = (int) (Math.random() * max) + min; 
			System.out.println("My Guess: " + guess);
			System.out.println("Am I correct?");
			
			res = input.nextInt();
			
			if (res == -1) {
				min++;
//				min += (int) (Math.random() * 10) + 1;
			}
			else if (res == 1) {
				max--;
//				max -= (int) (Math.random() * 10) + 1;
			}
			else
				running = false;
		}
		
		System.out.println("Yay I guessed your number :)");
	}

}
