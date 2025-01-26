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

        assert_eq!(queue.size(), 1);
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
