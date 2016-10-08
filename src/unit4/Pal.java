package unit4;

public class Pal {
	private String orig;
	private String clean;
	
	public Pal(String s){ 
		orig = s;
		clean = "";
		s = s.toUpperCase();
		for (int k = 0; k < s.length(); k++) {
			char ch = s.charAt(k);
			if (ch >= 65 && ch <= 90)
				clean = clean + ch; 
		}
	}
	
	public boolean isPalindrome() {
		// First reverse the string
		String s = "";
		int len = clean.length();
		
		for (int i = len; i > 0; i--) {
			s = s + clean.substring(i - 1, i);
		}
		
		// Check if they equal, if they do then it is a palindrome
		if (s.equals(clean))
			return true;
		
		return false;
	}
	
	public String toString() {
		return "original: " + orig + ", clean: " + clean;
	}
}
