package unit6;

public class RunRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(-1, 4, 2, 8);
		System.out.println(r1.getParameter());
		System.out.println(r1.getArea());
		
		@SuppressWarnings("unused")
		Rectangle r2 = new Rectangle(2, 5, 2, 6);
	}

}
