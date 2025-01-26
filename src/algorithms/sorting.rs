use crate::data_structures::heap::Heap;

/// Sorts a slice using the Bubble Sort algorithm.
///
/// The bubble sort algorithm repeatedly steps through the list, compares adjacent
/// elements, and swaps them if they are in the wrong order. This process continues
/// until the list is sorted.
///
/// # Parameters
/// - `arr`: A mutable reference to the slice of integers to be sorted.
///
/// # Time Complexity
/// - Best: `O(n)`
/// - Worst: `O(n²)`
/// - Average: `O(n²)`
///
/// # Space Complexity
/// - `O(1)` (in-place sorting)
pub fn bubble_sort(arr: &mut [i32]) {
    for i in 0..arr.len() {
        for j in 1..(arr.len() - i) {
            if arr[j] < arr[j - 1] {
                arr.swap(j, j - 1);
            }
        }
    }
}

/// Sorts a slice using the Insertion Sort algorithm.
///
/// Insertion sort builds the sorted array one element at a time. It takes each new element
/// and inserts it into its correct position within the sorted portion of the array.
///
/// # Parameters
/// - `arr`: A mutable reference to the slice of integers to be sorted.
///
/// # Time Complexity
/// - Best: `O(n)`
/// - Worst: `O(n²)`
/// - Average: `O(n²)`
///
/// # Space Complexity
/// - `O(1)` (in-place sorting)
pub fn insertion_sort(arr: &mut [i32]) {
    for i in 1..arr.len() {
        let mut j = i;
        while j > 0 && arr[j - 1] > arr[j] {
            arr.swap(j, j - 1);
            j -= 1;
        }
    }
}

/// Sorts a slice using the Selection Sort algorithm.
///
/// Selection sort repeatedly selects the minimum element from the unsorted portion of the array
/// and swaps it with the first unsorted element.
///
/// # Parameters
/// - `arr`: A mutable reference to the slice of integers to be sorted.
///
/// # Time Complexity
/// - Best: `O(n²)`
/// - Worst: `O(n²)`
/// - Average: `O(n²)`
///
/// # Space Complexity
/// - `O(1)` (in-place sorting)
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

/// Sorts a slice using the Merge Sort algorithm.
///
/// Merge sort is a divide-and-conquer algorithm that splits the array into two halves, 
/// recursively sorts them, and then merges the sorted halves.
///
/// # Parameters
/// - `arr`: A mutable reference to the slice of integers to be sorted.
///
/// # Time Complexity
/// - Best: `O(n log n)`
/// - Worst: `O(n log n)`
/// - Average: `O(n log n)`
///
/// # Space Complexity
/// - `O(n)` (requires additional space for merging)
pub fn merge_sort(arr: &mut [i32]) {
    if arr.len() <= 1 {
        return;
    }
    let mid = arr.len() / 2;
    merge_sort(&mut arr[..mid]);
    merge_sort(&mut arr[mid..]);
    merge(arr, mid);
}
/// Merges two sorted halves of a slice.
///
/// # Parameters
/// - `arr`: The slice to merge the halves into.
/// - `mid`: The index where the array is split into two halves.
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

/// Sorts a slice using the Quick Sort algorithm.
///
/// Quick Sort is a divide-and-conquer algorithm that picks a 'pivot' element from the array,
/// partitions the array around the pivot, and recursively sorts the two subarrays.
///
/// # Parameters
/// - `arr`: A mutable reference to the slice of integers to be sorted.
///
/// # Time Complexity
/// - Best: `O(n log n)`
/// - Worst: `O(n²)`
/// - Average: `O(n log n)`
///
/// # Space Complexity
/// - `O(log n)` (due to recursion stack)
pub fn quick_sort(arr: &mut [i32]) {
    if arr.len() <= 1 {
        return;
    }

    let pivot_index = partition(arr);

    let (left, right) = arr.split_at_mut(pivot_index);
    quick_sort(left);
    quick_sort(&mut right[1..]);
}
/// Partitions the slice around a pivot element.
///
/// # Parameters
/// - `arr`: A mutable reference to the slice to be partitioned.
///
/// # Returns
/// - The index of the pivot element after partitioning.
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

/// Sorts a slice using the Counting Sort algorithm.
///
/// Counting sort works by counting the occurrences of each element and then reconstructing the sorted
/// array based on the counts.
///
/// # Parameters
/// - `arr`: A mutable reference to the slice of integers to be sorted.
///
/// # Time Complexity
/// - Best: `O(n + k)`
/// - Worst: `O(n + k)`
/// - Average: `O(n + k)`
///
/// # Space Complexity
/// - `O(k)` (requires extra space for the count array)
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

/// Sorts a slice using the Radix Sort algorithm.
///
/// Radix sort processes the elements digit by digit, sorting them by each digit starting from the least significant digit.
///
/// # Parameters
/// - `arr`: A mutable reference to the slice of integers to be sorted.
///
/// # Time Complexity
/// - Best: `O(nk)`
/// - Worst: `O(nk)`
/// - Average: `O(nk)`
///
/// # Space Complexity
/// - `O(n + k)` (requires additional space for the buckets)
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

/// Sorts a heap in ascending order (min heap) or descending order (max heap)
/// 
/// Heap sort transforms its elements into a heap, then repeatedly removes
/// the largest (or smallest) element and places it in the correct position,
/// restoring the heap property after each removal.
/// 
/// # Parameters
/// - `&mut Heap<i32>`: a mutable reference to a `Heap` instance and sorts its elements
/// 
/// If the heap is configured as a max-heap, the elements
/// will be sorted in ascending order. If it's a min-heap, the elements
/// will be sorted in descending order.
/// 
/// # Time Complexity
/// - Best: `O(n log n)`
/// - Worst: `O(n log n)`
/// - Average: `O(n log n)`
/// 
/// # Space Complexity
/// - `O(n + k)`
pub fn heap_sort(heap: &mut Heap<i32>) {
    heap.build_heap();
    let mut considered = heap.values.len();
    
    while considered > 1 {
        heap.values.swap(0, considered - 1);
        considered -= 1;
        heap.sift_down(0, considered);
    }
}
