package unit3;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many minutes?");
		
		int min = input.nextInt();
		double cost = 0;
		
		if (min <= 2)
			cost = 1.5;
		else if (min >= 3 && min <= 10) {
			min -= 2;
			cost += 1.5 + min * 0.5;
		}
		else {
			min -= 2;
			cost += 1.5 + (min % 10) * 0.5;
			min -= (min % 10);
			cost += min * 0.25;
		}
		
		System.out.println("The cost is $" + cost);
	}

}
