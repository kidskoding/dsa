/// A node in a data structure.
///
/// This structure represents a single node that stores a value of type `T`
/// and optionally links to the next node in the list.
pub struct Node<T> {
    /// The value stored in this node.
    pub value: T,

    /// The next node in the structure
    /// or `None` if this is the last node.
    pub next: Option<Box<Node<T>>>,
}

impl<T> Node<T> {
    /// Creates a new node with the given value.
    pub fn new(value: T, next: Option<Box<Node<T>>>) -> Self {
        Node {
            value,
            next,
        }
    }
}
