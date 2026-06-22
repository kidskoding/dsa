import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	@Test
	void stable_oneStable() {
		var sut = new Problem22();
		assertEquals(1, sut.countStable(new String[] {"aabbb", "abc", "aabb"}));
	}

	@Test
	void stable_twoStable() {
		var sut = new Problem22();
		assertEquals(2, sut.countStable(new String[] {"a", "aabbb", "xxyyyzz"}));
	}

	@Test
	void stable_empty() {
		var sut = new Problem22();
		assertEquals(0, sut.countStable(new String[] {}));
	}
}
