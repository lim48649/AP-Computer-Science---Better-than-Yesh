package unit5;

public class WombatMain {

	public static void main(String[] args) {
		Wombat[][] w = new Wombat[3][3];

		int happyCounter = 0;
		int sadCounter = 0;
		int happyWeight = 0;
		int sadWeight = 0;
		
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < w[0].length; j++) {
				if ((int)(Math.random()*2) == 1) {
					w[i][j] = new Wombat(true);
					happyCounter++;
					happyWeight += w[i][j].getWt();
				}
				else {
					w[i][j] = new Wombat(false);
					sadCounter++;
					sadWeight += w[i][j].getWt();
				}
				
				// Print info
				System.out.print(w[i][j].toString() + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Happy Wombat Summary
		System.out.println("There is/are " + happyCounter + " happy wombat(s).");
		System.out.println("Total weight is " + happyWeight + " lbs.");
		
		System.out.println();
		
		// Sad Wombat Summary
		System.out.println("There is/are " + sadCounter + " sad wombat(s)");
		System.out.println("Total weight is " + sadWeight + " lbs.");
		
	}

}
