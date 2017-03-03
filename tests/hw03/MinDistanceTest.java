package hw03;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by andrew on 2/23/17.
 */
public class MinDistanceTest {
	@Test
	public void testDistance1() throws Exception {
		MinDistance md = new MinDistance();
		int[] a = {0, 1, 2, 7};
		int[] b = {1, 6, 6, 7};
		int[] c = {0, 4, 6, 7};
		int dist = md.distance(a, b, c);
		assertEquals(0, dist);
	}

	@Test
	public void testDistance2() throws Exception {
		MinDistance md = new MinDistance();
		int[] a = {0, 1, 2, 3};
		int[] b = {4, 5, 6, 7};
		int[] c = {8, 9, 10, 11};
		int dist = md.distance(a, b, c);
		assertEquals(5, dist);
	}

	@Test
	public void testDistance3() throws Exception {
		MinDistance md = new MinDistance();
		int[] a = {0, 0, 0, 0};
		int[] b = {1000, 1000, 1000, 1000};
		int[] c = {1001, 1001, 1001, 1001};
		int dist = md.distance(a, b, c);
		assertEquals(1001, dist);
	}

	@Ignore("Not sure if need to test with duplicate values")
	public void testDistance4() throws Exception {
		MinDistance md = new MinDistance();
		int[] a = {0, 0, 0, 0};
		int[] b = {1, 5, 5, 9};
		int[] c = {9, 9, 9, 9};
		int dist = md.distance(a, b, c);
		assertEquals(5, dist);
	}

	@Test
	public void testGeneralDistance1() throws Exception {
		MinDistance md = new MinDistance();
		SortedSet a = new MySortedSet(new int[]{0, 1, 2, 7});
		SortedSet b = new MySortedSet(new int[]{1, 6, 6, 6});
		SortedSet c = new MySortedSet(new int[]{0, 4, 6, 7});
		SortedSet d = new MySortedSet(new int[]{5, 7, 8, 9});
		int dist = md.generalDistance(a, b, c, d);
		assertEquals(1, dist);
	}

	@Test
	public void testGeneralDistance2() throws Exception {
		MinDistance md = new MinDistance();
		SortedSet a = new MySortedSet(new int[]{0, 1, 2, 3});
		SortedSet b = new MySortedSet(new int[]{1, 2, 5, 9});
		SortedSet c = new MySortedSet(new int[]{9, 10, 11, 12});
		SortedSet d = new MySortedSet(new int[]{6, 7, 8, 9});
		int dist = md.generalDistance(a, b, c, d);
		assertEquals(6, dist);
	}
}