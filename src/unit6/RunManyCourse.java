package unit6;

public class RunManyCourse {

	public static void main(String[] args) {
		String[] names1 = {"Honors English", "APCS", "Chemistry", "History"};
		double[] grades1 = { 71, 85, 94, 87 };
		Double[] weigths1 = { 1.1, 1.2, null, null };
		
		Course[] c = setup(names1, grades1, weigths1);
		for (Course cor:c)
			System.out.println(cor);
		
		double avg = getUnweightedAverage(c);
		System.out.println ( "Unweighted average: " + avg );
		double wavg = getWeightedAverage( c );
		System.out.println ( "Weighted average: " + wavg );
		System.out.println ( "\n************************\n" );
		
		String [] names2 = {"Reading", "Math", "AP US History" };
		double [] grades2 = { 90, 80, 85 };
		Double [] weights2 = { null, null, 1.2 };
		c = setup( names2, grades2, weights2 );
		for ( Course cor : c )
			System.out.println( cor );
		
		avg = getUnweightedAverage( c );
		System.out.println ( "Unweighted average: " + avg );
		wavg = getWeightedAverage( c );
		System.out.println ( "Weighted average: " + wavg );
	}

	private static double getWeightedAverage(Course[] c) {
		double average = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] instanceof Weighted)
				average += ((Weighted) c[i]).getWeightedGrade();
			else
				average += c[i].getGrade();
		}
		
		return average / c.length;
	}

	private static double getUnweightedAverage(Course[] c) {
		double average = 0;
		for (int i = 0; i < c.length; i++) {
			average += c[i].getGrade();
		}
		
		return average / c.length;
	}

	private static Course[] setup(String[] s, double[] g, Double[] wts) {
		Course[] c = new Course[s.length];
		
		for (int i = 0; i < c.length; i++) {
			if (wts[i] == null)
				c[i] = new Course(s[i]);
			else
				c[i] = new Weighted(wts[i], s[i]);
			c[i].setGrade(g[i]);
		}
		
		return c;
	}
}
