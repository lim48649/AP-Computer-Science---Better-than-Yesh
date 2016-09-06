package unit3;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 sides of a triangle");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		boolean possible = check(side1, side2, side3);
		if (possible)
			System.out.println("The triangle is possible");
		else
			System.out.println("The triangle is not possible");
	}

	private static boolean check(double side1, double side2, double side3) {
		boolean condition1 = (side1 + side2) > side3;
		boolean condition2 = (side2 + side3) > side1;
		boolean condition3 = (side1 + side3) > side2;
		if (condition1 && condition2 && condition3)
			return true;
		
		return false;
	}
}
