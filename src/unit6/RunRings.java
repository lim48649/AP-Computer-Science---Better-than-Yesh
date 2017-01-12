package unit6;

public class RunRings {

	public static void main(String[] args) {
		Ring [] rings = new Ring[10];
		for ( int n=0; n<10; n++ ){
			rings[n] = get();
			System.out.println( rings[n] );
		}
		int totalValue = getTotalValue( rings );
		System.out.println( "\nTotal value: " + totalValue );
		int count = countLuckyMagicRings( rings );
		System.out.println( "There are " + count + " lucky magic rings" );
	}

	private static int countLuckyMagicRings(Ring[] rings) {
		int count = 0;
		
		for (int i = 0; i < rings.length; i++) {
			if (rings[i] instanceof MagicRing && ((MagicRing) rings[i]).getLucky())
				count++;
		}
		
		return count;
	}

	private static Ring get() {
		int rand = (int) (Math.random() * 2);
		
		Ring r;
		
		if (rand == 1)
			r = new Ring((int) (Math.random() * 16) + 5);
		else
			r = new MagicRing((int) (Math.random() * 16) + 5);
		return r;
	}

	private static int getTotalValue(Ring[] rings) {
		int sum = 0;
		
		for (int i = 0; i < rings.length; i++) {
			sum += rings[i].getValue();
		}
		
		return sum;
	}

}
