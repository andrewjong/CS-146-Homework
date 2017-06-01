package hw12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by andrew on 5/7/17.
 */
public class hw12 {
	public static void main(String[] args) {
		List<Integer> weights = Arrays.asList(1, 5, 10, 25);
		List<Integer> amounts = Arrays.asList(3, 2, 1, 4);
		int maxWeight = 10;
		System.out.println("== Problem 1 == ");
		System.out.println("Weights: " + weights);
		System.out.println("Amounts: " + amounts);
		System.out.println("Max weight: " + maxWeight);
		System.out.println("Recursive amount solution: " + p1Recursive(weights, amounts, maxWeight));

	}
	// interpreted the problem wrong
//	public static int p1Recursive(List<Integer>weights, List<Integer> amounts, int maxWeight) {
//		if (maxWeight < 0 || weights.size() == 0 || amounts.size() == 0) {
//			return 0;
//		}
//		List<Integer> newWeights = weights.subList(1, weights.size());
//		List<Integer> newAmounts = amounts.subList(1, amounts.size());
//		int subWeight = weights.get(0) * amounts.get(0);
//
//		int useWeightAndAmount = amounts.get(0) + p1Recursive(newWeights, newAmounts,  maxWeight - subWeight);
//		int notThisWeight = p1Recursive(newWeights, amounts, maxWeight);
//		int notThisAmount = p1Recursive(weights, newAmounts, maxWeight);
//		int neither = p1Recursive(newWeights, newAmounts, maxWeight);
//
//		return Math.max(useWeightAndAmount, Math.max(notThisWeight, Math.max(notThisAmount, neither)));
//	}
	public static int p1Recursive(List<Integer>weights, List<Integer> amounts, int maxWeight) {
		if (maxWeight < 0 || weights.size() == 0 || amounts.size() == 0) {
			return 0;
		}
		int subWeight = weights.get(0) * amounts.get(0);
		List<Integer> newWeights = weights.subList(1, weights.size());
		List<Integer> newAmounts = amounts.subList(1, amounts.size());

		int with = amounts.get(0) + p1Recursive(newWeights, newAmounts, maxWeight - subWeight);
		int without = p1Recursive(newWeights, newAmounts, maxWeight);
		return Math.max(with, without);
	}

	public static int p1Dynamic(List<Integer> weights, List<Integer> amounts, int maxWeight) {
		int[] solution = new int[weights.size()];
		for (int i = 1; i <= amounts.size(); i++) {
			for (int j = 0; j < weights.size(); j++) {
				if (weights.get(i) > )
			}

		}
	}

}
