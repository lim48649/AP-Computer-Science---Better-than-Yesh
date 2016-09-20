package unit3;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an iteration of PI: ");
		
		int iterations = input.nextInt();
		double pi = 4.0;
		
		if (iterations >= 1) {
			double sequence = 1;
			for (int i = 1; i < iterations; i++) {
				if (i % 2 == 0)
					sequence += 1.0/(1+2*i);
				else
					sequence -= 1.0/(1+2*i);
			}
			pi *= sequence;
		}
		
		System.out.println("PI is: " + pi);
	}

}
