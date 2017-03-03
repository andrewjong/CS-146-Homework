package hw03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrew on 2/24/17.
 */
public class MinDistanceBSTTest {

	@Test
	public void testDistance1() throws Exception {
		MinDistanceBST md = new MinDistanceBST();
		int[] a = {0, 1, 2, 7};
		int[] b = {1, 6, 6, 7};
		int[] c = {0, 4, 6, 7};
		int dist = md.distance(a, b, c);
		assertEquals(0, dist);
	}
}