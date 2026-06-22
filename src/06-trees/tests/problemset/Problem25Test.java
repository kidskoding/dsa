import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem25Test {

	@Test
	void pathSum_twoPaths() {
		var leftDeep = new TreeNode<>(11, new TreeNode<>(7), new TreeNode<>(2));
		var left = new TreeNode<>(4, leftDeep, null);
		var right = new TreeNode<>(8, new TreeNode<>(13), new TreeNode<>(4, new TreeNode<>(5), new TreeNode<>(1)));
		var root = new TreeNode<>(5, left, right);
		assertEquals(List.of(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5)),
				new Problem25().pathSum(root, 22));
	}

	@Test
	void pathSum_none() {
		var root = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		assertEquals(List.of(), new Problem25().pathSum(root, 5));
	}

	@Test
	void pathSum_emptyTree() {
		assertEquals(List.of(), new Problem25().pathSum(null, 0));
	}
}
