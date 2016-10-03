package unit4;

import unit4.Bucket;

public class BucketRunner {
	public static void main(String[] args) {
		// Creating The Bucket Object.
		// Start Out With 10 Gallons. 
		Bucket b = new Bucket(10.0);
		
		// Add Random Amount.
		b.add(Math.random() * 7 + 5);
		
		// Print The Amount Out.
		System.out.println(b.percentFull());
		
		// Empty My Bucket.
		b.emptyBucket();
		
		// Print Out The New Emptied Amount (0).
		System.out.println(b.percentFull());
	}
}
