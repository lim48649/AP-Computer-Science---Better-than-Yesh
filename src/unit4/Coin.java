package unit4;

public class Coin {
	private int value;
	
	public Coin(int v) {
		value = v;
	}
	
	public Coin() {
		value = (int) (Math.random() * 10) + 1;
	}
	
	public int getValue() {
		return value;
	}
}
