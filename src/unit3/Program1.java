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
		
		int largest = 0;
		int middle = 0;
		int smallest = 0;
		
		if (num1 >= num2 && num1 >= num3) {
			largest = num1;
			if (num2 > num3) {
				middle = num2;
				smallest = num3;
			}
			else {
				middle = num3;
				smallest = num2;
			}
		}
		else if (num2 >= num1 && num2 >= num3) {
			largest = num2;
			if (num1 > num3) {
				middle = num1;
				smallest = num3;
			}
			else {
				middle = num3;
				smallest = num1;
			}
		}
		else {
			largest = num3;
			if (num1 > num2) {
				middle = num1;
				smallest = num2;
			}
			else {
				middle = num2;
				smallest = num1;
			}
		}
		
		
		System.out.println("Smallest to Largest: " + smallest + ", " + middle + ", " + largest);
	}

}
