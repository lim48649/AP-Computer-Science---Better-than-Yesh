package unit5;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")		// Ignore this line.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer");
		int N = input.nextInt();
		
		int[] array = createArray(N);
		
		displayArray(array);
		
		System.out.println();
		
		displayCoolInfo(array);
	}

	private static void displayCoolInfo(int[] array) {
		int min = array[0];
		int max = array[array.length - 1];
		double sum = min;
		
		for (int i = 1; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
			if (max < array[i])
				max = array[i];
			sum += array[i];
		}
		
		System.out.println("Min value: " + min);
		System.out.println("Max value: " + max);
		System.out.println("Average: " + sum/array.length);
	}

	private static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static int[] createArray(int n) {
		int[] temp = new int[n];
		
		for (int i = 0; i < n; i++) {
			temp[i] = (int) (Math.random() * n+1);
		}
		return temp;
	}

}
