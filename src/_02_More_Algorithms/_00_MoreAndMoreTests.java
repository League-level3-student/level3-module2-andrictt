package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	  public void MultTest() {
	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }

	public String multiply(int i, int j) {
		int multiply = i * j;
		return Integer.toString(i) + " x " + Integer.toString(j) + " = " + multiply;
	}
	  

	@Test
	  public void PrimeTest() {
	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	public boolean isPrime(int i) {
		int counter = 0;
		for(int j = 1; j <= i; j++) {
			if(i % j == 0) {
				counter++;
			}

		}
		if(counter == 2) {
			return true;
		}
		else {
			return false;
		}
	}

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	public boolean isSquare(int i) {
		int root = (int) Math.sqrt(i);
		if(i/root - Math.floor(root) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }
	public boolean isCube(double i) {
		double root = Math.cbrt(i);
		if((i/root)/root - Math.floor(root) == 0) {
			return true;
		}
		else {
			return false;
		}
	}



}
