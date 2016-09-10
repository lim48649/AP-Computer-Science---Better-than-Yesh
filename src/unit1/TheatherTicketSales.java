package unit1;
import java.util.Scanner;

/**
 * @author yesh0907
 * Seventh AP CS Program
 */

public class TheatherTicketSales {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many tickets are you purchasing? ");
		int tickets = input.nextInt();
		
		System.out.println("Enter the price of your tickets: ");
		double price = input.nextDouble();
		
		System.out.println("\n"); // Prints new line to keep the console clean and organized
		
		double subtotal = tickets * price;
		System.out.println("Subtotal: " + subtotal);
		
		double tax = subtotal * 0.06;
		System.out.println("Tax: " + tax);
		
		double total = subtotal + tax;
		System.out.println("Total: " + total);
	}

}
