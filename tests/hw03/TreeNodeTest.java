package hw03;

import hw02.TreeNode;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andrew on 2/18/17.
 */
public class TreeNodeTest {

    @Test
    public void testTreeNodeMax() {
        TreeNode<Integer> node = TreeNode.generateTree(4, 100);
        List<Integer> nodeInOrder = node.inorder();
        int trueMax = findMax(nodeInOrder);

        int max = node.max();

        assertEquals(trueMax, max);
    }

    private int findMax(List<Integer> list) {
        int max = -1;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
