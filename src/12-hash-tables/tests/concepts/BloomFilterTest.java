import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BloomFilterTest {

	@Test
	void add_thenMightContain_isTrue() {
		var sut = new BloomFilter(1024, 4);
		sut.add("hello");
		assertTrue(sut.mightContain("hello"));
	}

	@Test
	void noFalseNegatives_forManyKeys() {
		var sut = new BloomFilter(4096, 5);
		for (int i = 0; i < 100; i++) {
			sut.add("key" + i);
		}
		for (int i = 0; i < 100; i++) {
			assertTrue(sut.mightContain("key" + i), "false negative for key" + i);
		}
	}

	@Test
	void absentKey_usuallyReportsFalse() {
		var sut = new BloomFilter(8192, 6);
		sut.add("present");
		assertFalse(sut.mightContain("definitely-absent-xyz"));
	}

	@Test
	void estimatedFalsePositiveRate_inUnitInterval() {
		var sut = new BloomFilter(1024, 4);
		sut.add("a");
		sut.add("b");
		double rate = sut.estimatedFalsePositiveRate();
		assertTrue(rate >= 0.0 && rate <= 1.0);
	}
}
