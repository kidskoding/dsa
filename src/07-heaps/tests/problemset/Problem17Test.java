import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Problem17Test {

	@Test
	void smallestRange_example() {
		List<int[]> lists =
				Arrays.asList(
						new int[] {4, 10, 15, 24, 26}, new int[] {0, 9, 12, 20}, new int[] {5, 18, 22, 30});
		assertArrayEquals(new int[] {20, 24}, Problem17.smallestRange(lists));
	}

	@Test
	void smallestRange_identicalLists() {
		List<int[]> lists =
				Arrays.asList(new int[] {1, 2, 3}, new int[] {1, 2, 3}, new int[] {1, 2, 3});
		assertArrayEquals(new int[] {1, 1}, Problem17.smallestRange(lists));
	}
}
