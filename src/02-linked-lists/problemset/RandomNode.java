/** A node with both a {@code next} and an arbitrary {@code random} pointer. */
public class RandomNode {
	public int val;
	public RandomNode next;
	public RandomNode random;

	public RandomNode(int val) {
		this.val = val;
	}
}
