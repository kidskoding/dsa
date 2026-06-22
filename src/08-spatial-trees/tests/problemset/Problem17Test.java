import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void twoNearest() {
		assertEquals(List.of(0, 1), sut.kNearest(new int[][] {{1, 0}, {2, 0}, {5, 0}}, new int[] {0, 0}, 2));
	}

	@Test
	void oneNearest() {
		assertEquals(List.of(2), sut.kNearest(new int[][] {{3, 4}, {3, 4}, {0, 1}}, new int[] {0, 0}, 1));
	}

	@Test
	void kZero() {
		assertEquals(List.of(), sut.kNearest(new int[][] {{9, 9}}, new int[] {0, 0}, 0));
	}
}
