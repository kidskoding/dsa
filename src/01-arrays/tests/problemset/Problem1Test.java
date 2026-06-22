import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	@Test
	void reverse_evenLength() {
		var sut = new Problem1();
		assertArrayEquals(new int[] {4, 3, 2, 1}, sut.reverse(new int[] {1, 2, 3, 4}));
	}

	@Test
	void reverse_oddLength() {
		var sut = new Problem1();
		assertArrayEquals(new int[] {3, 2, 1}, sut.reverse(new int[] {1, 2, 3}));
	}

	@Test
	void reverse_empty() {
		var sut = new Problem1();
		assertArrayEquals(new int[] {}, sut.reverse(new int[] {}));
	}
}
