use std::cmp::Ord;

/// A binary heap data structure that can be either a max-heap or a min-heap.
///
/// A heap is a specialized tree-based data structure that satisfies the 
/// heap property. In a max-heap, for every node `i` other than the root, 
/// the value of `i` is less than or equal to the value of its parent. 
/// Similarly, in a min-heap, for every node `i` other than the root, 
/// the value of `i` is greater than or equal to the value of its parent.
///
/// This implementation allows you to specify whether the heap is a max-heap
/// or a min-heap when creating it.
pub struct Heap<T> {
    /// The values stored in the heap.
    ///
    /// This vector maintains the heap property, where the values are ordered
    /// according to whether the heap is a max-heap or a min-heap.
    pub values: Vec<T>,

    /// Whether the heap is a max-heap or a min-heap.
    ///
    /// If `true`, the heap will be a max-heap; if `false`, the heap will
    /// be a min-heap.
    pub is_max_heap: bool,
}
impl<T: Ord> Heap<T> {
    /// Creates a new empty heap.
    ///
    /// # Parameters
    /// - `is_max_heap`: A boolean flag indicating whether the heap is a
    ///   max-heap (`true`) or a min-heap (`false`).
    ///
    /// # Returns
    /// A new `Heap` instance with no elements.
    ///
    /// # Example
    /// ```
    /// use dsa::data_structures::heap::Heap;
    /// 
    /// let heap: Heap<i32> = Heap::new(true);
    /// assert_eq!(heap.is_max_heap, true);
    /// ```
    pub fn new(is_max_heap: bool) -> Self {
        Heap {
            values: Vec::new(),
            is_max_heap,
        }
    }
    
    /// Inserts a new value into the heap
    /// 
    /// # Parameters
    /// - `value`: The value to insert into the heap
    /// 
    /// # Examples
    /// ```
    /// use dsa::data_structures::heap::Heap;
    /// 
    /// let mut heap = Heap::new(true);
    ///
    /// heap.insert(3);
    /// heap.insert(1);
    /// heap.insert(2);
    /// heap.build_heap();
    /// 
    /// assert_eq!(heap.values, vec![3, 1, 2]);
    /// ```
    pub fn insert(&mut self, value: T) {
        self.values.push(value);
        self.sift_up(self.values.len() - 1);
    }
    
    /// Sifts up a value in the heap to maintain the heap property
    /// 
    /// # Parameters
    /// - `index`: The position of the newly inserted element that needs
    ///    to be moved up
    fn sift_up(&mut self, index: usize) {
        if index == 0 {
            return;
        }
        let parent = (index - 1) / 2;
        let compare_result = if self.is_max_heap {
            self.values[index] > self.values[parent]
        } else {
            self.values[index] < self.values[parent]
        };

        if compare_result {
            self.values.swap(index, parent);
            self.sift_up(parent);
        }
    } 

    /// Builds the heap from the current values.
    ///
    /// This method ensures that the values stored in the heap follow the
    /// heap property. It works by repeatedly calling the `sift_down` function
    /// on each non-leaf node, starting from the last non-leaf node and going
    /// up to the root.
    ///
    /// # Example
    /// ```
    /// use dsa::data_structures::heap::Heap;
    /// 
    /// let mut heap = Heap::new(true);
    ///
    /// heap.insert(3);
    /// heap.insert(1);
    /// heap.insert(2);
    /// heap.build_heap();
    ///
    /// assert_eq!(heap.values, vec![3, 1, 2]);
    /// ```
    pub fn build_heap(&mut self) {
        let len = self.values.len();
        for i in (0..len - 1).rev() {
            self.sift_down(i, len);
        }
    }
    
    /// Sifts down a value in the heap to maintain the heap property.
    ///
    /// This function compares the current node with its children and
    /// swaps it with the larger (or smaller) child, depending on whether
    /// it's a max-heap or min-heap. The process is repeated recursively
    /// until the heap property is restored.
    ///
    /// # Parameters
    /// - `index`: The index of the current node that needs to be sifted down.
    /// - `len`: The total length of the heap (used to avoid out-of-bounds errors).
    pub fn sift_down(&mut self, index: usize, len: usize) {
        let left_child = 2 * index + 1;
        let right_child = 2 * index + 2;
        let mut largest_or_smallest = index;

        if left_child < len {
            let compare_result = if self.is_max_heap {
                self.values[left_child] > self.values[largest_or_smallest]
            } else {
                self.values[left_child] < self.values[largest_or_smallest]
            };

            if compare_result {
                largest_or_smallest = left_child;
            }
        }
        if right_child < len {
            let compare_result = if self.is_max_heap {
                self.values[right_child] > self.values[largest_or_smallest]
            } else {
                self.values[right_child] < self.values[largest_or_smallest]
            };

            if compare_result {
                largest_or_smallest = right_child;
            }
        }

        if largest_or_smallest != index {
            self.values.swap(index, largest_or_smallest);
            self.sift_down(largest_or_smallest, len);
        }
    }
}
