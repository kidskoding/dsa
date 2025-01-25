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

pub fn quick_sort(arr: &mut [i32]) {
    if arr.len() <= 1 {
        return;
    }

    let pivot_index = partition(arr);

    let (left, right) = arr.split_at_mut(pivot_index);
    quick_sort(left);
    quick_sort(&mut right[1..]);
}
fn partition(arr: &mut [i32]) -> usize {
    let pivot_index = arr.len() - 1;
    let pivot = arr[pivot_index];
    let mut i = 0;

    for j in 0..arr.len() - 1 {
        if arr[j] < pivot {
            arr.swap(i, j);
            i += 1;
        }
    }

    arr.swap(i, pivot_index);
    i
}

pub fn counting_sort(arr: &mut [i32]) {
    let max = *arr.iter().max().unwrap();
    let mut count_arr = vec![0; max as usize + 1];
    
    for &num in arr.iter() {
        count_arr[num as usize] += 1;
    }
    
    let mut index = 0;
    for (num, &count) in count_arr.iter().enumerate() {
        for _ in 0..count {
            arr[index] = num as i32;
            index += 1;
        }
    }
}

pub fn radix_sort(arr: &mut [i32]) {
    let max_val = *arr.iter().max().unwrap();
    let mut exp = 1;

    while max_val / exp > 0 {
        let mut radix_array = vec![vec![]; 10];

        for &num in arr.iter() {
            let digit = (num / exp) % 10;
            radix_array[digit as usize].push(num);
        }

        let mut idx = 0;
        for bucket in radix_array.iter() {
            for &num in bucket.iter() {
                arr[idx] = num;
                idx += 1;
            }
        }

        exp *= 10;
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
