import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void trap_classicProfile_returnsTrappedUnits() {
		var sut = new Problem14();
		assertEquals(6, sut.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
	}

	@Test
	void trap_monotonic_returnsZero() {
		var sut = new Problem14();
		assertEquals(0, sut.trap(new int[] {1, 2, 3, 4}));
	}
}
