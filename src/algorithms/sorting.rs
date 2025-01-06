pub fn bubble_sort(arr: &mut [i32]) {
    for i in 0..arr.len() {
        for j in 1..(arr.len() - i) {
            if arr[j] < arr[j - 1] {
                arr.swap(j, j - 1);
            }
        }
    }
}

pub fn insertion_sort(arr: &mut [i32]) {
    for i in 1..arr.len() {
        let mut j = i;
        while j > 0 && arr[j - 1] > arr[j] {
            arr.swap(j, j - 1);
            j -= 1;
        }
    }
}

pub fn selection_sort(arr: &mut [i32]) {
    for i in 0..arr.len() {
        let mut min_index = i;
        for j in i + 1..arr.len() {
            if arr[j] < arr[min_index] {
                min_index = j;
            }
        }
        arr.swap(i, min_index);
    }
}

pub fn merge_sort(arr: &mut [i32]) {
    if arr.len() <= 1 {
        return;
    }
    let mid = arr.len() / 2;
    merge_sort(&mut arr[..mid]);
    merge_sort(&mut arr[mid..]);
    merge(arr, mid);
}
fn merge(arr: &mut [i32], mid: usize) {
    let left = arr[..mid].to_vec();
    let right = arr[mid..].to_vec();

    let (mut i, mut j, mut k) = (0, 0, 0);

    while i < left.len() && j < right.len() {
        if left[i] <= right[j] {
            arr[k] = left[i];
            i += 1;
        } else {
            arr[k] = right[j];
            j += 1;
        }
        k += 1;
    }

    while i < left.len() {
        arr[k] = left[i];
        i += 1;
        k += 1;
    }

    while j < right.len() {
        arr[k] = right[j];
        j += 1;
        k += 1;
    }
}

#[cfg(test)]
mod tests {
    use super::*;

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
}
