use std::collections::HashMap;
use std::hash::Hash;
use crate::data_structures::tree::TreeNode;

pub struct Graph<T> {
    pub graph: HashMap<TreeNode<T>, Vec<TreeNode<T>>>,
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
            neighbors.retain(|neighbor| neighbor != &node);
        }
        self.graph.retain(|k, _| k != &node);
    }
    pub fn add_edge(&mut self, a: TreeNode<T>, b: TreeNode<T>) {
        self.graph.entry(a.clone()).or_insert(Vec::new()).push(b.clone());
        self.graph.entry(b).or_insert(Vec::new()).push(a);
    }
    pub fn remove_edge(&mut self, a: TreeNode<T>, b: TreeNode<T>) {
        if let Some(neighbors) = self.graph.get_mut(&a) {
            neighbors.retain(|neighbor| neighbor != &b);
        }
        if let Some(neighbors) = self.graph.get_mut(&b) {
            neighbors.retain(|neighbor| neighbor != &a);
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_graph() {
        let mut graph = Graph::new();

        let node_a = TreeNode::new("Joey");
        let node_b = TreeNode::new("Dinner");
        let node_c = TreeNode::new("Lunch");

        graph.add_node(node_a.clone());
        graph.add_node(node_b.clone());
        graph.add_node(node_c.clone());

        graph.add_edge(node_a.clone(), node_b.clone());
        graph.add_edge(node_b.clone(), node_c.clone());

        assert_eq!(graph.graph[&node_a], vec![node_b.clone()]);
        assert_eq!(graph.graph[&node_b], vec![node_a.clone(), node_c.clone()]);
        assert_eq!(graph.graph[&node_c], vec![node_b.clone()]);

        graph.remove_node(node_b.clone());

        assert_eq!(graph.graph.len(), 2);
        assert!(!graph.graph.contains_key(&node_b));
        assert_eq!(graph.graph[&node_a], vec![]);
        assert_eq!(graph.graph[&node_c], vec![]);
    }
}
