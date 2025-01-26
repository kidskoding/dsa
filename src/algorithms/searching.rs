/// Performs a linear search to find the index of a target value in an array.
///
/// This function iterates through each element in the array and compares it
/// with the target. If a match is found, the index of the target element is returned.
///
/// # Arguments
///
/// * `array` - A reference to a slice of integers where the target value is searched.
/// * `target` - The integer value to search for in the array.
///
/// # Returns
///
/// * `Some(usize)` - If the target is found, returns the index of the target in the array.
/// * `None` - If the target is not found, returns `None`.
///
/// # Examples
///
/// ```
/// let array = [1, 2, 3, 4, 5];
/// assert_eq!(linear_search(&array, 3), Some(2));
/// assert_eq!(linear_search(&array, 6), None);
pub fn linear_search(array: &[i32], target: i32) -> Option<usize> {
    for i in 0..array.len() {
        if array[i] == target {
            return Some(i);
        }
    }
    None
}

/// Performs a binary search to find the index of a target value in a sorted array.
///
/// This function assumes that the array is sorted in ascending order. It works by 
/// repeatedly dividing the search interval in half. If the target is less than 
/// the middle element, the search continues in the left half, and if the target 
/// is greater, the search continues in the right half. This process continues 
/// until the target is found or the search interval is empty.
///
/// # Arguments
///
/// * `array` - A reference to a sorted slice of integers where the target value is searched.
/// * `target` - The integer value to search for in the array.
///
/// # Returns
///
/// * `Some(usize)` - If the target is found, returns the index of the target in the array.
/// * `None` - If the target is not found, returns `None`.
///
/// # Examples
///
/// ```
/// let array = [1, 2, 3, 4, 5];
/// assert_eq!(binary_search(&array, 3), Some(2));
/// assert_eq!(binary_search(&array, 6), None);
/// ```
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
