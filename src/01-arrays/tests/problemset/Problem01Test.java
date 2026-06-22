import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void reverse_multipleElements_reversesAndReturnsSameRef() {
		var sut = new Problem01();
		int[] a = {1, 2, 3, 4};
		int[] out = sut.reverse(a);
		assertSame(a, out);
		assertArrayEquals(new int[] {4, 3, 2, 1}, out);
	}

	@Test
	void reverse_singleElement_unchanged() {
		var sut = new Problem01();
		assertArrayEquals(new int[] {7}, sut.reverse(new int[] {7}));
	}
}
