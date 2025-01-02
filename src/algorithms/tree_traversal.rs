use std::collections::HashSet;
use std::hash::Hash;
use crate::data_structures::tree::{BinaryTree};

pub fn pre_order_traversal<T: Clone + Hash + Eq>(tree: &Option<Box<BinaryTree<T>>>) -> HashSet<T> {
    let mut visited: HashSet<T> = HashSet::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.insert(tree.node.value.clone());
        visited.extend(pre_order_traversal(&tree.left));
        visited.extend(pre_order_traversal(&tree.right));
    }
    visited
}

pub fn in_order_traversal<T: Clone + Hash + Eq>(tree: &Option<Box<BinaryTree<T>>>) -> HashSet<T> {
    let mut visited: HashSet<T> = HashSet::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.extend(in_order_traversal(&tree.left));
        visited.insert(tree.node.value.clone());
        visited.extend(in_order_traversal(&tree.right));
    }
    visited
}

pub fn post_order_traversal<T: Clone + Hash + Eq>(tree: &Option<Box<BinaryTree<T>>>) -> HashSet<T> {
    let mut visited: HashSet<T> = HashSet::new();
    if let Some(boxed_tree) = tree {
        let tree = &*boxed_tree;
        visited.extend(post_order_traversal(&tree.left));
        visited.extend(post_order_traversal(&tree.right));
        visited.insert(tree.node.value.clone());
    }
    visited
}

#[cfg(test)]
mod tests {
    use std::collections::HashSet;
    use crate::data_structures::tree::{BinaryTree, TreeNode};
    use crate::algorithms::tree_traversal::{post_order_traversal, pre_order_traversal, in_order_traversal};

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

        let expected: HashSet<_> = vec![1, 2, 3, 4, 5, 6, 7].into_iter().collect();
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

        let expected: HashSet<_> = vec![1, 2, 3, 4, 5, 6, 7].into_iter().collect();
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

        let expected: HashSet<_> = vec![1, 2, 3, 4, 5, 6, 7].into_iter().collect();
        assert_eq!(result, expected);
    }
}
