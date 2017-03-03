package hw03;

import java.util.ArrayList;

/**
 * Created by andrew on 2/23/17.
 */
public class MinDistance {
	public int distance(int[] a, int[] b, int[] c) {
		int i = 0;
		int j = 0;
		int k = 0;
		int minDistance = Integer.MAX_VALUE;
		while (minDistance != 0
				&& i < a.length && j < b.length && k < c.length) {
			// Determine whether the current numbers have a smaller distance, if so then set.
			int potentialMin = maxDifference(a[i], b[j], c[k]);
			if (potentialMin < minDistance) minDistance = potentialMin;

			// Decide which array's index to increment
			int aDiff = potentialMin - a[i];
			int bDiff = potentialMin - b[j];
			int cDiff = potentialMin - c[k];
			if (aDiff >= bDiff && aDiff >= cDiff) {
				i++;
			} else if (bDiff >= aDiff & bDiff >= cDiff) {
				j++;
			} else {
				k++;
			}
		}
		return minDistance;
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
