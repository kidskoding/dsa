pub fn linear_search(array: &[i32], target: i32) -> Option<usize> {
    for i in 0..array.len() {
        if array[i] == target {
            return Some(i);
        }
    }
    None
}

pub fn binary_search(array: &[i32], target: i32) -> Option<usize> {
    let mut left = 0;
    let mut right = array.len() - 1;
    while left <= right {
        let mid = (left + right) / 2;
        if target < array[mid] {
            right = mid - 1;
        } else if target > array[mid] {
            left = mid + 1;
        } else {
            return Some(mid);
        }
    }
    None
}

#[cfg(test)]
mod tests {
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
