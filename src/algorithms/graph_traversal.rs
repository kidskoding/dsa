use std::collections::{HashSet, VecDeque};
use std::hash::Hash;

use crate::data_structures::graph::Graph;
use crate::data_structures::tree::TreeNode;

pub fn breadth_first_search<T: Eq + Hash + Clone>(
    graph: &Graph<T>,
    start: TreeNode<T>,
) -> Vec<TreeNode<T>> {
    let mut visited = HashSet::new();
    let mut queue = VecDeque::new();
    let mut result = Vec::new();

    queue.push_back(start.clone());
    visited.insert(start.clone());

    while let Some(node) = queue.pop_front() {
        result.push(node.clone());

        if let Some(neighbors) = graph.graph.get(&node) {
            for (neighbor, _) in neighbors {
                if !visited.contains(neighbor) {
                    queue.push_back(neighbor.clone());
                    visited.insert(neighbor.clone());
                }
            }
        }
    }

    result
}

pub fn depth_first_search<T: Eq + Hash + Clone>(graph: &Graph<T>, start: TreeNode<T>) -> Vec<TreeNode<T>> {
    let mut visited = HashSet::new();
    let mut result = Vec::new();
    depth_first_search_helper(graph, start, &mut visited, &mut result);
    result
}
fn depth_first_search_helper<T: Eq + Hash + Clone>(
    graph: &Graph<T>, 
    node: TreeNode<T>, 
    visited: &mut HashSet<TreeNode<T>>, 
    result: &mut Vec<TreeNode<T>>,
) {
    if visited.contains(&node) {
        return;
    }
    visited.insert(node.clone());
    result.push(node.clone());
    if let Some(neighbors) = graph.graph.get(&node) {
        for (neighbor, _) in neighbors {
            depth_first_search_helper(graph, neighbor.clone(), visited, result);
        }
    }
}

pub fn dijkstra<T: Eq + Hash + Clone>(
    graph: &Graph<T>, 
    start: TreeNode<T>
) -> Vec<(TreeNode<T>, Option<u32>)> {
    
}

pub fn bellman_ford<T: Eq + Hash + Clone>(
    graph: &Graph<T>, 
    start: TreeNode<T>
) -> Vec<(TreeNode<T>, Option<i32>)> {
    
}

#[cfg(test)]
mod tests {
    use std::hash::Hash;
    use crate::algorithms::graph_traversal::{breadth_first_search, depth_first_search};
    use crate::data_structures::graph::Graph;
    use crate::data_structures::tree::TreeNode;

    fn create_graph() -> Graph<String> {
        let mut graph = Graph::new();

        let node_a = TreeNode::new("A".to_string());
        let node_b = TreeNode::new("B".to_string());
        let node_c = TreeNode::new("C".to_string());
        let node_d = TreeNode::new("D".to_string());
        let node_e = TreeNode::new("E".to_string());

        graph.add_node(node_a.clone());
        graph.add_node(node_b.clone());
        graph.add_node(node_c.clone());
        graph.add_node(node_d.clone());
        graph.add_node(node_e.clone());

        graph.add_edge(node_a.clone(), node_b.clone(), None);
        graph.add_edge(node_a.clone(), node_c.clone(), None);
        graph.add_edge(node_b.clone(), node_d.clone(), None);
        graph.add_edge(node_b.clone(), node_e.clone(), None);
    
        graph
    }

    #[test]
    fn test_breadth_first_search() {
        let graph = create_graph();
        let start_node = TreeNode::new("A".to_string());

        let result = breadth_first_search(&graph, start_node.clone());

        let expected = vec![
            TreeNode::new("A".to_string()),
            TreeNode::new("B".to_string()),
            TreeNode::new("C".to_string()),
            TreeNode::new("D".to_string()),
            TreeNode::new("E".to_string()),
        ];
        
        assert_eq!(result, expected);
    }
    
    #[test]
    fn test_depth_first_search() {
        let graph = create_graph();
        let start_node = TreeNode::new(String::from("A"));
        
        let result = depth_first_search(&graph, start_node.clone());

        let expected = vec![
            TreeNode::new("A".to_string()),
            TreeNode::new("B".to_string()),
            TreeNode::new("D".to_string()),
            TreeNode::new("E".to_string()),
            TreeNode::new("C".to_string()),
        ];

        assert_eq!(result, expected);
    }
}
