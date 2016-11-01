package unit4part2;

public class Name {
	private String first, middle, last;
	
	public Name(String str) {
		str = remove_spaces(str);
		assign_name(str);
	}

	private void assign_name(String s) {
		int firstSpace = 0;
		int secondSpace = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(" ")) {
				if (firstSpace == 0)
					firstSpace = i;
				else
					secondSpace = i;
			}
		}
		
		if (firstSpace > 0 && secondSpace == 0) {
			first = s.substring(0, firstSpace);
			middle = "";
			last = s.substring(firstSpace + 1, s.length());
		}
		else if (firstSpace > 0 && secondSpace > 0) {
			first = s.substring(0, firstSpace);
			middle = s.substring(firstSpace + 1, secondSpace);
			last = s.substring(secondSpace + 1, s.length());
		}
	}

	private String remove_spaces(String s) {
		String output = "";
		// Remove leading and trailing spaces
		String trimmed = s.trim();
		trimmed = trimmed.replace(" ", "");
		
		// Find all capital letters in String and add space between 
		for (int i = 0; i < trimmed.length(); i++) {
			if (Character.isUpperCase(trimmed.charAt(i)))
				output = output + " " + trimmed.substring(i, i+1);
			else
				output = output + trimmed.substring(i, i+1);
		}
		
		output = output.trim();
		
		return output;
	}
	
	public String toString() {
		if (middle.length() > 0)
			return first + " " + middle + " " + last;
		else
			return first + " " + last;
	}
}
