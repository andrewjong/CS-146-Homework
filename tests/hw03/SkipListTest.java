package hw03;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by andrew on 2/26/17.
 */
public class SkipListTest {
	@Test
	public void add() throws Exception {

	}

	@Test
	public void testLevels() throws Exception {
		int start = 100;
		ArrayList<Integer> iter = new ArrayList<>();
		ArrayList<Double> avg = new ArrayList<>();
		for (int m = 1; m < 10; m++) {
			long totalLevels = 0;
			int iterations = (int) (Math.pow(m, 2) * start);
			for (int i = 0; i < Math.pow(m, 2) * start; i++) {
				SkipList<Integer> sl = new SkipList<>();
				for (int j = 0; j < 5; j++) {
					sl.add((int) (Math.random() * 20));
				}
//			if (i % (iterations / 5) == 0) System.out.println(sl);
				totalLevels += sl.numberOfLevels();
			}
			iter.add(iterations);
			avg.add((double) totalLevels / iterations);
		}
		System.out.println(iter);
		System.out.println(avg);
	}
}