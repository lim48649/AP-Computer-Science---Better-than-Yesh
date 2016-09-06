package unit3;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 integers");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int largest = num1;
		int middle = num2;
		int smallest = num3;
		
		if (largest < num2)
			largest = num2;
		if (largest < num3)
			largest = num3;
		
		if (middle < smallest) {
			int tempMid = middle;
			middle = smallest;
			smallest = tempMid;
		}
		
		System.out.println("Smallest to Largest: " + smallest + ", " + middle + ", " + largest);
	}

}
