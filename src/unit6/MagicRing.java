package unit6;

public class MagicRing extends Ring {
	private boolean isLucky;
	
	public MagicRing(int val) {
		super(val);
		
		int rand = (int) (Math.random() * 2);
		
		if (rand == 1)
			isLucky = true;
		else
			isLucky = false;
	}
	
	public boolean getLucky() {
		return isLucky;
	}
	
	@Override
	public String toString() {
		return "Lucky ring worth $" + super.getValue();
	}
}
