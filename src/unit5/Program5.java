package unit5;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = input.next();
		int len = s.length() - 1;
		
		int counter = 0;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(s.substring(counter, counter + 1) + " ");
				if (counter == len)
					counter = 0;
				else
					counter++;
			}
			if (counter == len + 1)
				counter = i + 1;
			System.out.println();
		}
	}

}
