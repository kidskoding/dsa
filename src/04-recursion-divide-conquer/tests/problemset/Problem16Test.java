import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	private List<Integer> sorted(List<Integer> values) {
		List<Integer> copy = new ArrayList<>(values);
		Collections.sort(copy);
		return copy;
	}

	@Test
	void diffWaysToCompute_subtractions() {
		assertEquals(List.of(0, 2), sorted(sut.diffWaysToCompute("2-1-1")));
	}

	@Test
	void diffWaysToCompute_mixed() {
		assertEquals(List.of(-34, -14, -10, -10, 10), sorted(sut.diffWaysToCompute("2*3-4*5")));
	}

	@Test
	void diffWaysToCompute_singleNumber() {
		assertEquals(List.of(11), sut.diffWaysToCompute("11"));
	}
}
