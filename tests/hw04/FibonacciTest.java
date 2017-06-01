package hw04;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrew on 3/5/17.
 */
public class FibonacciTest {
	@Test
	public void testNTimeFib() throws Exception {
		Fibonacci f = new Fibonacci();
		assertEquals(1,f.nTimeFib(1));
		assertEquals(1, f.nTimeFib(2));
		assertEquals(2, f.nTimeFib(3));
		assertEquals(3, f.nTimeFib(4));
		assertEquals(5, f.nTimeFib(5));
		assertEquals(8, f.nTimeFib(6));
	}

}