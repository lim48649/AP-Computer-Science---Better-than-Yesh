package unit1;
import java.util.Scanner;

/**
 * @author yesh0907
 * Ninth AP CS Program
 */

public class AreaOfACircle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the radius: ");
		int radius = input.nextInt();
		
		System.out.println("The radius is " + radius);
		
		double area = (double) radius * radius * Math.PI;
		
		System.out.println("The area is: " + area);
	}

}
