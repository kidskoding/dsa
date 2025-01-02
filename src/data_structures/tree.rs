pub struct TreeNode<T> {
    pub value: T,
}
impl<T> TreeNode<T> {
    pub fn new(value: T) -> Self {
        TreeNode {
            value,
        }
    }
}

pub struct BinaryTree<T> {
    pub node: TreeNode<T>,
    pub left: Option<Box<BinaryTree<T>>>,
    pub right: Option<Box<BinaryTree<T>>>,
}
impl<T> BinaryTree<T> {
    pub fn new(node: TreeNode<T>, left: Option<Box<BinaryTree<T>>>, 
               right: Option<Box<BinaryTree<T>>>) -> Self {
        BinaryTree::<T> {
            node,
            left,
            right
        }
    }
}

#[cfg(test)]
mod tests {
    use crate::data_structures::tree::TreeNode;
    use crate::data_structures::tree::BinaryTree;

    #[test]
    fn test_tree_node_creation() {
        let node = TreeNode::new(5);
        assert_eq!(node.value, 5);
    }

    #[test]
    fn test_binary_tree_creation() {
        let left_node = TreeNode::new(2);
        let right_node = TreeNode::new(3);
        let root_node = TreeNode::new(1);

        let left_tree = BinaryTree::new(left_node, None, None);
        let right_tree = BinaryTree::new(right_node, None, None);
        let tree = BinaryTree::new(root_node, Some(Box::new(left_tree)), Some(Box::new(right_tree)));

        assert_eq!(tree.node.value, 1);
        assert_eq!(tree.left.as_ref().unwrap().node.value, 2);
        assert_eq!(tree.right.as_ref().unwrap().node.value, 3);
    }

    #[test]
    fn test_tree_left() {
        let root_node = TreeNode::new(1);
        let mut tree = BinaryTree::new(root_node, None, None);

        let left_node = TreeNode::new(2);
        let left_tree = BinaryTree::new(left_node, None, None);
        tree.left = Some(Box::new(left_tree));

        assert_eq!(tree.left.as_ref().unwrap().node.value, 2);
    }

    #[test]
    fn test_tree_right() {
        let root_node = TreeNode::new(1);
        let mut tree = BinaryTree::new(root_node, None, None);

        let right_node = TreeNode::new(3);
        let right_tree = BinaryTree::new(right_node, None, None);
        tree.right = Some(Box::new(right_tree));

        assert_eq!(tree.right.as_ref().unwrap().node.value, 3);
    }
}
