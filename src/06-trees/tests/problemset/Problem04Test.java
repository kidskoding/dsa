import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem04Test {

	private TreeNode<Integer> sampleBst() {
		// 5 with children 3 and 8, and 3 has children 1 and 4.
		var left = new TreeNode<>(3, new TreeNode<>(1), new TreeNode<>(4));
		return new TreeNode<>(5, left, new TreeNode<>(8));
	}

	@Test
	void inorderSuccessor_midValue_returnsNext() {
		assertEquals(5, new Problem04().inorderSuccessor(sampleBst(), 4));
	}

	@Test
	void inorderSuccessor_maxValue_returnsNull() {
		assertNull(new Problem04().inorderSuccessor(sampleBst(), 8));
	}
}
