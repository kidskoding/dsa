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
pub fn level_order_traversal<T: Clone>(tree: &Option<Box<BinaryTree<T>>>) -> Vec<T> {
    let mut visited = Vec::new();
    let mut queue = VecDeque::new();
    if let Some(root) = tree {
        queue.push_back(root);
        while let Some(current) = queue.pop_front() {
            visited.push(current.node.value.clone());
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
pub fn pre_order_traversal<T: Clone>(tree: &Option<Box<BinaryTree<T>>>) -> Vec<T> {
    let mut visited: Vec<T> = Vec::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.push(tree.node.value.clone());
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
pub fn in_order_traversal<T: Clone>(tree: &Option<Box<BinaryTree<T>>>) -> Vec<T> {
    let mut visited: Vec<T> = Vec::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.extend(in_order_traversal(&tree.left));
        visited.push(tree.node.value.clone());
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
pub fn post_order_traversal<T: Clone>(tree: &Option<Box<BinaryTree<T>>>) -> Vec<T> {
    let mut visited: Vec<T> = Vec::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.extend(post_order_traversal(&tree.left));
        visited.extend(post_order_traversal(&tree.right));
        visited.push(tree.node.value.clone());
    }
    visited
}