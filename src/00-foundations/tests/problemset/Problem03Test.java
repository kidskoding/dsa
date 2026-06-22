import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void floorLog2_nonPowerOfTwo_returnsFloor() {
		var sut = new Problem03();
		assertEquals(6, sut.floorLog2(100));
	}
}
