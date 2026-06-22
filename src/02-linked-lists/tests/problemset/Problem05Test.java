import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void removeNthFromEnd_middle() {
		var r = new Problem05().removeNthFromEnd(Problem01Test.of(1, 2, 3, 4, 5), 2);
		assertArrayEquals(new int[] {1, 2, 3, 5}, Problem01Test.toArray(r));
	}

	@Test
	void removeNthFromEnd_head() {
		var r = new Problem05().removeNthFromEnd(Problem01Test.of(1, 2), 2);
		assertArrayEquals(new int[] {2}, Problem01Test.toArray(r));
	}

	@Test
	void removeNthFromEnd_singleNode() {
		assertNull(new Problem05().removeNthFromEnd(Problem01Test.of(1), 1));
	}
}
