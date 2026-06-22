import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void search_presentTarget_returnsIndex() {
		assertEquals(3, new Problem04().search(new int[] {1, 3, 5, 7, 9}, 7));
	}

	@Test
	void search_absentTarget_returnsMinusOne() {
		assertEquals(-1, new Problem04().search(new int[] {1, 3, 5, 7, 9}, 4));
	}
}
