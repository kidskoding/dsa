#[cfg(test)]
mod intro_algorithm_test {
    use crate::algorithms::intro_algorithm::{euclidean_algorithm, euclidean_algorithm_recursion};
    #[test]
    fn euclidean_algorithm_test() {
        assert_eq!(euclidean_algorithm(20, 5), 5);
        assert_eq!(euclidean_algorithm(100, 10), 10);
        assert_eq!(euclidean_algorithm(30, 45), 15);
        assert_eq!(euclidean_algorithm(45, 30), 15);
        assert_eq!(euclidean_algorithm(100, 0), 100);
    }
    #[test]
    fn euclidean_algorithm_recursion_test() {
        assert_eq!(euclidean_algorithm_recursion(20, 5), 5);
        assert_eq!(euclidean_algorithm_recursion(100, 10), 10);
        assert_eq!(euclidean_algorithm_recursion(30, 45), 15);
        assert_eq!(euclidean_algorithm_recursion(45, 30), 15);
        assert_eq!(euclidean_algorithm_recursion(100, 0), 100);
    }
}