package unit5;

import java.awt.Point;

public class Array3 {
	public static void main(String[] args) {
		Point[] p = new Point[5];
		
		System.out.print("\t\t");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("P" + i + "\t");
		}
		
		System.out.println();
		
		System.out.print("\t\t");
		
		for (int i = 0; i < p.length; i++) {
			p[i] = new Point((int) (Math.random() * 11), (int) (Math.random() * 11));
			System.out.print((int)(p[i].getX()) + "," + (int) (p[i].getY()) + "\t");
		}
		
		System.out.println();
		
		for (int i = 0; i < p.length; i++) {
			System.out.print("P"+ (i+1) + " " + (int)(p[i].getX()) + "," + (int)(p[i].getY()) + "\t\t");
			for (int j = 0; j < p.length; j++) {
				double d = roundOnePlace(p[i].distance(p[j]));
				System.out.print(d + "\t");
			}
			System.out.println();
		}
	}

	private static double roundOnePlace(double x) {
		int num = (int) (10 * x + 0.5);
		return num/10.0;
	}
}
