package unit4;

import unit4.Star;

public class StarRunner {

	public static void main(String[] args) {
		Star s1 = new Star();
		Star s2 = new Star();
		Star s3 = new Star();
		
		// Display the info
		s1.display();
		s2.display();
		s3.display();
		
		// Calculate and show distance between the stars
		double d1 = s1.distance(s2.getX(), s2.getY(), s2.getZ());
		double d2 = s2.distance(s3.getX(), s3.getY(), s3.getZ());
		double d3 = s3.distance(s1.getX(), s1.getY(), s1.getZ());
		System.out.println("The distance between star 1 and star 2 is: " + d1);
		System.out.println("The distance between star 2 and star 3 is: " + d2);
		System.out.println("The distance between star 3 and star 1 is: " + d3);
		
		// Check to see if they make up isosceles or equilateral triangle
		// Check to see if they are equilateral
		if (d1 == d2 && d2 == d3)
			System.out.println("The stars make up an equilateral triangle.");
		// Check to see if they are isosceles
		else if ((d1 == d2 && d1 != d3) || (d2 == d3 && d2 != d1) || (d3 == d1 && d3 != d2))
			System.out.println("The stars make up an isosceles triangle.");
		else {
			if (d1 < d2 && d1 < d3)
				System.out.println("Star 1 and Star 2 are the closest");
			else if (d2 < d1 && d2 < d3)
				System.out.println("Star 2 and Star 3 are the closest");
			else if (d3 < d1 && d3 < d2)
				System.out.println("Star 3 and Star 1 are the closest");
		}
	}

}
