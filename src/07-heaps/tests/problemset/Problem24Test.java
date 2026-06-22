import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Problem24Test {

	@Test
	void relayAt_example() {
		List<int[]> streams =
				Arrays.asList(new int[] {1, 4, 7}, new int[] {2, 5, 8}, new int[] {3, 6, 9});
		assertEquals(5, Problem24.relayAt(streams, 4));
	}

	@Test
	void relayAt_outOfRange() {
		List<int[]> streams = Arrays.asList(new int[] {10}, new int[] {11});
		assertEquals(-1, Problem24.relayAt(streams, 5));
	}
}
