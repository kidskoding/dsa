import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void evictsOldRequests() {
		Problem16 counter = new Problem16();
		assertEquals(1, counter.ping(1));
		assertEquals(2, counter.ping(100));
		assertEquals(3, counter.ping(3001));
		assertEquals(3, counter.ping(3002));
	}

	@Test
	void allRecent() {
		Problem16 counter = new Problem16();
		assertEquals(1, counter.ping(1));
		assertEquals(2, counter.ping(2));
		assertEquals(3, counter.ping(3));
	}
}
