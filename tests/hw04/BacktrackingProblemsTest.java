package hw04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static hw04.BacktrackingProblems.*;
import static org.junit.Assert.*;


/**
 * Created by andrew on 3/5/17.
 */
public class BacktrackingProblemsTest {
	@Test
	public void testSubsetSum() throws Exception {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 13, 9, 8, 2));
		boolean status = subsetSum(list1, 8);
		System.out.println(list1 + ", 8: testOddSubsetSum " + status);
		assertEquals(true, status);
	}

	@Test
	public void testOddSubsetSum() throws Exception {

	}

	@Test
	public void testSubsetOf8Sum7Elements() throws Exception {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 13, 9, 8, 2));
		boolean status = subsetOf8Sum(list1, 8);
		System.out.println(list1 + ", 8: testOddSubsetSum " + status);
		assertEquals(false, status);
	}
	@Test
	public void testSubsetOf8Sum10Elements() throws Exception {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
		boolean status = subsetOf8Sum(list1, 8);
		System.out.println(list1 + ", 8: testOddSubsetSum " + status);
		assertEquals(true, status);
	}

	@Test
	public void testNonEmptySubsetSum() throws Exception {

	}

	@Test
	public void testSubsetProduct() throws Exception {

	}

	@Test
	public void testMaxSubsetSum() throws Exception {

	}

	@Test
	public void main() throws Exception {

	}

}