import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	@Test
	void tracksMin() {
		Problem3 s = new Problem3();
		s.push(-2);
		s.push(0);
		s.push(-3);
		assertEquals(-3, s.getMin());
		s.pop();
		assertEquals(0, s.top());
		assertEquals(-2, s.getMin());
	}

	@Test
	void duplicates() {
		Problem3 s = new Problem3();
		s.push(1);
		s.push(1);
		s.push(0);
		assertEquals(0, s.getMin());
		s.pop();
		assertEquals(1, s.getMin());
	}
}
