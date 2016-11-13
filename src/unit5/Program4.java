package unit5;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive odd integer: ");
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("You entered an even number. Bye Bye!");
		}
		else {
			for (int i = 0; i < num/2 + 1; i++) {
				for (int j = 0; j < num; j++) {
					if (j >= i && j < num-i)
						System.out.print("o");
					else if (j < i || j >= num-i)
						System.out.print(".");
				}
				System.out.println();
			}
		}
	}
}
