package unit6;

public class Weighted extends Course {
	private double weight;
	
	public Weighted(double w, String s) {
		super(s);
		weight = w;
	}
	
	public double getWeightedGrade() {
		return weight * super.getGrade();
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + "Weighted: " + getWeightedGrade();
	}
}
