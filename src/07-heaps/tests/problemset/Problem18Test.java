import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem18Test {

	@Test
	void kSmallestPairs_threePairs() {
		List<int[]> pairs = Problem18.kSmallestPairs(new int[] {1, 7, 11}, new int[] {2, 4, 6}, 3);
		assertEquals(3, pairs.size());
		assertEquals(3, pairs.get(0)[0] + pairs.get(0)[1]);
		assertEquals(5, pairs.get(1)[0] + pairs.get(1)[1]);
		assertEquals(7, pairs.get(2)[0] + pairs.get(2)[1]);
	}

	@Test
	void kSmallestPairs_fewerPairsThanK() {
		List<int[]> pairs = Problem18.kSmallestPairs(new int[] {1, 2}, new int[] {3}, 3);
		assertEquals(2, pairs.size());
	}
}
