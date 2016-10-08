package unit4;

import unit4.Walker;

public class RunWalk {

	public static void main(String[] args) {
		Walker w1 = new Walker();
		w1.walk( 5 ); // moves 1 - 5 (random)

		w1.walk( -4 ); // should not move

		w1.walk( 8 ); // moves 1 - 8 (random)

		w1.walk( 1 ); // moves 1 foot

		int loc = w1.getX();

		System.out.println( "w1 is now at " + loc );
	}

}
