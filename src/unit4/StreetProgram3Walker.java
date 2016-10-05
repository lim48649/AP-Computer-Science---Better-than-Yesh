package unit4;

public class StreetProgram3Walker {
	private int x = 0;
	
	public StreetProgram3Walker() {
		x = 0;
	}
	
	public void walk(int max) {
		if (max < 1)
			return;
		else {
			int steps = (int) (Math.random() * (max - 1 + 1)) + 1;
			System.out.println("Steps: " + steps);
			x += steps;
		}
	}
	
	public int getX() {
		return x;
	}
}
