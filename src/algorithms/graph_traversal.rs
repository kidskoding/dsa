use std::collections::{HashSet, VecDeque};
use std::hash::Hash;
use crate::data_structures::graph::Graph;
use crate::data_structures::tree::TreeNode;

pub fn breadth_first_search<T: Eq + Hash + Clone>(graph: &Graph<T>, start: TreeNode<T>) -> Vec<TreeNode<T>> {
    let mut visited = HashSet::new();
    let mut queue = VecDeque::new();
    let mut result = Vec::new();
    queue.push_back(start.clone());
    visited.insert(start);
    while let Some(node) = queue.pop_front() {
        result.push(node.clone());
        if let Some(neighbors) = graph.graph.get(&node.clone()) {
            for neighbor in neighbors {
                if !visited.contains(neighbor) {
                    queue.push_back(neighbor.clone());
                    visited.insert(neighbor.clone());
                }
            }
        }
    }
    result
}

#[cfg(test)]
mod tests {
    use std::hash::Hash;
    use crate::algorithms::graph_traversal::breadth_first_search;
    use crate::data_structures::graph::Graph;
    use crate::data_structures::tree::TreeNode;

    fn create_graph() -> Graph<String> {
        let mut graph = Graph::new();

        let node_a = TreeNode::new(String::from("Joey"));
        let node_b = TreeNode::new(String::from("Dinner"));
        let node_c = TreeNode::new(String::from("Lunch"));

        graph.add_node(node_a.clone());
        graph.add_node(node_b.clone());
        graph.add_node(node_c.clone());

        graph.add_edge(node_a.clone(), node_b.clone());
        graph.add_edge(node_b.clone(), node_c.clone());

        graph
    }

    #[test]
    fn test_breadth_first_search() {
        let graph = create_graph();
        let start_node = TreeNode::new(String::from("Joey"));

        let result = breadth_first_search(&graph, start_node);

        let expected = vec![
            TreeNode::new("Joey".to_string()),
            TreeNode::new("Dinner".to_string()),
            TreeNode::new("Lunch".to_string()),
        ];

        assert_eq!(result, expected);
    }
}
