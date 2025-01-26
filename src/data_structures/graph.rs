use std::collections::HashMap;
use std::hash::Hash;
use crate::data_structures::tree::TreeNode;

pub struct Graph<T> {
    pub graph: HashMap<TreeNode<T>, Vec<(TreeNode<T>, Option<i32>)>>,
}

impl<T: Eq + Hash + Clone> Graph<T> {
    pub fn new() -> Self {
        Graph {
            graph: HashMap::new(),
        }
    }

    pub fn add_node(&mut self, node: TreeNode<T>) {
        self.graph.entry(node).or_insert(Vec::new());
    }

    pub fn remove_node(&mut self, node: TreeNode<T>) {
        for (_, neighbors) in &mut self.graph {
            neighbors.retain(|(neighbor, _)| neighbor != &node);
        }
        self.graph.retain(|k, _| k != &node);
    }

    pub fn add_edge(&mut self, a: TreeNode<T>, b: TreeNode<T>, weight: Option<i32>) {
        self.graph
            .entry(a.clone())
            .or_insert(Vec::new())
            .push((b.clone(), weight));
        self.graph
            .entry(b)
            .or_insert(Vec::new())
            .push((a, weight));
    }

    pub fn remove_edge(&mut self, a: TreeNode<T>, b: TreeNode<T>) {
        if let Some(neighbors) = self.graph.get_mut(&a) {
            neighbors.retain(|(neighbor, _)| neighbor != &b);
        }
        if let Some(neighbors) = self.graph.get_mut(&b) {
            neighbors.retain(|(neighbor, _)| neighbor != &a);
        }
    }
}
