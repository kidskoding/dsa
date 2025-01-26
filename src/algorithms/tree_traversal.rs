use std::collections::VecDeque;
use crate::data_structures::tree::{BinaryTree};

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
