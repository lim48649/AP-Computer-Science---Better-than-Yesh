package unit4;

import unit4.StrNumber;

public class StrNumberRunner {

	public static void main(String[] args) {
		StrNumber sn1 = new StrNumber( "7" ); 
		System.out.println( sn1.addCommas() ); 		// 7
		StrNumber sn2 = new StrNumber( "23" );
		System.out.println( sn2.addCommas() );		// 23 
		StrNumber sn3 = new StrNumber( "405" ); 
		System.out.println( sn3.addCommas() ); 		// 405
		StrNumber sn4 = new StrNumber( "6183" ); 
		System.out.println( sn4.addCommas() );		// 6,183
		StrNumber sn5 = new StrNumber( "12345678" ); 
		System.out.println( sn5.addCommas() ); 		// 12,345,678
		StrNumber sn6 = new StrNumber( "71399372947382" ); 
		System.out.println( sn6.addCommas() );		// 71,399,372,947,382
		StrNumber sn7 = new StrNumber( "commas are important" );
		System.out.println( sn7.addCommas() );		// co,mma,s a,re ,imp,ort,ant
	}

}
