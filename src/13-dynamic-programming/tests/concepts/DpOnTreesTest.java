import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DpOnTreesTest {

	private final DpOnTrees dp = new DpOnTrees();

	@Test
	void emptyTree() {
		assertEquals(0, dp.maxWeightIndependentSet(null));
	}

	@Test
	void singleNode() {
		assertEquals(7, dp.maxWeightIndependentSet(new TreeNode(7)));
	}

	@Test
	void rootVersusChildren() {
		// Root weight 1 with two children of weight 5 each: best excludes the root.
		TreeNode root = new TreeNode(1);
		root.addChild(new TreeNode(5));
		root.addChild(new TreeNode(5));
		assertEquals(10, dp.maxWeightIndependentSet(root));
	}

	@Test
	void heavyRootBeatsChildren() {
		TreeNode root = new TreeNode(10);
		root.addChild(new TreeNode(1));
		root.addChild(new TreeNode(1));
		assertEquals(10, dp.maxWeightIndependentSet(root));
	}

	@Test
	void deeperChainPicksAlternatingLevels() {
		// Path 4 - 1 - 4 - 1: best picks the two weight-4 nodes (non-adjacent).
		TreeNode a = new TreeNode(4);
		TreeNode b = a.addChild(new TreeNode(1));
		TreeNode c = b.addChild(new TreeNode(4));
		c.addChild(new TreeNode(1));
		assertEquals(8, dp.maxWeightIndependentSet(a));
	}
}
