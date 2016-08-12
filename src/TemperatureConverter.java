import java.util.Scanner;

/**
 * @author yesh0907
 * Sixth AP CS Program
 */

public class TemperatureConverter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a temperature in ˚F: ");
		int F = input.nextInt();
		
		double C = 5.0/9.0 * (F - 32);		// Don't forget to make the division a double (5.0 and 9.0 NOT 5 and 9)
		System.out.println("The temperature in ˚C is " + C);
	}

}
