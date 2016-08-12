import java.util.Scanner;

/**
 * @author yesh0907
 * Third AP CS Program
 */

public class LastNameInput {
	public static void main(String[] args) {
		int a;
		double b;
		
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		a = kb.nextInt();
		System.out.println("Enter a decimal: ");
		b = kb.nextDouble();
		
		System.out.println("Integer: " + a + " Decimal: " + b);
		
		int c = 3 * a + 1;
		double d = b / 2.0;
		
		System.out.println("c is " + c + ", and d is " + d);
	}

}
