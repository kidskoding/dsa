import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void roundTrip_emptyTree_isNull() {
		var sut = new Problem14();
		assertNull(sut.deserialize(sut.serialize(null)));
	}

	@Test
	void roundTrip_preservesStructure() {
		var sut = new Problem14();
		var left = new TreeNode<>(2, new TreeNode<>(4), null);
		var root = new TreeNode<>(1, left, new TreeNode<>(3));
		var copy = sut.deserialize(sut.serialize(root));
		assertEquals(1, copy.value);
		assertEquals(2, copy.left.value);
		assertEquals(4, copy.left.left.value);
		assertEquals(3, copy.right.value);
	}
}
