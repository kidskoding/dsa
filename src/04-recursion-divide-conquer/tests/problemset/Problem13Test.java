import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void permute_three() {
		List<List<Integer>> result = sut.permute(new int[] {1, 2, 3});
		assertEquals(6, result.size());
		Set<List<Integer>> distinct = new HashSet<>(result);
		assertEquals(6, distinct.size());
		assertTrue(distinct.contains(List.of(2, 1, 3)));
	}

	@Test
	void permute_two() {
		assertEquals(2, sut.permute(new int[] {0, 1}).size());
	}

	@Test
	void permute_one() {
		assertEquals(List.of(List.of(1)), sut.permute(new int[] {1}));
	}
}
