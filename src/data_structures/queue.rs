use crate::data_structures::node::Node;

/// A queue data structure with a fixed capacity.
///
/// This structure implements a simple queue where elements of type `T` are
/// enqueued and dequeued according to the First-In-First-Out (FIFO) principle.
pub struct Queue<T> {
    /// The front of the queue, represented by an `Option` of a `Box` containing the first `Node`.
    ///
    /// This points to the first element in the queue. If the queue is empty, this is `None`.
    /// The front node is removed when dequeuing an element.
    front: Option<Box<Node<T>>>,
    /// A pointer to the rear node in the queue.
    ///
    /// This is a raw pointer to the last `Node` in the queue. It is used to quickly append new
    /// nodes at the end when enqueuing. It is set to `null_mut` if the queue is empty.
    rear: *mut Node<T>,
    /// The current size of the queue.
    ///
    /// This keeps track of how many elements are in the queue. It is incremented when an element
    /// is enqueued and decremented when an element is dequeued.
    size: usize,
}

impl<T> Queue<T> {
    /// Creates a new, empty `Queue`.
    ///
    /// # Examples
    ///
    /// ```
    /// use dsa::data_structures::queue::Queue;
    /// let queue: Queue<i32> = Queue::new();
    /// assert!(queue.is_empty());
    /// ```
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
    /// use dsa::data_structures::queue::Queue;
    /// let mut queue = Queue::new();
    /// queue.enqueue(10);
    /// queue.enqueue(20);
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
    /// use dsa::data_structures::queue::Queue;
    /// let mut queue = Queue::new();
    /// queue.enqueue(10);
    /// queue.enqueue(20);
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
    /// use dsa::data_structures::queue::Queue;
    /// let mut queue = Queue::new();
    /// queue.enqueue(10);
    /// queue.enqueue(20);
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
    /// use dsa::data_structures::queue::Queue;
    /// let mut queue = Queue::new();
    /// assert!(queue.is_empty());
    /// queue.enqueue(10);
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
    /// use dsa::data_structures::queue::Queue;
    /// let mut queue: Queue<i32> = Queue::new();
    /// queue.enqueue(10);
    /// queue.enqueue(20);
    /// queue.dequeue();
    /// assert_eq!(queue.size(), 1);
    /// ```
    pub fn size(&self) -> usize {
        self.size
    }
}