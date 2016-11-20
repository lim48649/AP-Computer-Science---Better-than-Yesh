package unit5;

public class Array4 {
	public static void main(String[] args) {
		int[][] table = makeTable();
		
		displayTable(table);
		
		for (int k = 0; k < table.length; k++) {
			int max = findMax(table[k]);
			System.out.println("Max value in row " + k + " is " + max);
		}
	}

	private static int findMax(int[] x) {
		int max = x[0];
		
		for (int i = 1; i < x.length; i++) {
			if (x[i] > max)
				max = x[i];
		}
		
		return max;
	}

	private static void displayTable(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static int[][] makeTable() {
		int[][] x = new int[(int) (Math.random() * 4) + 2][(int) (Math.random() * 4) + 2];
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				x[i][j] = (int) (Math.random() * 16) - 10;
			}
		}
		
		return x;
		
	}
}
