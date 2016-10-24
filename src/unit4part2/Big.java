package unit4part2;

public class Big {
	private String message;
	
	public Big(String s) {
		message = s.toUpperCase();
	}
	
	public void print() {
		for (int k = 0; k < message.length(); k++){
			String letter = message.substring(k,k+1);
			if ( letter.equals( "C" ) )
				printC();
			else if ( letter.equals( "E" ) )
				printE();
			else if ( letter.equals( "F" ) )
				printF();
			else if ( letter.equals( "L" ) )
				printL();
			System.out.println();
		}
	}
	
	private void printC() {
		printHorz(6);
		printVert(3);
		printHorz(6);
	}
	
	private void printE() {
		printHorz(6);
		printVert(1);
		printHorz(3);
		printVert(1);
		printHorz(6);
	}
	
	private void printF() {
		printHorz(6);
		printVert(1);
		printHorz(3);
		printVert(2);
	}
	
	private void printL() {
		printVert(4);
		printHorz(6);
	}
	
	private void printHorz(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	private void printVert(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}
}