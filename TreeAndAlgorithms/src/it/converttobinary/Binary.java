package it.converttobinary;

public class Binary {
	
	
	public long convertToBinaryRecursive(int n) {
		
		if (n == 0) {
	        return 0; // Binary of 0 is 0
	    }
	    return n % 2 + 10 * convertToBinaryRecursive(n / 2);
	}

}
