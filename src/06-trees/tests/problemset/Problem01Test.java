import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void height_emptyTree_isNegativeOne() {
		assertEquals(-1, new Problem01().height(null));
	}

	@Test
	void height_singleNode_isZero() {
		assertEquals(0, new Problem01().height(new TreeNode<>(1)));
	}

	@Test
	void height_leftLeaningChain_countsEdges() {
		var root = new TreeNode<>(1, new TreeNode<>(2, new TreeNode<>(3), null), null);
		assertEquals(2, new Problem01().height(root));
	}
}
