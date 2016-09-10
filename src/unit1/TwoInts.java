package unit1;
import java.util.Scanner;

/**
 * @author yesh0907
 * code1a
*/


public class TwoInts {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int res = compare(input.nextInt(), input.nextInt());
		System.out.println("");
		System.out.println("The bigger number is: " + res);
	}
	
	private static int compare(int x, int y) {
		int bigger = x;
		
		if (x < y)
			bigger = y;
		
		return bigger;
	}

}
