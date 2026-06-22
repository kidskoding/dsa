import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

class Problem2Test {

	@Test
	void frequencies_banana() {
		var sut = new Problem2();
		assertEquals(Map.of('b', 1, 'a', 3, 'n', 2), sut.frequencies("banana"));
	}

	@Test
	void frequencies_pairs() {
		var sut = new Problem2();
		assertEquals(Map.of('a', 2, 'b', 2), sut.frequencies("aabb"));
	}

	@Test
	void frequencies_empty() {
		var sut = new Problem2();
		assertEquals(Map.of(), sut.frequencies(""));
	}
}
