package unit5;

public class Wombat {
	private int weight;
	private boolean happy;
	
	public Wombat(boolean b) {
		weight = (int) (26*Math.random()) + 10;
		happy = b;
	}
	
	public int getWt() {
		return weight;
	}
	
	public boolean getHappy() {
		return happy;
	}
	
	public String toString() {
		if (happy) 
			return "Happy/" + weight;
		else
			return "Sad/" + weight;
	}
}
