import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExternalMemoryModelTest {

	@Test
	void scanCost_isCeilNoverB() {
		var sut = new ExternalMemoryModel();
		assertEquals(4L, sut.scanCost(10, 3));
		assertEquals(0L, sut.scanCost(0, 4));
	}

	@Test
	void searchCost_isLogBaseBranching() {
		var sut = new ExternalMemoryModel();
		assertEquals(2, sut.searchCost(100, 10));
		assertEquals(0, sut.searchCost(1, 10));
	}

	@Test
	void sortCost_positiveForNontrivialInput() {
		var sut = new ExternalMemoryModel();
		// (1024/4) * log_{1024/4}(1024/4) = 256 * log_256(256) = 256 * 1 = 256
		assertEquals(256L, sut.sortCost(1024, 4, 1024));
	}
}
