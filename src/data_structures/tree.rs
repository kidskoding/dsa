use std::cmp::Ordering;

/// A tree node that holds a value of type `T`.
///
/// This structure represents a single node in a binary tree. It holds a value of type `T` and can
/// be compared to other `TreeNode`s based on the value it contains.
#[derive(Eq, Hash, PartialEq, Clone, Debug)]
pub struct TreeNode<T> {
    /// The value of the `TreeNode`
    pub value: T,
}
impl<T> TreeNode<T> {
    /// Creates a new `TreeNode` with the given value.
    ///
    /// # Examples
    ///
    /// ```
    /// let node = TreeNode::new(10);
    /// assert_eq!(node.value, 10);
    /// ```
    pub fn new(value: T) -> Self {
        TreeNode {
            value,
        }
    }
}
impl<T: Ord> PartialOrd for TreeNode<T> {
    /// Compares two `TreeNode`s for partial ordering.
    ///
    /// # Examples
    ///
    /// ```
    /// let node1 = TreeNode::new(10);
    /// let node2 = TreeNode::new(20);
    ///
    /// assert_eq!(node1.partial_cmp(&node2), Some(std::cmp::Ordering::Less));
    /// ```
    fn partial_cmp(&self, other: &Self) -> Option<Ordering> {
        self.value.partial_cmp(&other.value)
    }
}
impl<T: Ord> Ord for TreeNode<T> {
    /// Compares two `TreeNode`s for total ordering.
    ///
    /// # Examples
    ///
    /// ```
    /// let node1 = TreeNode::new(10);
    /// let node2 = TreeNode::new(20);
    ///
    /// assert_eq!(node1.cmp(&node2), std::cmp::Ordering::Less);
    /// ```
    fn cmp(&self, other: &Self) -> Ordering {
        self.value.cmp(&other.value)
    }
}

/// A binary tree structure that contains a `TreeNode` and two child nodes.
///
/// This structure represents a binary tree where each node contains a `TreeNode` value and two
/// child nodes, `left` and `right`, which are either `Some(Box<BinaryTree<T>>)`, or `None` if the
/// node has no children.
pub struct BinaryTree<T> {
    /// The current node of the `BinaryTree`
    pub node: TreeNode<T>,
    /// The left child of the `BinaryTree`, or `None` if there is no left child
    pub left: Option<Box<BinaryTree<T>>>,
    /// The right child of the `BinaryTree`, or `None` if there is no right child
    pub right: Option<Box<BinaryTree<T>>>,
}
impl<T> BinaryTree<T> {
    /// Creates a new `BinaryTree` with the given node, left child, and right child.
    ///
    /// # Examples
    ///
    /// ```
    /// let root = TreeNode::new(10);
    /// let left_child = TreeNode::new(5);
    /// let right_child = TreeNode::new(15);
    ///
    /// let tree = BinaryTree::new(root, 
    ///     Some(Box::new(BinaryTree::new(left_child, None, None))),
    ///     Some(Box::new(BinaryTree::new(right_child, None, None)))
    /// );
    /// ```
    pub fn new(node: TreeNode<T>, left: Option<Box<BinaryTree<T>>>, 
               right: Option<Box<BinaryTree<T>>>) -> Self {
        BinaryTree::<T> {
            node,
            left,
            right
        }
    }
}
