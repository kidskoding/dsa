import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	@Test
	void dedup_keepsFirstOrder() {
		var sut = new Problem3();
		assertArrayEquals(new int[] {3, 1, 4, 5}, sut.dedup(new int[] {3, 1, 3, 4, 1, 5}));
	}

	@Test
	void dedup_allSame() {
		var sut = new Problem3();
		assertArrayEquals(new int[] {7}, sut.dedup(new int[] {7, 7, 7}));
	}

	@Test
	void dedup_empty() {
		var sut = new Problem3();
		assertArrayEquals(new int[] {}, sut.dedup(new int[] {}));
	}
}
