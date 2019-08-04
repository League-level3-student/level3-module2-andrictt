package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int counter = 0;
		for (String i : eggs) {
			if(i == "cracked") {
				return counter;
			}
			counter++;
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int counter = 0;
		for (boolean i : oysters) {
			if(i == true) {
				counter++;
			}
		}
		return counter;
	}

	public static double findTallest(List<Double> peeps) {
		double max = peeps.get(0);
		int counter = 0;
		for (double i : peeps) {
			if(i > max) {
				max = peeps.get(counter);
			}
			counter++;
		}
		return max;
	}

	public static String findLongestWord(List<String> words) {
		String maxWord = null;
		int max = 0;
		int counter = 0;
		for (String i : words) {
			if(i.length() > max) {
				max = i.length();
				maxWord = i;
			}
			counter++;
		}
		return maxWord;
	}

	public static boolean containsSOS(List<String> message1) {
		
		for (String i : message1) {
			if(i.replaceAll("\\s", "").equals("...---...") == true) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i < results.size(); i++) {
			for(int j =0; j < results.size() - 1; j++) {
				if(results.get(j) > results.get(j+1)) {
					Double temp = results.get(j);
					results.set(j,results.get(j+1) );
					results.set(j+1, temp);
				}
			}
		}
		return results;
	}
	public static List<String> sortDNA(List<String> results) {
		for(int i = 0; i < results.size(); i++) {
			for(int j =0; j < results.size() - 1; j++) {
				if(results.get(j).length() > results.get(j+1).length()) {
					String temp = results.get(j);
					results.set(j,results.get(j+1) );
					results.set(j+1, temp);
				}
			}
		}
		return results;
	}
	public static List<String> sortWords(List<String> results) {
		for(int i = 0; i < results.size(); i++) {
			for(int j =0; j < results.size() - 1; j++) {
				if(results.get(j).compareTo(results.get(j+1)) > 0) {
					String temp = results.get(j);
					results.set(j,results.get(j+1) );
					results.set(j+1, temp);
				}
			}
		}
		return results;
	}
	
}
