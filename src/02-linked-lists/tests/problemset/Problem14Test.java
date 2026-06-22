import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void get_missingKey_returnsMinusOne() {
		var cache = new Problem14(2);
		assertEquals(-1, cache.get(1));
	}

	@Test
	void putThenGet_returnsValue() {
		var cache = new Problem14(2);
		cache.put(1, 10);
		assertEquals(10, cache.get(1));
	}

	@Test
	void put_overCapacity_evictsLeastRecentlyUsed() {
		var cache = new Problem14(2);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1); // 1 becomes most recent; 2 is now LRU
		cache.put(3, 3); // evicts 2
		assertEquals(-1, cache.get(2));
		assertEquals(1, cache.get(1));
		assertEquals(3, cache.get(3));
	}
}
