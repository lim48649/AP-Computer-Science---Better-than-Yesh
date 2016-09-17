package unit3;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		
		if (num < (2 * Math.pow(10, 9)) && num > 0) {
			if (num == 1) {
				System.out.println("Not");
			}
			else {
				boolean primeOrNot = isPrime(num);
				if (primeOrNot)
					System.out.println("Prime");
				else
					System.out.println("Not");
			}
		}
	}
	
	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
