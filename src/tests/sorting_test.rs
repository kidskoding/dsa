#[cfg(test)]
mod tests {
    use crate::algorithms::sorting::*;

    #[test]
    fn test_bubble_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        bubble_sort(&mut arr);

        let mut expected = arr;
        expected.sort();

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_insertion_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        insertion_sort(&mut arr);

        let mut expected = arr;
        expected.sort();

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_selection_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        selection_sort(&mut arr);

        let mut expected = arr;
        expected.sort();

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_merge_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        merge_sort(&mut arr);

        let mut expected = arr;
        expected.sort();

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_quick_sort() {
        let mut arr = [66, 18, 54, 67, 36, 44, 78, 18, 12, 56];
        quick_sort(&mut arr);

        let mut expected = arr;
        expected.sort();

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_counting_sort() {
        let mut arr = [2, 5, 3, 0, 2, 3, 0, 3];
        counting_sort(&mut arr);

        let mut expected = arr;
        expected.sort();

        assert_eq!(arr, expected);
    }
    #[test]
    fn test_radix_sort() {
        let mut arr = [2, 5, 3, 0, 2, 3, 0, 3];
        radix_sort(&mut arr);

        let mut expected = arr;
        expected.sort();

        assert_eq!(arr, expected);
    }
}
