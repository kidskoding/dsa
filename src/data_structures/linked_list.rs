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

/// A singly-linked list.
///
/// This structure represents a `LinkedList` where each node stores
/// a value of type `T` and links to the next node in the sequence.
pub struct LinkedList<T> {
    /// The head node of the `LinkedList`,
    /// or `None` if the list is empty.
    head: Option<Box<Node<T>>>
}

impl<T> LinkedList<T> {
    /// Creates a new and empty `LinkedList`.
    ///
    /// # Examples
    ///
    /// ```
    /// let list: LinkedList<i32> = LinkedList::new();
    /// assert!(list.is_empty());
    /// ```
    pub fn new() -> Self {
        LinkedList { head: None }
    }

    //// Adds a value to the front of the `LinkedList`.
    ///
    /// This method creates a new node containing the given value
    /// and makes it the new head of the list.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut list = LinkedList::new();
    /// list.push_front(10);
    /// list.push_front(20);
    /// assert!(!list.is_empty());
    /// ```
    pub fn push_front(&mut self, value: T) {
        let new_node = Box::new(Node {
            value,
            next: self.head.take(),
        });
        self.head = Some(new_node);
    }

    /// Removes and returns the value from the front of the `LinkedList`.
    ///
    /// If the list is empty, this method returns `None`. Otherwise,
    /// it removes the head node and returns its value.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut list = LinkedList::new();
    /// list.push_front(10);
    /// list.push_front(20);
    /// assert_eq!(list.pop_front(), Some(20));
    /// assert_eq!(list.pop_front(), Some(10));
    /// assert!(list.is_empty());
    /// ```
    pub fn pop_front(&mut self) -> Option<T> {
        if let Some(node) = self.head.take() {
            self.head = node.next;
            Some(node.value)
        } else {
            None
        }
    }

    /// Checks whether the `LinkedList` is empty.
    ///
    /// This method returns `true` if the list contains no elements
    /// and `false` otherwise.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut list = LinkedList::new();
    /// assert!(list.is_empty());
    /// list.push_front(10);
    /// assert!(!list.is_empty());
    /// ```
    pub fn is_empty(&self) -> bool {
        self.head.is_none()
    }
}

mod tests {
    use crate::data_structures::linked_list::LinkedList;

    #[test]
    fn test_linked_list_creation() {
        let list: LinkedList<i32> = LinkedList::new();
        assert!(list.is_empty());
    }

    #[test]
    fn test_push_front() {
        let mut list: LinkedList<i32> = LinkedList::new();
        list.push_front(10);
        list.push_front(20);
        assert!(!list.is_empty());
        assert_eq!(list.pop_front(), Some(20));
        assert_eq!(list.pop_front(), Some(10));
    }

    #[test]
    fn test_pop_front_empty_list() {
        let mut list: LinkedList<i32> = LinkedList::new();
        assert_eq!(list.pop_front(), None);
    }

    #[test]
    fn test_is_empty() {
        let mut list: LinkedList<i32> = LinkedList::new();
        assert!(list.is_empty());
        list.push_front(30);
        assert!(!list.is_empty());
    }

    #[test]
    fn test_multiple_operations() {
        let mut list: LinkedList<i32> = LinkedList::new();
        list.push_front(1);
        list.push_front(2);
        list.push_front(3);
        assert_eq!(list.pop_front(), Some(3));
        assert_eq!(list.pop_front(), Some(2));
        assert_eq!(list.pop_front(), Some(1));
        assert!(list.is_empty());
    }
}