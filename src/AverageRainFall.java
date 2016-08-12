import java.util.Scanner;

/**
 * @author yesh0907
 * Eighth AP CS Program
 */

public class AverageRainFall {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Rainfall for April:\t");
		int april = input.nextInt();
		
		System.out.print("Rainfall for May:\t");
		int may = input.nextInt();
		
		System.out.print("Rainfall for June:\t");
		int june = input.nextInt();
		
		double total = (double) (april + may + june) / 3;
		System.out.println("Average Rainfall: " + total);
	}

}
