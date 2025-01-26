#[cfg(test)]
mod searching_test {
    use crate::algorithms::searching::{binary_search, linear_search};

    #[test]
    fn linear_search_test() {
        let array = [1, 2, 3, 4, 5, 6, 7, 8, 9];
        assert_eq!(linear_search(&array, 1), Some(0));
        assert_eq!(linear_search(&array, 10), None);
    }
    #[test]
    fn binary_search_test() {
        let array = [1, 2, 3, 4, 5, 6, 7, 8, 9];
        assert_eq!(binary_search(&array, 1), Some(0));
        assert_eq!(binary_search(&array, 10), None);
    }
}
