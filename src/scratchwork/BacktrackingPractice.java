package scratchwork;

import java.util.List;

public class BacktrackingPractice {
	static int largestSubsetSum(List<Integer> a, int target) {
		if (a.isEmpty()) {
			if (target < 0)
				return 0;
			return 1;
		}
		else {
			List remaining = a.subList(1, a.size());
			int with = largestSubsetSum(remaining, target - a.get(0));
			int without = largestSubsetSum(remaining, target);
			return ((with > without) ? with : without) + 1;
		}
	}
}
