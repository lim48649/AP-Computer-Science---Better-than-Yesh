package unit5;

public class Gamer {
	private static int ptsToWin;
	private String name;
	private int pts;
	
	public Gamer(String s ) {
		name = s;
		pts = 0;
	}
	
	public static void setGoal(int n) {
		ptsToWin = n;
	}
	
	public void addPts() {
		pts += (int)(8*Math.random());
	}
	
	public boolean won() {
		if (pts >= ptsToWin)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return name + " has " + pts;
	}
}
