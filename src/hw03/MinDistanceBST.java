package hw03;

import java.util.ArrayList;

/**
 * Created by andrew on 2/23/17.
 */
public class MinDistanceBST {
	public int distance(int[] a, int[] b, int[] c) {
		int minDistance = Integer.MAX_VALUE;
		for (int aIndex  = 0; aIndex < a.length; ++aIndex) {
			int bIndex = binarySearch(b, 0, b.length, a[aIndex]);
			int cIndex = binarySearch(c, 0, c.length, a[aIndex]);

			int difference = maxDifference(a[aIndex], b[bIndex], c[cIndex]);
			if (difference < minDistance) {
				minDistance = difference;
			}
		}
		return minDistance;
	}

	private int binarySearch(int[] array, int start, int end, int search) {
		int i = start + end / 2;
		if (start >= end || search == array[i]) {
			return i;
		}
		if (search < array[i]) {
			return binarySearch(array, start, i, search);
		} else {
			return binarySearch(array, i, end, search);
		}
	}

	private int maxDifference(int x, int y, int z) {
		int d1 = Math.abs(x - y);
		int d2 = Math.abs(x - z);
		int d3 = Math.abs(y - z);
		return Math.max(Math.max(d1, d2), d3);
	}


	public int generalDistance(SortedSet... sets) {
		int minDistance = Integer.MAX_VALUE;
		int setsFinished = 0;
		while (minDistance != 0 && setsFinished < sets.length) {
			// Get all the first values of each set
			ArrayList<Integer> values = new ArrayList<>();
			for (SortedSet set : sets) {
				values.add((Integer) set.first());
			}
			System.out.println("REMOVE THIS");
			// Determine whether the current numbers have a smaller distance, if so then set.
			int potentialMin = generalMaxDifference(values);
			if (potentialMin < minDistance) minDistance = potentialMin;

			// Determine which set to increment
			int setToIncrement = 0;
			for (int i = 1; i < values.size(); i++) {
				if (sets[i].size() <= 1) {
					continue;
				} else if (potentialMin - values.get(i) >= potentialMin - values.get(setToIncrement)) {
					setToIncrement = i;
				}
			}
			// Remove the first element to "increment"
			SortedSet incrementSet = sets[setToIncrement];
			if (incrementSet.size() > 1)
				incrementSet.remove(incrementSet.first());
			else
				setsFinished++; // do this funny thing to prevent endless looping
		}
		return minDistance;
	}

	private int generalMaxDifference(ArrayList<Integer> list) {
		int maxDiff = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i; j < list.size(); j++) {
				int diff = Math.abs(list.get(i) - list.get(j));
				if (diff > maxDiff) {
					maxDiff = diff;
				}
			}
		}
		return maxDiff;
	}
}
