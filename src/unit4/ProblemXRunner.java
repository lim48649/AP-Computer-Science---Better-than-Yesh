package unit4;

import unit4.ProblemX;

public class ProblemXRunner {

	public static void main(String[] args) {
		ProblemX p1 = new ProblemX( "Eels" );
		String s = p1.removeDups();
		System.out.println( s ); // els
		s = p1.toString();
		System.out.println( s ); // eels
		ProblemX p2 = new ProblemX( "AaAaAaAh!!!" ); s = p2.removeDups();
		System.out.println( s ); // ah!
		s = p2.toString();
		System.out.println( s ); // aaaaaaah!!!
		ProblemX p3 = new ProblemX( "" );
		s = p3.removeDups();
		System.out.println( s ); // empty string
		ProblemX p4 = new ProblemX( "12221122334231" ); s = p4.removeDups();
		System.out.println( s ); // 121234231
		s = p4.toString();
		System.out.println( s ); // 12221122334231
	}

}
