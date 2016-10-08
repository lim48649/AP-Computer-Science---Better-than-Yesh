package unit4;

public class Star {
	private int x, y, z;
	
	// MUST FINISH LATER I FORGOT THE DISTANCE FORMULA.
	
	public Star() {
		x = (int) (Math.random() * 21);
		y = (int) (Math.random() * 21);
		z = (int) (Math.random() * 21);
	}
	
//	public double distance(int x1, int y1, int z1) {
//		
//	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
}