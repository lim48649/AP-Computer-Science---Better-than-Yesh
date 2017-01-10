package unit6;

import java.awt.Point;

public class Rectangle {
	private int x1, y1, x2, y2;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		if (x1 >= x2 || y1 >= y2)
			try {
				throw new IllegalAccessException("x1 >= x2 or y1 >= y2");
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int getParameter() {
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x1, y2);
		Point p3 = new Point(x2, y1);
		
		return (int)(p1.distance(p2) * 2 + p1.distance(p3) * 2); 
	}
	
	public int getArea() {
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x1, y2);
		Point p3 = new Point(x2, y1);
		
		return (int)(p1.distance(p2) * p1.distance(p3));
	}
}
