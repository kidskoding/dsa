import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private TreeNode<Integer> sampleBst() {
		var left = new TreeNode<>(3, new TreeNode<>(1), new TreeNode<>(4));
		return new TreeNode<>(5, left, new TreeNode<>(8));
	}

	@Test
	void kthSmallest_firstRank_returnsMinimum() {
		assertEquals(1, new Problem13().kthSmallest(sampleBst(), 1));
	}

	@Test
	void kthSmallest_thirdRank_returnsThirdValue() {
		assertEquals(4, new Problem13().kthSmallest(sampleBst(), 3));
	}
}
