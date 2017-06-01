package scratchwork;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andrew on 3/13/17.
 */
public class BacktrackingPracticeTest {
	@Test
	public void testLargestSubsetSumGivenExample() throws Exception {
		List<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(5);
		a.add(5);
		a.add(2);
		int target = 10;
		int answer = BacktrackingPractice.largestSubsetSum(a, target);
		assertEquals(3, answer);
	}

	@Test
	public void testLargestSubsetSumMyExample1() throws Exception {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(7);
		int target = 8;
		int answer = BacktrackingPractice.largestSubsetSum(a, target);
		assertEquals(5, answer);
	}

}