import java.util.Scanner;

/**
 * @author yesh0907
 * Ninth AP CS Program
 */

public class HalfOf {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number = input.nextDouble();
		
		double answer = number / 2;
		System.out.println("Half of " + number + " is " + answer);
	}

}