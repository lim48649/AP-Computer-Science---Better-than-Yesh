package unit4part2;

import java.awt.Point;

public class Segment {
	private Point a, b;
	
	public Segment() {
		for (int i = 0; i < 2; i++) {
			int x = (int) (Math.random() * 10) - 5;
			int y = (int) (Math.random() * 10) - 5;
			if (i % 2 == 0)
				a = new Point(x, y);
			else
				b = new Point(x, y);
		}
	}
	
	public double length() {
		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}
	
	public Point getA() {
		return a;
	}
	
	public Point getB() {
		return b;
	}
}
