import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 sut = new Problem19();

	private Set<List<Integer>> normalize(List<List<Integer>> result) {
		Set<List<Integer>> out = new HashSet<>();
		for (List<Integer> combo : result) {
			List<Integer> sorted = new ArrayList<>(combo);
			Collections.sort(sorted);
			out.add(sorted);
		}
		return out;
	}

	@Test
	void combinationSum_basic() {
		assertEquals(
				Set.of(List.of(2, 2, 3), List.of(7)),
				normalize(sut.combinationSum(new int[] {2, 3, 6, 7}, 7)));
	}

	@Test
	void combinationSum_multiple() {
		assertEquals(
				Set.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)),
				normalize(sut.combinationSum(new int[] {2, 3, 5}, 8)));
	}

	@Test
	void combinationSum_none() {
		assertEquals(0, sut.combinationSum(new int[] {2}, 1).size());
	}
}
