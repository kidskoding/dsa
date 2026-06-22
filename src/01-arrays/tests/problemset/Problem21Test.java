import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	@Test
	void trap_basic() {
		var sut = new Problem21();
		assertEquals(6, sut.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
	}

	@Test
	void trap_deepBasin() {
		var sut = new Problem21();
		assertEquals(9, sut.trap(new int[] {4, 2, 0, 3, 2, 5}));
	}

	@Test
	void trap_increasing() {
		var sut = new Problem21();
		assertEquals(0, sut.trap(new int[] {1, 2, 3}));
	}
}
