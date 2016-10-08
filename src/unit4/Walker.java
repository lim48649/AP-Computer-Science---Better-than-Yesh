package unit4;

public class Walker {
	private int x = 0;
	
	public Walker() {
		x = 0;
	}
	
	public void walk(int max) {
		if (max < 1)
			return;
		else {
			int steps = (int) (Math.random() * (max - 1 + 1)) + 1;
			x += steps;
		}
	}
	
	public int getX() {
		return x;
	}
}
