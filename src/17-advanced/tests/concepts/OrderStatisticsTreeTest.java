import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OrderStatisticsTreeTest {

	@Test
	void select_returnsIthSmallest() {
		var sut = new OrderStatisticsTree<Integer>();
		sut.insert(5);
		sut.insert(1);
		sut.insert(3);
		assertEquals(1, sut.select(1));
		assertEquals(3, sut.select(2));
		assertEquals(5, sut.select(3));
	}

	@Test
	void rank_countsSmallerKeys() {
		var sut = new OrderStatisticsTree<Integer>();
		sut.insert(10);
		sut.insert(20);
		sut.insert(30);
		assertEquals(2, sut.rank(30));
	}

	@Test
	void size_tracksInsertsAndDeletes() {
		var sut = new OrderStatisticsTree<Integer>();
		sut.insert(7);
		sut.insert(8);
		sut.delete(7);
		assertEquals(1, sut.size());
	}
}
