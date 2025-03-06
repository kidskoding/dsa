#[cfg(test)]
mod sorting_test {
    use dsa::algorithms::sorting::*;
    use dsa::data_structures::heap::Heap;

    #[test]
    fn test_bubble_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        bubble_sort(&mut arr);
        let expected = [12, 18, 18, 36, 44, 54, 56, 66, 67, 78];

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_insertion_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        insertion_sort(&mut arr);
        let expected = [12, 18, 18, 36, 44, 54, 56, 66, 67, 78];

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_selection_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        selection_sort(&mut arr);
        let expected = [12, 18, 18, 36, 44, 54, 56, 66, 67, 78];

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_merge_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        merge_sort(&mut arr);
        let expected = [12, 18, 18, 36, 44, 54, 56, 66, 67, 78];

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_quick_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        quick_sort(&mut arr);
        let expected = [12, 18, 18, 36, 44, 54, 56, 66, 67, 78];

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_counting_sort() {
        let mut arr = [2, 5, 3, 0, 2, 3, 0, 3];
        counting_sort(&mut arr);
        let expected = [0, 0, 2, 2, 3, 3, 3, 5];

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_radix_sort() {
        let mut arr = [2, 5, 3, 0, 2, 3, 0, 3];
        radix_sort(&mut arr);
        let expected = [0, 0, 2, 2, 3, 3, 3, 5]; 

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_heap_sort_max_heap() {
        let mut heap = Heap::new(true); // Max-heap
        heap.values = vec![3, 1, 6, 5, 2, 4];
        heap_sort(&mut heap);

        assert_eq!(heap.values, vec![1, 2, 3, 4, 5, 6]);
    }

    #[test]
    fn test_heap_sort_min_heap() {
        let mut heap = Heap::new(false); // Min-heap
        heap.values = vec![3, 1, 6, 5, 2, 4];
        heap_sort(&mut heap);

        assert_eq!(heap.values, vec![6, 5, 4, 3, 2, 1]);
    }
}
