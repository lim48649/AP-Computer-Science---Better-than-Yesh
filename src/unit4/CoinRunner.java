package unit4;

import unit4.Coin;

public class CoinRunner {

	public static void main(String[] args) {
		Coin c1 = new Coin(5);
		Coin c2 = new Coin(3);
		Coin c3 = new Coin();
		Coin c4 = new Coin();
		
		System.out.println(c3.getValue());
		System.out.println(c4.getValue());
		
		System.out.println(c1.getValue() + c2.getValue() + c3.getValue() + c4.getValue());
	}

}
