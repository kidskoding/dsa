/// A stack data structure.
///
/// This structure implements a simple stack where elements of type `T` are pushed and popped
/// according to the Last-In-First-Out (LIFO) principle. The stack has a fixed size of 100 elements.
pub struct Stack<T> {
    /// An array to store the elements of the stack.
    ///
    /// The stack can hold up to 100 elements of type `T`. Each element is wrapped in an `Option` 
    /// to handle the possibility of uninitialized slots (i.e., `None`).
    ///
    /// The array has a fixed size of 100 elements, providing the stack with a predefined capacity.
    data: [Option<T>; 100],
    
    /// The index of the top element in the stack.
    /// 
    /// This value indicates the position of the last pushed element in the `data` array.
    /// 
    /// A value of `-1` means the stack is empty, and as elements are pushed, this index
    /// is incremented. Conversely, when elements are popped, the index is decremented.
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
    /// 
    /// stack.push(10).unwrap();
    /// stack.push(20).unwrap();
    /// 
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
    /// 
    /// stack.push(10).unwrap();
    /// stack.push(20).unwrap();
    /// 
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
    /// 
    /// stack.push(10).unwrap();
    /// stack.push(20).unwrap();
    /// 
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
    /// 
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
    /// 
    /// stack.push(10).unwrap();
    /// stack.push(20).unwrap();
    /// stack.pop();
    /// 
    /// assert_eq!(stack.size(), 1);
    /// ```
    pub fn size(&self) -> isize { self.top + 1 }
}
