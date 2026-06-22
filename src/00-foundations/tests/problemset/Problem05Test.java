import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void totalCopies_eightAppends_countsResizeCopies() {
		var sut = new Problem05();
		assertEquals(7L, sut.totalCopies(8));
	}
}
