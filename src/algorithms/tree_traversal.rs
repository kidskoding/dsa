use std::collections::VecDeque;
use crate::data_structures::tree::{BinaryTree};

/// Performs a level-order traversal (breadth-first traversal) on a binary tree.
///
/// This traversal visits each level of the tree from top to bottom, left to right. It uses a queue to keep track of the nodes to visit.
///
/// # Parameters
/// - `tree`: An `Option<Box<BinaryTree<T>>>` representing the root of the binary tree.
///
/// # Returns
/// A `Vec<T>` containing the values of the nodes in level-order.
///
/// # Time Complexity
/// - `O(n)`, where n is the number of nodes in the tree.
///
/// # Space Complexity
/// - `O(n)`, as the queue holds all the nodes at a given level.
/// 
/// # Examples
/// ```
/// use dsa::algorithms::tree_traversal::{level_order_traversal, pre_order_traversal};use dsa::data_structures::tree::{BinaryTree, TreeNode};
///
/// let left_left_tree = BinaryTree::new(TreeNode::new(4), None, None);
/// let left_right_tree = BinaryTree::new(TreeNode::new(5), None, None);
/// let right_left_tree = BinaryTree::new(TreeNode::new(6), None, None);
/// let right_right_tree = BinaryTree::new(TreeNode::new(7), None, None);
///
/// let left_tree = BinaryTree::new(TreeNode::new(2), Some(Box::new(left_left_tree)), Some(Box::new(left_right_tree)));
/// let right_tree = BinaryTree::new(TreeNode::new(3), Some(Box::new(right_left_tree)), Some(Box::new(right_right_tree)));
///
/// let tree = BinaryTree::new(TreeNode::new(1), Some(Box::new(left_tree)), Some(Box::new(right_tree)));
/// let tree_ptr = Some(Box::new(tree));
///
/// let result = level_order_traversal(&tree_ptr);
/// let expected: Vec<_> = vec![1, 2, 3, 4, 5, 6, 7].into_iter().collect();
/// assert_eq!(result, expected);
/// ```
pub fn level_order_traversal<T: Clone>(tree: &Option<Box<BinaryTree<T>>>) -> Vec<T> {
    let mut visited = Vec::new();
    let mut queue = VecDeque::new();
    if let Some(root) = tree {
        queue.push_back(root);
        while let Some(current) = queue.pop_front() {
            visited.push(current.root.value.clone());
            if let Some(left) = &current.left {
                queue.push_back(left);
            }
            if let Some(right) = &current.right {
                queue.push_back(right);
            }
        }
    }
    visited
}

/// Performs a pre-order traversal on a binary tree.
///
/// In pre-order traversal, the root node is visited first, followed by the left subtree, and then the right subtree.
///
/// # Parameters
/// - `tree`: An `Option<Box<BinaryTree<T>>>` representing the root of the binary tree.
///
/// # Returns
/// A `Vec<T>` containing the values of the nodes in pre-order.
///
/// # Time Complexity
/// - `O(n)`, where n is the number of nodes in the tree.
///
/// # Space Complexity
/// - `O(n)`, due to the recursion stack and storage of visited nodes.
/// 
/// # Examples
/// ```
/// use dsa::algorithms::tree_traversal::{in_order_traversal, pre_order_traversal};
/// use dsa::data_structures::tree::{BinaryTree, TreeNode};
///
/// let left_left_tree = BinaryTree::new(TreeNode::new(4), None, None);
/// let left_right_tree = BinaryTree::new(TreeNode::new(5), None, None);
/// let right_left_tree = BinaryTree::new(TreeNode::new(6), None, None);
/// let right_right_tree = BinaryTree::new(TreeNode::new(7), None, None);
///
/// let left_tree = BinaryTree::new(TreeNode::new(2), Some(Box::new(left_left_tree)), Some(Box::new(left_right_tree)));
/// let right_tree = BinaryTree::new(TreeNode::new(3), Some(Box::new(right_left_tree)), Some(Box::new(right_right_tree)));
///
/// let tree = BinaryTree::new(TreeNode::new(1), Some(Box::new(left_tree)), Some(Box::new(right_tree)));
/// let tree_ptr = Some(Box::new(tree));
///
/// let result = pre_order_traversal(&tree_ptr);
///
/// let expected: Vec<_> = vec![1, 2, 4, 5, 3, 6, 7].into_iter().collect();
/// assert_eq!(result, expected);
/// ```
pub fn pre_order_traversal<T: Clone>(tree: &Option<Box<BinaryTree<T>>>) -> Vec<T> {
    let mut visited: Vec<T> = Vec::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.push(tree.root.value.clone());
        visited.extend(pre_order_traversal(&tree.left));
        visited.extend(pre_order_traversal(&tree.right));
    }
    visited
}

