#[cfg(test)]
mod stack_test {
    use crate::data_structures::stack::Stack;

    #[test]
    fn test_stack_is_empty() {
        let stack: Stack<i32> = Stack::new();
        assert!(stack.is_empty());
    }

    #[test]
    fn test_stack_push_pop() {
        let mut stack: Stack<i32> = Stack::new();
        stack.push(10).unwrap();
        stack.push(20).unwrap();
        stack.pop();
        assert_eq!(stack.pop(), Some(10));
    }

    #[test]
    fn test_stack_peek() {
        let mut stack: Stack<i32> = Stack::new();
        stack.push(10).unwrap();
        stack.push(20).unwrap();
        stack.pop();
        assert_eq!(stack.peek(), Some(&10));
    }

    #[test]
    fn test_stack_size() {
        let mut stack: Stack<i32> = Stack::new();
        stack.push(10).unwrap();
        stack.push(20).unwrap();
        stack.pop();
        assert_eq!(stack.size(), 1);
    }
}
