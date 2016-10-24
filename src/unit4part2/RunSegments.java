package unit4part2;

import java.awt.Point;

public class RunSegments {
	public static void main(String[] args) {
		Segment s1 = new Segment();
		Point p1 = s1.getA();
		System.out.println(p1.toString());
		Point p2 = s1.getB();
		System.out.println(p2.toString());
		System.out.println(s1.length());
		
		Segment s2 = new Segment();
		p1 = s2.getA();
		System.out.println(p1.toString());
		p2 = s2.getB();
		System.out.println(p2.toString());
		System.out.println(s2.length());
	}
}
