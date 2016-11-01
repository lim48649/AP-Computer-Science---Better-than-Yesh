package unit4part2;

public class NameRunner {

	public static void main(String[] args) {
		Name n1 = new Name("Ann         Marie          Lopez ");
		String s1 = n1.toString();
		System.out.println( s1 ); // Ann Marie Lopez
		System.out.println( s1.length() ); // 15
		
		Name n2 = new Name( " John Woo " );
		String s2 = n2.toString();
		System.out.println( s2 ); // John Woo
		System.out.println( s2.length() ); // 8
		
		Name n3 = new Name( " Robert Oscar Sam Edward Benjamin Ulysses David " );
		String s3 = n3.toString();
		System.out.println( s3 ); // Robert Oscar Sam Edward Benjamin Ulysses David
		System.out.println( s3.length() ); // 46
	}
}
