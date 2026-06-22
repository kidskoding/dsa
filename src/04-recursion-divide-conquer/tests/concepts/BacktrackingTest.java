import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.Test;

class BacktrackingTest {

	@Test
	void permutations_threeDistinct_returnsSixUnique() {
		var bt = new Backtracking();
		List<List<Integer>> perms = bt.permutations(new int[] {1, 2, 3});
		assertEquals(6, perms.size());
		assertEquals(6, new HashSet<>(perms).size());
		assertTrue(perms.contains(List.of(2, 1, 3)));
	}

	@Test
	void subsets_threeElements_returnsPowerSetOfEight() {
		var bt = new Backtracking();
		List<List<Integer>> subs = bt.subsets(new int[] {1, 2, 3});
		assertEquals(8, subs.size());
		assertTrue(subs.contains(List.of()));
		assertTrue(subs.contains(List.of(1, 2, 3)));
	}

	@Test
	void countNQueens_classicSizes_matchKnownCounts() {
		var bt = new Backtracking();
		assertEquals(1, bt.countNQueens(1));
		assertEquals(0, bt.countNQueens(3));
		assertEquals(2, bt.countNQueens(4));
		assertEquals(92, bt.countNQueens(8));
	}
}
