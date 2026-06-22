import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 p = new Problem16();

	@Test
	void emptyTree() {
		assertEquals(0, p.maxWeightIndependentSet(null));
	}

	@Test
	void singleNode() {
		assertEquals(9, p.maxWeightIndependentSet(new TreeNode(9)));
	}

	@Test
	void childrenBeatRoot() {
		TreeNode root = new TreeNode(1);
		root.addChild(new TreeNode(5));
		root.addChild(new TreeNode(5));
		assertEquals(10, p.maxWeightIndependentSet(root));
	}

	@Test
	void heavyRootWins() {
		TreeNode root = new TreeNode(10);
		root.addChild(new TreeNode(1));
		root.addChild(new TreeNode(1));
		assertEquals(10, p.maxWeightIndependentSet(root));
	}
}
