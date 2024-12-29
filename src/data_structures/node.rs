/// A node in a `LinkedList`
///
/// This structure represents a single node that stores a value of type `T`
/// and optionally links to the next node in the list.
pub struct Node<T> {
    /// The value stored in this node.
    value: T,

    /// The next node in this `LinkedList`
    /// or `None` if this is the last node.
    next: Option<Box<Node<T>>>,
}

impl<T> Node<T> {
    /// Creates a new node with the given value.
    pub fn new(value: T) -> Self {
        Node {
            value,
            next: None,
        }
    }

    /// Returns a reference to the `value` stored in this node.
    pub fn get_value(&self) -> &T {
        &self.value
    }

    /// Sets the `value` stored in this node.
    pub fn set_value(&mut self, value: T) {
        self.value = value;
    }

    /// Returns a reference to the `next` node.
    pub fn get_next(&self) -> Option<&Box<Node<T>>> { self.next.as_ref() }

    /// Sets the `next` node.
    pub fn set_next(&mut self, next: Option<Box<Node<T>>>) { self.next = next }

    /// Consumes the node and returns its value and `next` node.
    pub fn destructure(self) -> (T, Option<Box<Node<T>>>) {
        (self.value, self.next)
    }
}
