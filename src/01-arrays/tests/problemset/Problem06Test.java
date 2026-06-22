import static java.util.Arrays.copyOf;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem06Test {

	@Test
	void removeDuplicates_withRepeats_compactsAndReturnsLength() {
		var sut = new Problem06();
		int[] a = {1, 1, 2, 2, 2, 3};
		int len = sut.removeDuplicates(a);
		assertEquals(3, len);
		assertArrayEquals(new int[] {1, 2, 3}, copyOf(a, len));
	}

	@Test
	void removeDuplicates_singleElement_returnsOne() {
		var sut = new Problem06();
		assertEquals(1, sut.removeDuplicates(new int[] {5}));
	}
}
