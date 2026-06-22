import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void search_present() {
		assertEquals(4, sut.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
	}

	@Test
	void search_absent() {
		assertEquals(-1, sut.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
	}

	@Test
	void search_singletonMiss() {
		assertEquals(-1, sut.search(new int[] {1}, 0));
	}
}
