package unit4;

import unit4.Pal;

public class PalRunner {

	public static void main(String[] args) {
		Pal p1 = new Pal( "radar" ); 
		System.out.println( p1.toString() ); 
		System.out.println( p1.isPalindrome() );
		Pal p2 = new Pal( "radars" ); 
		System.out.println( p2.toString() ); 
		System.out.println( p2.isPalindrome() ); 
		Pal p3 = new Pal( "Amore, Roma" ); 
		System.out.println( p3.toString() ); 
		System.out.println( p3.isPalindrome() ); 
		Pal p4 = new Pal( "race car?" ); 
		System.out.println( p4.toString() ); 
		System.out.println( p4.isPalindrome() );
	}

}
