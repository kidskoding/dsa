import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem21Test {

	@Test
	void zigzag_threeLevels() {
		var right = new TreeNode<>(20, new TreeNode<>(15), new TreeNode<>(7));
		var root = new TreeNode<>(3, new TreeNode<>(9), right);
		assertEquals(List.of(List.of(3), List.of(20, 9), List.of(15, 7)),
				new Problem21().zigzagLevelOrder(root));
	}

	@Test
	void zigzag_singleNode() {
		assertEquals(List.of(List.of(1)), new Problem21().zigzagLevelOrder(new TreeNode<>(1)));
	}

	@Test
	void zigzag_emptyTree() {
		assertEquals(List.of(), new Problem21().zigzagLevelOrder(null));
	}
}
