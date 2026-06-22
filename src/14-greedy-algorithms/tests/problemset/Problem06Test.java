import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem06Test {

	private final Problem06 sut = new Problem06();

	@Test
	void minPlatforms_peakThree() {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		assertEquals(3, sut.minPlatforms(arr, dep));
	}

	@Test
	void minPlatforms_noOverlap() {
		assertEquals(1, sut.minPlatforms(new int[] {100, 200, 300}, new int[] {150, 250, 350}));
	}

	@Test
	void minPlatforms_concurrent() {
		assertEquals(2, sut.minPlatforms(new int[] {100, 100}, new int[] {200, 200}));
	}
}
