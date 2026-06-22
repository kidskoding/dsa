import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 sut = new Problem7();

	@Test
	void mouseExample() {
		String[] input = {"mouse", "mobile", "mouse", "moneypot", "monitor", "mousepad"};
		assertArrayEquals(
			new String[] {
				"mobile,moneypot,monitor",
				"mobile,moneypot,monitor",
				"mouse,mousepad",
				"mouse,mousepad",
				"mouse,mousepad"
			},
			sut.run(input));
	}

	@Test
	void singleProductMatchesEveryPrefix() {
		String[] input = {"havana", "havana"};
		assertArrayEquals(
			new String[] {"havana", "havana", "havana", "havana", "havana", "havana"}, sut.run(input));
	}

	@Test
	void suggestionsShrinkOnDivergence() {
		String[] input = {"bags", "bags", "baggage", "banner", "box"};
		assertArrayEquals(
			new String[] {"baggage,bags,banner", "baggage,bags,banner", "baggage,bags", "bags"},
			sut.run(input));
	}
}
