package hw04;

import java.util.HashMap;

/**
 * Created by andrew on 3/5/17.
 */
public class Fibonacci {
int nTimeFib(int n) {
	int first = 1;
	int second = 1;
	for (int i = 2; i < n; i++) {
		int temp = first;
		first = second;
		second = temp + second;
	}
	return second;
}


static HashMap<Integer, Integer> inputToFib = new HashMap<>();
int memoizedFib(int n) {
	if (inputToFib.containsKey(n))
		return inputToFib.get(n);
	if (n == 0 || n == 1)
		return 1;
	return memoizedFib(n - 1) + memoizedFib(n - 2);
}
}
