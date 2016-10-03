package unit4;

public class Bucket {
	private double amt;
	private final double CAPACITY;
	
	public Bucket( double c ) {
		CAPACITY = c; // gallons
		amt = 0;
	}
	
	public void emptyBucket() {
		amt = 0;
	}
	
	public void add ( double stuff ) {
		amt += stuff;
		if (amt > CAPACITY)
			amt = CAPACITY;
	}
	
	public double percentFull( ){
			return 100 * amt / CAPACITY;
	}
}