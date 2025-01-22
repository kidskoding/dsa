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

#[cfg(test)]
mod tests {
    use crate::data_structures::tree::{BinaryTree, TreeNode};
    use crate::algorithms::tree_traversal::{post_order_traversal, pre_order_traversal, in_order_traversal, level_order_traversal};

    #[test]
    fn test_pre_order_traversal() {
        let left_left_tree = BinaryTree::new(TreeNode::new(4), None, None);
        let left_right_tree = BinaryTree::new(TreeNode::new(5), None, None);
        let right_left_tree = BinaryTree::new(TreeNode::new(6), None, None);
        let right_right_tree = BinaryTree::new(TreeNode::new(7), None, None);

        let left_tree = BinaryTree::new(TreeNode::new(2), Some(Box::new(left_left_tree)), Some(Box::new(left_right_tree)));
        let right_tree = BinaryTree::new(TreeNode::new(3), Some(Box::new(right_left_tree)), Some(Box::new(right_right_tree)));

        let tree = BinaryTree::new(TreeNode::new(1), Some(Box::new(left_tree)), Some(Box::new(right_tree)));
        let tree_ptr = Some(Box::new(tree));

        let result = pre_order_traversal(&tree_ptr);

        let expected: Vec<_> = vec![1, 2, 4, 5, 3, 6, 7].into_iter().collect();
        assert_eq!(result, expected);
    }

    #[test]
    fn test_in_order_traversal() {
        let left_left_tree = BinaryTree::new(TreeNode::new(4), None, None);
        let left_right_tree = BinaryTree::new(TreeNode::new(5), None, None);
        let right_left_tree = BinaryTree::new(TreeNode::new(6), None, None);
        let right_right_tree = BinaryTree::new(TreeNode::new(7), None, None);

        let left_tree = BinaryTree::new(TreeNode::new(2), Some(Box::new(left_left_tree)), Some(Box::new(left_right_tree)));
        let right_tree = BinaryTree::new(TreeNode::new(3), Some(Box::new(right_left_tree)), Some(Box::new(right_right_tree)));

        let tree = BinaryTree::new(TreeNode::new(1), Some(Box::new(left_tree)), Some(Box::new(right_tree)));
        let tree_ptr = Some(Box::new(tree));

        let result = in_order_traversal(&tree_ptr);

        let expected: Vec<_> = vec![4, 2, 5, 1, 6, 3, 7].into_iter().collect();
        assert_eq!(result, expected);
    }

    #[test]
    fn test_post_order_traversal() {
        let left_left_tree = BinaryTree::new(TreeNode::new(4), None, None);
        let left_right_tree = BinaryTree::new(TreeNode::new(5), None, None);
        let right_left_tree = BinaryTree::new(TreeNode::new(6), None, None);
        let right_right_tree = BinaryTree::new(TreeNode::new(7), None, None);

        let left_tree = BinaryTree::new(TreeNode::new(2), Some(Box::new(left_left_tree)), Some(Box::new(left_right_tree)));
        let right_tree = BinaryTree::new(TreeNode::new(3), Some(Box::new(right_left_tree)), Some(Box::new(right_right_tree)));

        let tree = BinaryTree::new(TreeNode::new(1), Some(Box::new(left_tree)), Some(Box::new(right_tree)));
        let tree_ptr = Some(Box::new(tree));

        let result = post_order_traversal(&tree_ptr);

        let expected: Vec<_> = vec![4, 5, 2, 6, 7, 3, 1].into_iter().collect();
        assert_eq!(result, expected);
    }

    #[test]
    fn test_level_order_traversal() {
        let left_left_tree = BinaryTree::new(TreeNode::new(4), None, None);
        let left_right_tree = BinaryTree::new(TreeNode::new(5), None, None);
        let right_left_tree = BinaryTree::new(TreeNode::new(6), None, None);
        let right_right_tree = BinaryTree::new(TreeNode::new(7), None, None);

        let left_tree = BinaryTree::new(TreeNode::new(2), Some(Box::new(left_left_tree)), Some(Box::new(left_right_tree)));
        let right_tree = BinaryTree::new(TreeNode::new(3), Some(Box::new(right_left_tree)), Some(Box::new(right_right_tree)));

        let tree = BinaryTree::new(TreeNode::new(1), Some(Box::new(left_tree)), Some(Box::new(right_tree)));
        let tree_ptr = Some(Box::new(tree));

        let result = level_order_traversal(&tree_ptr);

        let expected: Vec<_> = vec![1, 2, 3, 4, 5, 6, 7].into_iter().collect();
        assert_eq!(result, expected);
    }
}
