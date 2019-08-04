package _00_Sorting_Algorithms;

import _00_Sorting_Algorithms._00_SortedArrayChecker;
public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		while(_00_SortedArrayChecker.intArraySorted(arr) == false) {
			for (int i = 1; i < arr.length; i++) {
			    if (arr[i - 1] > arr[i]) {
			      int t = arr[i];
			      arr[i] = arr[i - 1];
			      arr[i - 1] = t;
			      display.updateDisplay();
			    }
			}
			
		}
	}
	
}
