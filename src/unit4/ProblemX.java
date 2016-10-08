package unit4;

public class ProblemX {
	private String str;
	
	public ProblemX(String s) {
		str = s.toLowerCase();
	}
	
	public String removeDups() {
		String s = "";
		boolean alreadyAdded = false;
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (!(str.substring(i, i + 1).equals(str.substring(i + 1, i + 2)))) {
				if (!alreadyAdded) {
					s = s + str.substring(i, i + 1) + str.substring(i + 1, i + 2);
					alreadyAdded = true;
				}
				else {
					s = s + str.substring(i + 1, i + 2);
					alreadyAdded = false;
				}
			}
		}
		
		return s;
	}
	
	public String toString() {
		return str;
	}
}
