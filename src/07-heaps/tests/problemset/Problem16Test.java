import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void mergeKSorted_threeLists() {
		List<int[]> lists = Arrays.asList(new int[] {1, 4, 5}, new int[] {1, 3, 4}, new int[] {2, 6});
		assertArrayEquals(new int[] {1, 1, 2, 3, 4, 4, 5, 6}, Problem16.mergeKSorted(lists));
	}

	@Test
	void mergeKSorted_skipsEmptyLists() {
		List<int[]> lists = Arrays.asList(new int[] {}, new int[] {0});
		assertArrayEquals(new int[] {0}, Problem16.mergeKSorted(lists));
	}
}
