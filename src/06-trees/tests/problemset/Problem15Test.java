import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private TreeNode<Integer> sampleBst() {
		var left = new TreeNode<>(3, new TreeNode<>(1), new TreeNode<>(4));
		var right = new TreeNode<>(8, new TreeNode<>(7), new TreeNode<>(9));
		return new TreeNode<>(5, left, right);
	}

	@Test
	void rangeCount_inclusiveRange_countsKeys() {
		// Keys: 1,3,4,5,7,8,9; range [4,8] => 4,5,7,8 => 4.
		assertEquals(4, new Problem15().rangeCount(sampleBst(), 4, 8));
	}

	@Test
	void rangeCount_emptyRange_isZero() {
		assertEquals(0, new Problem15().rangeCount(sampleBst(), 10, 20));
	}
}