/// Performs an in-order traversal on a binary tree.
///
/// In in-order traversal, the left subtree is visited first, followed by the root node, and then the right subtree.
///
/// # Parameters
/// - `tree`: An `Option<Box<BinaryTree<T>>>` representing the root of the binary tree.
///
/// # Returns
/// A `Vec<T>` containing the values of the nodes in in-order.
///
/// # Time Complexity
/// - `O(n)`, where n is the number of nodes in the tree.
///
/// # Space Complexity
/// - `O(n)`, due to the recursion stack and storage of visited nodes.
/// 
/// # Examples
/// ```
/// use dsa::algorithms::tree_traversal::in_order_traversal;
/// use dsa::data_structures::tree::{BinaryTree, TreeNode};
/// 
/// let left_left_tree = BinaryTree::new(TreeNode::new(4), None, None);
/// let left_right_tree = BinaryTree::new(TreeNode::new(5), None, None);
/// let right_left_tree = BinaryTree::new(TreeNode::new(6), None, None);
/// let right_right_tree = BinaryTree::new(TreeNode::new(7), None, None);
///
/// let left_tree = BinaryTree::new(TreeNode::new(2), Some(Box::new(left_left_tree)), Some(Box::new(left_right_tree)));
/// let right_tree = BinaryTree::new(TreeNode::new(3), Some(Box::new(right_left_tree)), Some(Box::new(right_right_tree)));
///
/// let tree = BinaryTree::new(TreeNode::new(1), Some(Box::new(left_tree)), Some(Box::new(right_tree)));
/// let tree_ptr = Some(Box::new(tree));
///
/// let result = in_order_traversal(&tree_ptr);
///
/// let expected: Vec<_> = vec![4, 2, 5, 1, 6, 3, 7].into_iter().collect();
/// assert_eq!(result, expected);
pub fn in_order_traversal<T: Clone>(tree: &Option<Box<BinaryTree<T>>>) -> Vec<T> {
    let mut visited: Vec<T> = Vec::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.extend(in_order_traversal(&tree.left));
        visited.push(tree.root.value.clone());
        visited.extend(in_order_traversal(&tree.right));
    }
    visited
}

/// Performs an in-order traversal on a binary tree.
///
/// In in-order traversal, the left subtree is visited first, followed by the root node, and then the right subtree.
///
/// # Parameters
/// - `tree`: An `Option<Box<BinaryTree<T>>>` representing the root of the binary tree.
///
/// # Returns
/// A `Vec<T>` containing the values of the nodes in in-order.
///
/// # Time Complexity
/// - `O(n)`, where n is the number of nodes in the tree.
///
/// # Space Complexity
/// - `O(n)`, due to the recursion stack and storage of visited nodes.
/// 
/// # Examples
/// ```
/// use dsa::algorithms::tree_traversal::post_order_traversal;
/// use dsa::data_structures::tree::{BinaryTree, TreeNode};
/// 
/// let left_left_tree = BinaryTree::new(TreeNode::new(4), None, None);
/// let left_right_tree = BinaryTree::new(TreeNode::new(5), None, None);
/// let right_left_tree = BinaryTree::new(TreeNode::new(6), None, None);
/// let right_right_tree = BinaryTree::new(TreeNode::new(7), None, None);
///
/// let left_tree = BinaryTree::new(TreeNode::new(2), Some(Box::new(left_left_tree)), Some(Box::new(left_right_tree)));
/// let right_tree = BinaryTree::new(TreeNode::new(3), Some(Box::new(right_left_tree)), Some(Box::new(right_right_tree)));
///
/// let tree = BinaryTree::new(TreeNode::new(1), Some(Box::new(left_tree)), Some(Box::new(right_tree)));
/// let tree_ptr = Some(Box::new(tree));
///
/// let result = post_order_traversal(&tree_ptr);
///
/// let expected: Vec<_> = vec![4, 5, 2, 6, 7, 3, 1].into_iter().collect();
/// assert_eq!(result, expected);
/// ```
pub fn post_order_traversal<T: Clone>(tree: &Option<Box<BinaryTree<T>>>) -> Vec<T> {
    let mut visited: Vec<T> = Vec::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.extend(post_order_traversal(&tree.left));
        visited.extend(post_order_traversal(&tree.right));
        visited.push(tree.root.value.clone());
    }
    visited
}