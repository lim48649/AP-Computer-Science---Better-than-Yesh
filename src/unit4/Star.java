package unit4;

public class Star {
	private int x, y, z;
	
	public Star() {
		x = (int) (Math.random() * 21);
		y = (int) (Math.random() * 21);
		z = (int) (Math.random() * 21);
	}
	
	public double distance(int x1, int y1, int z1) {
		return Math.sqrt((Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2) + Math.pow(z1 - z, 2)));
	}
	
	public void display(){ 
		System.out.println("coordinates: " + x + ", " + y + ", " + z ); 
	}
	
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