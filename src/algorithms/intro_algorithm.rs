/// Performs the Euclidean Algorithm on `a` and `b` to
/// calculate the greatest common divisor (GCD) between
/// `a` and `b`
/// 
/// # Parameters
/// - `a`: An unsigned 64-bit integer
/// - `b`: An unsigned 64-bit integer
/// 
/// # Returns
/// - An unsigned 64-bit integer representing 
/// the greatest common divisor of `a` and `b`
/// 
/// # Examples
/// ```
/// use dsa::algorithms::intro_algorithm::euclidean_algorithm;
/// 
/// assert_eq!(euclidean_algorithm(20, 5), 5);
/// ```
pub fn euclidean_algorithm(mut a: u64, mut b: u64) -> u64 {
    while b != 0 {
        let temp = b;
        b = a % b;
        a = temp;
    }
    
    a
}

/// Performs the Euclidean Algorithm **recursively** on `a` and `b`
/// to calculate the greatest common divisor (GCD) between
/// `a` and `b`
/// 
/// # Parameters
/// - `a`: An unsigned 64-bit integer
/// - `b`: An unsigned 64-bit integer
/// 
/// # Returns
/// - An unsigned 64-bit integer representing the
///   greatest common divisor of `a` and `b`
/// 
/// # Examples
/// ```
/// use dsa::algorithms::intro_algorithm::euclidean_algorithm_recursion;
/// 
/// assert_eq!(euclidean_algorithm_recursion(20, 5), 5);
/// ```
pub fn euclidean_algorithm_recursion(a: u64, b: u64) -> u64 {
    if b == 0 {
        return a;
    }
    
    euclidean_algorithm_recursion(b, a % b)
}