package _00_Sorting_Algorithms;

import java.util.Random;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	Random rand = new Random();
	void sort(int[] arr, SortingVisualizer display) {
		
		while(_00_SortedArrayChecker.intArraySorted(arr) == false) {
			int num1 = rand.nextInt(arr.length);
			int num2 = rand.nextInt(arr.length);
			int temp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = temp;
			display.updateDisplay();
		}
		
	}
}
