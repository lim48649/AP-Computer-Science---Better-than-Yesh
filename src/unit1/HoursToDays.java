package unit1;
import java.util.Scanner;

/**
 * @author yesh0907
 * Seventh AP CS Program
 */

public class HoursToDays {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter hours: ");
		double inputHours = input.nextDouble();
		
		int days = (int) (inputHours / 24);
		double hours = inputHours % 24;
		System.out.println(days + " days, " + hours + " hours");
	}

}
