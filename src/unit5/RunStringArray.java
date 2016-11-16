package unit5;

import java.util.Scanner;

public class RunStringArray {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer");
		System.out.print("> ");
		
		int N = input.nextInt();
		
		String[] x = new String[N];
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter a string");
			System.out.print("> ");
			
			x[i] = input.next();
		}
		
		System.out.println("What letter do you want to count?");
		System.out.print("> ");
		
		String letter = input.next();
		int counter = 0;
		for (String s:x) {
			counter += count(s, letter);
		}
		
		System.out.println("The letter " + letter + " was found " + counter + " times.");
	}

	private static int count(String str, String letter) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i+1).toUpperCase().equals(letter.toUpperCase()))
				count++;
		}
		return count;
	}
}