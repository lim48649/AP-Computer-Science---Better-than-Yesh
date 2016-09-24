package unit3;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Miles?");
		
		int miles = input.nextInt();
		double time = 0;
		int hours = 0;
		int minutes = 0;
		
		for (int speed = 25; speed <= 70; speed += 5) {
			time = (double)miles/(double)speed;
			hours = (int)time;
			minutes = (int) (60 * (time - miles/speed));
			System.out.println("This will take " + hours + " and " + minutes + " minutes at a speed of " + speed + " mph");
		}
	}

}
