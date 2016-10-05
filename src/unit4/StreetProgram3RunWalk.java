package unit4;

import unit4.StreetProgram3Walker;

public class StreetProgram3RunWalk {

	public static void main(String[] args) {
		StreetProgram3Walker w1 = new StreetProgram3Walker();
		w1.walk( 5 ); // moves 1 - 5 (random)

		w1.walk( -4 ); // should not move

		w1.walk( 8 ); // moves 1 - 8 (random)

		w1.walk( 1 ); // moves 1 foot

		int loc = w1.getX();

		System.out.println( "w1 is now at " + loc );
	}

}
