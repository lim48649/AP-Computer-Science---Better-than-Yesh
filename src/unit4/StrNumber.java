package unit4;

public class StrNumber {
	private String nums;
	
	public StrNumber(String s) {
		nums = s;
	}
	
	public String addCommas() {
		String s = "";
		int len = nums.length() - 1;
		int counter = 1;
		int prevSpot = nums.length();
		
		if (nums.length() > 3) {
			for (int i = 0; i < len; i++) {
				if (counter == 3) {
					s = "," + nums.substring(len - i, prevSpot) + s;
					prevSpot = len - i;
					counter = 1;
				}
				else {
					counter++;
				}
			}
			
			s = nums.substring(0, prevSpot) + s;
		}
		else {
			s = nums;
		}
		
		return s;
	}
}
