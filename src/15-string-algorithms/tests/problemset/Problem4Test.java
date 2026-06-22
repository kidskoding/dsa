import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 sut = new Problem4();

	@Test
	void hash_abc() {
		assertEquals(6382179L, sut.rollingHash("abc", 256, 1000000007L));
	}

	@Test
	void hash_singleChar() {
		assertEquals(97L, sut.rollingHash("a", 31, 1000000007L));
	}

	@Test
	void hash_empty() {
		assertEquals(0L, sut.rollingHash("", 31, 1000000007L));
	}
}
