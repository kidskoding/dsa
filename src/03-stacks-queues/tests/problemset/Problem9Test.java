import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	@Test
	void removesPairs() {
		assertEquals("ca", Problem9.removeDuplicates("abbaca"));
	}

	@Test
	void reducesToEmpty() {
		assertEquals("", Problem9.removeDuplicates("aaaaaa"));
	}
}
