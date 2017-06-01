package hw06;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by andrew on 3/19/17.
 */
public class Solutions {

	/*
	(a) Write an algorithm in code or pseudocode for solving the longest increasing subsequence problem
	introduced in class (T 2/21: backtracking), but instead of returning the length of the subsequence, return an
	actual subsequence of that length.

Strategy: add me to the list if I am less than my right neighbor
 */
	static List<Integer> longIncSub(List<Integer> list) {
		List<Integer> ret = new LinkedList<>();

		// base case, only one element
		if (list.size() == 1) {
			ret.add(list.get(0));
			return ret;
		}
		// otherwise
		else if (list.size() > 1) {
			List<Integer> restOfList = list.subList(1, list.size());

			// if I am smaller than next number, either include me or don't
			if (list.get(0) < list.get(1)) {
				List<Integer> withMe = new LinkedList<>();
				withMe.add(list.get(0));
				withMe.addAll(longIncSub(restOfList));

				List<Integer> withoutMe = longIncSub(restOfList);

				if (withMe.size() > withoutMe.size()) {
					ret.addAll(withMe);
				} else {
					ret.addAll(withoutMe);
				}
			}
			// can't include me, so just add the longest of the rest of the list
			else {
				ret.addAll(longIncSub(restOfList));
			}
		}
		return ret;
	}


	/*
	(b) Write an algorithm in code or pseudocode for solving the maximumSubsetSum problem from Homework 4, but instead
	 of returning the maximum sum, return an actual subset of the input numbers (as a list or other appropriate data
	 structure) that achieves this maximum value.
	 */
public static List<Integer> maxSubsetSum(List<Integer> list, int upperBound) {
	List<Integer> ret = new LinkedList<>();
	if (list.isEmpty())
		return ret;
	List<Integer> restOfList = list.subList(1, list.size());
	if (list.get(0) <= upperBound) {
		List<Integer> withMe = new LinkedList<>();
		withMe.add(list.get(0));
		withMe.addAll(maxSubsetSum(restOfList, upperBound - list.get(0)));

		List<Integer> withoutMe = maxSubsetSum(restOfList, upperBound);

		if (sumOf(withMe) > sumOf(withoutMe)) {
			ret.addAll(withMe);
		} else {
			ret.addAll(withoutMe);
		}
	} else {
		ret.addAll(maxSubsetSum(restOfList, upperBound));
	}
	return ret;
}

public static int sumOf(List<Integer> list) {
	int sum = 0;
	for (Integer i : list) {
		sum += i;
	}
	return sum;
}
}
