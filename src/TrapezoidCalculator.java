import java.util.Scanner;

/**
 * @author yesh0907
 * Fifth AP CS Program
 */

public class TrapezoidCalculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the height: ");
		double height = input.nextDouble();
		
		System.out.println("Enter the base1: ");
		double base1 = input.nextDouble();
		
		System.out.println("Enter the base2: ");
		double base2 = input.nextDouble();
		
		double area = height * ((base1 + base2) / 2);
		System.out.println("The area is " + area);
	}

}
