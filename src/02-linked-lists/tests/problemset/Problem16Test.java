import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void copy_structureAndDistinctNodes() {
		RandomNode a = new RandomNode(7);
		RandomNode b = new RandomNode(13);
		a.next = b;
		b.random = a;
		RandomNode copy = new Problem16().copyRandomList(a);
		assertNotSame(a, copy);
		assertEquals(7, copy.val);
		assertEquals(13, copy.next.val);
		assertSame(copy, copy.next.random);
	}

	@Test
	void copy_randomTargetsCopy() {
		RandomNode a = new RandomNode(1);
		RandomNode b = new RandomNode(2);
		a.next = b;
		a.random = b;
		b.random = b;
		RandomNode copy = new Problem16().copyRandomList(a);
		assertSame(copy.next, copy.random);
		assertSame(copy.next, copy.next.random);
	}

	@Test
	void copy_empty() {
		assertNull(new Problem16().copyRandomList(null));
	}
}
