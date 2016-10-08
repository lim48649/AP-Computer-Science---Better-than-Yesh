package unit4;

import unit4.Walker;

public class RunWalk2 {

	public static void main(String[] args) {
		Walker w = new Walker();
		int count = 0;
		
		while (w.getX() < 100) {
			w.walk(10);
			count++;
		}
		
		System.out.println("You walked " + w.getX() + " steps in " + count + " iterations.");
	}

}
