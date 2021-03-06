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
		if (possible) {
			System.out.println("The triangle is possible");
			String type = typeOfTriangle(side1, side2, side3);
			System.out.println("Type: " + type);
		}
		else {
			System.out.println("The triangle is not possible");
		}
	}

	private static boolean check(double side1, double side2, double side3) {
		boolean condition1 = (side1 + side2) > side3;
		boolean condition2 = (side2 + side3) > side1;
		boolean condition3 = (side1 + side3) > side2;
		if (condition1 && condition2 && condition3)
			return true;
		
		return false;
	}
	
	
	private static String typeOfTriangle(double a, double b, double c) {
		double num1 = a;
		double num2 = b;
		double num3 = c;
		
		if (num1 >= num2 && num1 >= num3) {
			c = num1;
			if (num2 > num3) {
				b = num2;
				a = num3;
			}
			else {
				b = num3;
				a = num2;
			}
		}
		else if (num2 >= num1 && num2 >= num3) {
			c = num2;
			if (num1 > num3) {
				b = num1;
				a = num3;
			}
			else {
				b = num3;
				a = num1;
			}
		}
		else {
			c = num3;
			if (num1 > num2) {
				b = num1;
				a = num2;
			}
			else {
				b = num2;
				a = num1;
			}
		}
		
		double aPlusBSquared = Math.pow(a, 2) + Math.pow(b, 2);
		double cSquared = Math.pow(c, 2);
		if (aPlusBSquared > cSquared)
			return "Acute Triangle";
		else if (aPlusBSquared < cSquared)
			return "Obtuse Triangle";
		return "Right Triangle";
	}
}
