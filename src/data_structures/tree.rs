use std::cmp::Ordering;

#[derive(Eq, Hash, PartialEq, Clone, Debug)]
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
impl<T: Ord> PartialOrd for TreeNode<T> {
    fn partial_cmp(&self, other: &Self) -> Option<Ordering> {
        self.value.partial_cmp(&other.value)
    }
}
impl<T: Ord> Ord for TreeNode<T> {
    fn cmp(&self, other: &Self) -> Ordering {
        self.value.cmp(&other.value)
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
