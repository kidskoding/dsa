import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 sut = new Problem4();

	@Test
	void search_present() {
		assertEquals(3, sut.search(new int[] {-3, 0, 4, 7, 11, 18}, 7));
	}

	@Test
	void search_absent() {
		assertEquals(-1, sut.search(new int[] {1, 2, 3, 4, 5}, 6));
	}

	@Test
	void search_singleton() {
		assertEquals(0, sut.search(new int[] {42}, 42));
	}
}
