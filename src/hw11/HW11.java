package hw11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Andrew Jong
 */
public class HW11 {
	public static void main(String[] args) {
		System.out.println(longestIncSubSeq(new int[]{1, 5, 5, 6, 7, 8}, new int[]{1, 5, 5, 8, 9, 0}));
		System.out.println(longestIncSubSeq(new int[]{2, 3, 5}, new int[]{2, 3, 6}));
		System.out.println();
		HashSet<Integer> USCoins = new HashSet<>();
		USCoins.add(1);
		USCoins.add(5);
		USCoins.add(10);
		USCoins.add(25);
		USCoins.add(50);
		System.out.println("Num Coins " + makeChange(USCoins, 75));
		System.out.println("Num Coins " + makeChange(USCoins, 57));
	}
	public static int longestIncSubSeq(int[]seq1, int[]seq2){
		int[][] matrix = new int[seq1.length + 1][seq2.length + 1];
		for (int i = 1; i < seq1.length + 1; i++) {
			for (int j = 1; j < seq2.length + 1; j++) {
				if (seq1[i-1] == seq2[j-1]) {
					matrix[i][j] = matrix[i-1][j-1] + 1;
				}
				else{
					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
			}
		}
		return matrix[seq1.length][seq2.length];
	}

	public static int makeChange(Set<Integer> denominations, int sum) {
		if (sum <= 0) throw new IllegalArgumentException("Can't have " + sum);
		int[] minCoinsToSum = new int[sum + 1];
		Arrays.fill(minCoinsToSum, Integer.MAX_VALUE);
		minCoinsToSum[0] = 0;
		for (int i = 1; i <= sum; i++) {
			for (int d : denominations) {
				if (d <= i && (minCoinsToSum[i - d] + 1 < minCoinsToSum[i])) {
					minCoinsToSum[i] = minCoinsToSum[ i - d] + 1;
				}
			}
		}
		return minCoinsToSum[sum];
	}
}
