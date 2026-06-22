import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	@Test
	void totalCopies_four() {
		assertEquals(3L, new Problem6().totalCopies(4));
	}

	@Test
	void totalCopies_five() {
		assertEquals(7L, new Problem6().totalCopies(5));
	}
}
