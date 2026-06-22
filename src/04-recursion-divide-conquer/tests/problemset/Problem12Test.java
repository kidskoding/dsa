import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	private Set<Set<Integer>> normalize(List<List<Integer>> result) {
		Set<Set<Integer>> out = new HashSet<>();
		for (List<Integer> subset : result) {
			out.add(new HashSet<>(subset));
		}
		return out;
	}

	@Test
	void subsets_three() {
		Set<Set<Integer>> actual = normalize(sut.subsets(new int[] {1, 2, 3}));
		assertEquals(8, actual.size());
		assertEquals(normalize(sut.subsets(new int[] {1, 2, 3})), actual);
	}

	@Test
	void subsets_single() {
		assertEquals(2, sut.subsets(new int[] {0}).size());
	}

	@Test
	void subsets_empty() {
		assertEquals(1, sut.subsets(new int[] {}).size());
	}
}
