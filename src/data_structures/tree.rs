use std::cmp::Ordering;

/// A tree node that holds a value of type `T` generic
///
/// This structure represents a single node in a binary tree. It holds a value of type `T` and can
/// be compared to other `TreeNode`s based on the value it contains.
#[derive(Eq, Hash, PartialEq, Clone, Debug)]
pub struct TreeNode<T> {
    /// The `value` of this `TreeNode`
    pub value: T,
}
impl<T> TreeNode<T> {
    /// Creates a new `TreeNode` with the given `value`
    ///
    /// # Parameters
    /// - `value`: The value to be stored in this `TreeNode`
    /// 
    /// # Returns
    /// - A new instance of `TreeNode` containing the provided `value`
    pub fn new(value: T) -> Self {
        TreeNode {
            value,
        }
    }
}
impl<T: Ord> PartialOrd for TreeNode<T> {
    /// Compares two `TreeNode`s for partial ordering.
    /// 
    /// ### Parameters
    /// - other: Another `TreeNode` object to compare this `TreeNode`s value
    /// 
    /// ### Returns
    /// - An optional `Ordering` object that indicates whether there exists an
    ///     `Ordering` where this `TreeNode` is less than, equal to, or greater than
    ///     the other `TreeNode`.
    fn partial_cmp(&self, other: &Self) -> Option<Ordering> {
        self.value.partial_cmp(&other.value)
    }
}
impl<T: Ord> Ord for TreeNode<T> {
    /// Compares two `TreeNode`s for total ordering.
    ///
    /// ### Parameters
    /// - `other`: Another `TreeNode` instance to compare the value to this `TreeNode`'s
    /// value
    /// 
    /// ### Returns
    /// - An `Ordering` object that indicates whether the value of
    /// this `TreeNode` is less than, equal to, or greater than the value
    /// of the other `TreeNode`
    fn cmp(&self, other: &Self) -> Ordering {
        self.value.cmp(&other.value)
    }
}

/// A `BinaryTree` data structure that contains a `TreeNode` and two 
/// optional child nodes (`left` and `right`)
///
/// This structure represents a binary tree where each node contains a `TreeNode` value and two
/// child nodes, `left` and `right`, which are either `Some(Box<BinaryTree<T>>)`, or `None` if the
/// node has no children.
pub struct BinaryTree<T> {
    /// The root of the `BinaryTree`
    pub root: TreeNode<T>,
    /// The left child of the `BinaryTree`, or `None` if there is no left child
    pub left: Option<Box<BinaryTree<T>>>,
    /// The right child of the `BinaryTree`, or `None` if there is no right child
    pub right: Option<Box<BinaryTree<T>>>,
}
impl<T> BinaryTree<T> {
    /// Creates a new `BinaryTree` with the given node, left child, and right child.
    /// 
    /// ### Parameters
    /// - `root`: A `TreeNode` object that represents the topmost 
    /// node of this `BinaryTree`
    /// - `left`: An optional `BinaryTree` `Box` pointer that points to the
    /// left child of this `BinaryTree`, or `None` if no left child exists
    /// - `right`: An optional `BinaryTree` `Box` pointer that points to the
    /// right child of this `BinaryTree`, or `None` if no right child exists
    /// 
    /// ### Returns
    /// - A new instance of a `BinaryTree` containing the given `root` node,
    /// `left` child, and `right` child
    pub fn new(root: TreeNode<T>, left: Option<Box<BinaryTree<T>>>, 
               right: Option<Box<BinaryTree<T>>>) -> Self {
        BinaryTree::<T> {
            root,
            left,
            right
        }
    }
}