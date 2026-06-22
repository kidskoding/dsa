import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void mergeKLists_threeLists() {
		ListNode[] lists = {
			Problem01Test.of(1, 4, 5), Problem01Test.of(1, 3, 4), Problem01Test.of(2, 6)
		};
		var merged = new Problem15().mergeKLists(lists);
		assertArrayEquals(new int[] {1, 1, 2, 3, 4, 4, 5, 6}, Problem01Test.toArray(merged));
	}

	@Test
	void mergeKLists_emptyArray() {
		assertNull(new Problem15().mergeKLists(new ListNode[] {}));
	}

	@Test
	void mergeKLists_withNullEntries() {
		ListNode[] lists = {null, Problem01Test.of(1, 2), null};
		var merged = new Problem15().mergeKLists(lists);
		assertArrayEquals(new int[] {1, 2}, Problem01Test.toArray(merged));
	}
}
