import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void mergeKSorted_threeLists() {
		var lists = List.of(new int[] {1, 4, 7}, new int[] {2, 5, 8}, new int[] {3, 6, 9});
		int[] merged = Problem11.mergeKSorted(lists);
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, merged);
		assertTrue(ProblemTestSupport.isAscending(merged));
	}

	@Test
	void mergeKSorted_withEmptyLists() {
		var lists = List.of(new int[] {}, new int[] {2, 2}, new int[] {1, 3});
		assertArrayEquals(new int[] {1, 2, 2, 3}, Problem11.mergeKSorted(lists));
	}

	@Test
	void mergeKSorted_singleList() {
		var lists = List.of(new int[] {5, 6, 7});
		assertArrayEquals(new int[] {5, 6, 7}, Problem11.mergeKSorted(lists));
	}
}
