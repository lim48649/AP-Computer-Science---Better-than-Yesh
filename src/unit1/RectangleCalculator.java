package unit1;
import java.util.Scanner;

/**
 * @author yesh0907
 * Fourth AP CS Program
 */

public class RectangleCalculator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a length: ");
		double length = input.nextDouble();
		
		System.out.println("Enter a width: ");
		double width = input.nextDouble();
		
		double area = length * width;
		double perimeter = length * 2 + width * 2;
		
		System.out.println("The area is " + area);
		System.out.println("The perimeter is " + perimeter);
	}
}
