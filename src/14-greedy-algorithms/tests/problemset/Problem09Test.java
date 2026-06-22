import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem09Test {

	private final Problem09 sut = new Problem09();

	@Test
	void lemonadeChange_succeeds() {
		assertTrue(sut.lemonadeChange(new int[] {5, 5, 5, 10, 20}));
	}

	@Test
	void lemonadeChange_failsNoChange() {
		assertFalse(sut.lemonadeChange(new int[] {5, 5, 10, 10, 20}));
	}

	@Test
	void lemonadeChange_failsFirstCustomer() {
		assertFalse(sut.lemonadeChange(new int[] {10}));
	}
}
