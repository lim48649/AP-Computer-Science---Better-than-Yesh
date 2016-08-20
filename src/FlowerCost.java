import java.util.Scanner;

/**
 * @author yesh0907
 * Eight AP CS Program
 */

public class FlowerCost {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Amount of flowers: ");
		int amountOfFlowers = input.nextInt();
		
		int cost = 70 * (amountOfFlowers / 12) + 7 * (amountOfFlowers % 12);
		System.out.println("The cost is $" + cost);
	}
}