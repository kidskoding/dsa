/// A stack data structure.
///
/// This structure implements a simple stack where elements of type `T` are pushed and popped
/// according to the Last-In-First-Out (LIFO) principle. The stack has a fixed size of 100 elements.
pub struct Stack<T> {
    data: [Option<T>; 100],
    top: isize,
}

impl<T> Stack<T> {
    /// Creates a new, empty `Stack`.
    ///
    /// # Examples
    ///
    /// ```
    /// let stack: Stack<i32> = Stack::new();
    /// assert!(stack.is_empty());
    /// ```
    pub fn new() -> Self {
        Stack {
            data: [(); 100].map(|_| None),
            top: -1,
        }
    }

    /// Pushes a value onto the `Stack`.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut stack = Stack::new();
    /// stack.push(10).unwrap();
    /// stack.push(20).unwrap();
    /// assert_eq!(stack.peek(), Some(&20));
    /// ```
    pub fn push(&mut self, value: T) -> Result<(), &str> {
        if self.top + 1 >= self.data.len() as isize {
            Err("Stack Overflow")
        } else {
            self.top += 1;
            self.data[self.top as usize] = Some(value);
            Ok(())
        }
    }

    /// Pops a value from the `Stack`.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut stack = Stack::new();
    /// stack.push(10).unwrap();
    /// stack.push(20).unwrap();
    /// assert_eq!(stack.pop(), Some(20));
    /// assert_eq!(stack.pop(), Some(10));
    /// assert!(stack.pop().is_none());
    /// ```
    pub fn pop(&mut self) -> Option<T> {
        if self.top == -1 {
            None
        } else {
            let value = self.data[self.top as usize].take();
            self.top -= 1;
            value
        }
    }

    /// Returns a reference to the top element without removing it.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut stack = Stack::new();
    /// stack.push(10).unwrap();
    /// stack.push(20).unwrap();
    /// assert_eq!(stack.peek(), Some(&20));
    /// ```
    pub fn peek(&self) -> Option<&T> {
        if self.top == -1 {
            None
        } else {
            self.data[self.top as usize].as_ref()
        }
    }

    /// Checks if the `Stack` is empty.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut stack = Stack::new();
    /// assert!(stack.is_empty());
    /// stack.push(10).unwrap();
    /// assert!(!stack.is_empty());
    /// ```
    pub fn is_empty(&self) -> bool {
        self.top == -1
    }
    
    /// Return the size of the `Stack`
    /// 
    /// # Examples
    /// 
    /// ```
    /// let mut stack: Stack<i32> = Stack::new();
    /// stack.push(10).unwrap();
    /// stack.push(20).unwrap();
    /// stack.pop();
    /// assert_eq!(stack.size(), 1);
    /// ```
    pub fn size(&self) -> isize { self.top + 1 }
}

#[cfg(test)]
mod tests {
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
