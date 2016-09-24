package unit3;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the value of N: ");
		int n = input.nextInt();
		
		double e = 0;
		int factorial = 1;
		
		for (int i = 0; i <= n; i++) {
			if (i == 0)
				factorial = 1;
			else {
				factorial = 1;
				for (int j = 1; j <= i; j++) {
					factorial *= j;
				}
			}
			e += 1.0/factorial;
		}
		System.out.println("e is " + e);
	}
}
