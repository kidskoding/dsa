use crate::data_structures::node::Node;

/// A queue data structure with a fixed capacity.
///
/// This structure implements a simple queue where elements of type `T` are
/// enqueued and dequeued according to the First-In-First-Out (FIFO) principle.
pub struct Queue<T> {
    front: Option<Box<Node<T>>>,
    rear: *mut Node<T>,
    size: usize,
}

/// Creates a new, empty `Queue`.
///
/// # Examples
///
/// ```
/// let queue: Queue<i32> = Queue::new();
/// assert!(queue.is_empty());
/// ```
impl<T> Queue<T> {
    pub fn new() -> Self {
        Queue {
            front: None,
            rear: std::ptr::null_mut(),
            size: 0,
        }
    }

    /// Adds a value to the rear of the `Queue`.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut queue = Queue::new();
    /// queue.enqueue(10).unwrap();
    /// queue.enqueue(20).unwrap();
    /// assert_eq!(queue.peek(), Some(&10));
    /// ```
    pub fn enqueue(&mut self, value: T) {
        let new_node = Box::new(
            Node::new(
                value,
                None
            )
        );

        let new_node_ptr: *mut Node<T> = Box::into_raw(new_node);

        if self.rear.is_null() {
            self.front = unsafe {
                Some(Box::from_raw(new_node_ptr))
            };
            self.rear = new_node_ptr
        } else {
            unsafe {
                (*self.rear).next = Some(Box::from_raw(new_node_ptr));
                self.rear = new_node_ptr
            }
        }

        self.size += 1;
    }

    /// Removes and returns the value at the front of the `Queue`.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut queue = Queue::new();
    /// queue.enqueue(10).unwrap();
    /// queue.enqueue(20).unwrap();
    /// assert_eq!(queue.dequeue(), Some(10));
    /// assert_eq!(queue.dequeue(), Some(20));
    /// assert!(queue.dequeue().is_none());
    /// ```
    pub fn dequeue(&mut self) -> Option<T> {
        if self.front.is_none() {
            return None;
        }

        let old_front = self.front.take().unwrap();
        self.front = old_front.next;
        if self.front.is_none() {
            self.rear = std::ptr::null_mut();
        }

        self.size -= 1;

        Some(old_front.value)
    }

    /// Returns a reference to the value at the front without removing it.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut queue = Queue::new();
    /// queue.enqueue(10).unwrap();
    /// queue.enqueue(20).unwrap();
    /// assert_eq!(queue.peek(), Some(&10));
    /// ```
    pub fn peek(&self) -> Option<&T> {
        self.front.as_ref().map(|node| &node.value)
    }

    /// Checks if the `Queue` is empty.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut queue = Queue::new();
    /// assert!(queue.is_empty());
    /// queue.enqueue(10).unwrap();
    /// assert!(!queue.is_empty());
    /// ```
    pub fn is_empty(&self) -> bool {
        self.size == 0
    }

    /// Returns the current size of the `Queue`.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut queue: Queue<i32> = Queue::new();
    /// queue.enqueue(10).unwrap();
    /// queue.enqueue(20).unwrap();
    /// queue.dequeue();
    /// assert_eq!(queue.size(), 1);
    /// ```
    pub fn size(&self) -> usize {
        self.size
    }
}

#[cfg(test)]
mod tests {
    use crate::data_structures::queue::Queue;

    #[test]
    fn test_queue_is_empty() {
        let queue: Queue<i32> = Queue::new();
        assert!(queue.is_empty());
    }

    #[test]
    fn test_queue_enqueue_dequeue() {
        let mut queue: Queue<i32> = Queue::new();
        queue.enqueue(10);
        queue.enqueue(20);

        assert_eq!(queue.dequeue(), Some(10));
        assert_eq!(queue.dequeue(), Some(20));
        assert!(queue.dequeue().is_none());
    }

    #[test]
    fn test_queue_peek() {
        let mut queue: Queue<i32> = Queue::new();
        queue.enqueue(10);
        queue.enqueue(20);

        assert_eq!(queue.peek(), Some(10).as_ref());
    }

    #[test]
    fn test_queue_size() {
        let mut queue: Queue<i32> = Queue::new();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();

        assert_eq!(queue.size, 1);
    }

    #[test]
    fn test_queue_multiple_dequeues() {
        let mut queue: Queue<i32> = Queue::new();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assert_eq!(queue.dequeue(), Some(10));
        assert_eq!(queue.dequeue(), Some(20));
        assert_eq!(queue.dequeue(), Some(30));
        assert!(queue.dequeue().is_none());
    }

    #[test]
    fn test_queue_peek_after_dequeue() {
        let mut queue: Queue<i32> = Queue::new();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();

        assert_eq!(queue.peek(), Some(20).as_ref());
    }

    #[test]
    fn test_queue_empty_after_all_dequeues() {
        let mut queue: Queue<i32> = Queue::new();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();

        assert!(queue.is_empty());
    }
}
