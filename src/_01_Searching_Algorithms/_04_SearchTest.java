package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] bob = {"bob", "joe"};
		String[] ree = {"ree", "re", "reeee"};
		String[] derp = {"derp", "herp", "lerp", "jerp"};
		
		assertEquals(1, _00_LinearSearch.linearSearch(bob, "joe"));
		assertEquals(-1, _00_LinearSearch.linearSearch(ree, "reee"));
		assertEquals(2, _00_LinearSearch.linearSearch(derp, "lerp"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] hey = {1, 2, 5, 7, 8, 9, 15,836, 23904};
		
		assertEquals(2, _01_BinarySearch.binarySearch(hey, 0, 8, 5));
		assertEquals(7, _01_BinarySearch.binarySearch(hey, 0, 8, 836));
		assertEquals(-1, _01_BinarySearch.binarySearch(hey, 0, 8, 89052345));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] hey = {1, 2, 5, 7, 8, 9, 15,836, 23904};
		
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(hey, 5));
		assertEquals(7, _02_InterpolationSearch.interpolationSearch(hey, 836));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(hey, 89052345));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] hey = {1, 2, 5, 7, 8, 9, 15,836, 23904};
		
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(hey, 5));
		assertEquals(7, _03_ExponentialSearch.exponentialSearch(hey, 836));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(hey, 89052345));
	}
}
