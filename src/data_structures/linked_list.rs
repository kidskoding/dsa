use crate::data_structures::node::Node;

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
    /// use dsa::data_structures::linked_list::LinkedList;
    /// 
    /// let list: LinkedList<i32> = LinkedList::new();
    /// assert!(list.is_empty());
    /// ```
    pub fn new() -> Self {
        LinkedList { head: None }
    }

    /// Adds a value to the front of the `LinkedList`.
    ///
    /// This method creates a new node containing the given value
    /// and makes it the new head of the list.
    ///
    /// # Examples
    ///
    /// ```
    /// use dsa::data_structures::linked_list::LinkedList;
    /// 
    /// let mut list = LinkedList::new();
    /// list.push_front(10);
    /// list.push_front(20);
    /// assert!(!list.is_empty());
    /// ```
    pub fn push_front(&mut self, value: T) {
        let mut new_node = Box::new(
            Node::new(
                value,
                None
            )
        );

        new_node.next = self.head.take();
        self.head = Some(new_node);
    }

    /// Removes and returns the value from the front of the `LinkedList`.
    ///
    /// If the list is empty, this method returns `None`. Otherwise,
    /// it removes the head node and returns its value.
    ///
    /// 
    /// # Returns
    /// An `Option<T>` optional generic type based on whether the topmost node was popped
    /// from the list
    /// - `Some` node is returned if this `LinkedList` has a head, otherwise `None`
    /// 
    /// # Examples
    ///
    /// ```
    /// use dsa::data_structures::linked_list::LinkedList;
    /// 
    /// let mut list = LinkedList::new();
    ///
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
    /// # Returns
    /// A `bool`, `true` or `false`, based on whether this `LinkedList` is
    /// empty
    ///
    /// # Examples
    ///
    /// ```
    /// use dsa::data_structures::linked_list::LinkedList;
    /// 
    /// let mut list = LinkedList::new();
    /// assert!(list.is_empty());
    /// list.push_front(10);
    /// assert!(!list.is_empty());
    /// ```
    pub fn is_empty(&self) -> bool {
        self.head.is_none()
    }
}