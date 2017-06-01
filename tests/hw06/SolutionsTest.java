package hw06;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;



/**
 * Created by andrew on 3/19/17.
 */
public class SolutionsTest {

	@Test
	public void testMaxSubsetSumSequence() throws Exception {
		Integer []arr = {1, 3, 5, 7};
		List<Integer> list = Arrays.asList(arr);

		List<Integer> expected = Arrays.asList(1, 3);
		List<Integer> solution = Solutions.maxSubsetSum(list, 4);
		System.out.println(list);
		System.out.println(expected);
		System.out.println(solution);
		assertTrue(expected.equals(solution));

	}

	@Test
	public void testLongestIncreasingSubsequence1() throws Exception {
		List<Integer> list = Arrays.asList(7, 1, 8, 2, 9, 3, 4);
		List<Integer> expected = Arrays.asList(1, 2, 3, 4);

		List<Integer> actual = Solutions.longIncSub(list);
		System.out.println(expected);
		System.out.println(actual);
		System.out.println();
		assertTrue(expected.equals(actual));
	}

	@Test
	public void testLongestIncreasingSubsequence2() throws Exception {
		List<Integer> list = Arrays.asList(1, 7, 3, 5);
		List<Integer> expected = Arrays.asList(1, 3, 5);

		List<Integer> actual = Solutions.longIncSub(list);
		System.out.println(expected);
		System.out.println(actual);
		assertTrue(expected.equals(actual));
	}
}