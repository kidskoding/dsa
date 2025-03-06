#[cfg(test)]
mod heap_test {
    use dsa::data_structures::heap::Heap;

    #[test]
    fn build_min_heap_test() {
        let values = vec![5, 6, 7, 8, 1, 2, 3];
        let mut min_heap = Heap::new(false);
        min_heap.values = values;
        min_heap.build_heap();
        
        assert_eq!(min_heap.values, vec![1, 5, 2, 8, 6, 7, 3]);
        assert_eq!(min_heap.values[0], 1);
        
        let len = min_heap.values.len();
        for i in 0..len / 2 {
            let left_child = 2 * i + 1;
            let right_child = 2 * i + 2;
            if left_child < len {
                assert!(min_heap.values[i] <= min_heap.values[left_child]);
            }
            if right_child < len {
                assert!(min_heap.values[i] <= min_heap.values[right_child]);
            }
        }
    }
    #[test]
    fn build_max_heap_test() {
        let values = vec![5, 6, 7, 8, 1, 2, 3];
        let mut max_heap = Heap::new(true);
        max_heap.values = values;
        max_heap.build_heap();
        
        assert_eq!(max_heap.values, vec![8, 6, 7, 5, 1, 2, 3]);
        assert_eq!(max_heap.values[0], 8);
        
        let len = max_heap.values.len();
        for i in 0..len / 2 {
            let left_child = 2 * i + 1;
            let right_child = 2 * i + 2;
            if left_child < len {
                assert!(max_heap.values[i] >= max_heap.values[left_child]);
            }
            if right_child < len {
                assert!(max_heap.values[i] >= max_heap.values[right_child]);
            }
        }
    }
}
