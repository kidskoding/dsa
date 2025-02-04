pub fn euclidean_algorithm(mut a: u64, mut b: u64) -> u64 {
    while b != 0 {
        let temp = b;
        b = a % b;
        a = temp;
    }
    a
}

pub fn euclidean_algorithm_recursion(a: u64, b: u64) -> u64 {
    if b == 0 {
        return a;
    }
    euclidean_algorithm_recursion(b, a % b)
}