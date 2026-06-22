import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void copy_isDeepCopy() {
		RandomNode a = new RandomNode(1);
		RandomNode b = new RandomNode(2);
		a.next = b;
		a.random = b;
		b.random = b;

		RandomNode copy = new Problem13().copyRandomList(a);
		assertNotSame(a, copy);
		assertEquals(1, copy.val);
		assertEquals(2, copy.next.val);
		assertSame(copy.next, copy.random);
		assertSame(copy.next, copy.next.random);
	}

	@Test
	void copy_empty() {
		assertNull(new Problem13().copyRandomList(null));
	}
}
