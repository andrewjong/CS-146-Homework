package hw03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrew on 2/23/17.
 */
public class BinarySearchTreeTest {
	final private int TEST_TRIALS = 20;

	int start = -1;

	/**
	 * Generates an integer BST with specified parameters.
	 * @param numNodes
	 * @param low
	 * @param high
	 * @return
	 */
	private BinarySearchTree<Integer> generateIntegerBST(int numNodes, int low, int high) {
		BinarySearchTree bst = new BinarySearchTree();
		start = (int) (Math.random() * 3 + (low + high) / 2); // roughly in the center
		bst.add(start);

		for (int i = 0; i < numNodes; ++i) {
			bst.add((int) (Math.random() * high) + low);
		}
		return bst;
	}

	@Test
	public void testFirst() throws Exception {
		for (int trial = 0; trial < TEST_TRIALS; ++trial) {
			BinarySearchTree<Integer> bst = generateIntegerBST(7, 0, 20);
			try {
				assertEquals(start, (int) bst.first());
			} catch (AssertionError ae) {
				System.out.println(bst.toString());
				throw ae;
			}
		}
	}

	@Test
	public void testLast() throws Exception {

	}

	@Test
	public void testContains() throws Exception {

	}

	@Test
	public void testRemove() throws Exception {

	}
}