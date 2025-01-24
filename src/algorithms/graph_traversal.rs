use std::cmp::Reverse;
use std::collections::{BinaryHeap, HashMap, HashSet, VecDeque};
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

pub fn dijkstra<T: Eq + Hash + Clone + Ord>(
    graph: &Graph<T>,
    start: TreeNode<T>
) -> HashMap<TreeNode<T>, u32> {
    let mut distances = HashMap::new();
    let mut priority_queue = BinaryHeap::new();
    
    distances.insert(start.clone(), 0);
    priority_queue.push(Reverse((0, start.clone())));
    
    while let Some(Reverse((current_distance, current_node))) = priority_queue.pop() {
        if current_distance < *distances.get(&current_node).unwrap_or(&u32::MAX) {
            continue;
        }
        
        if let Some(neighbors) = graph.graph.get(&current_node) {
            for (neighbor, weight) in neighbors {
                if let Some(weight) = weight {
                    let new_distance = current_distance + *weight as u32;
                    if new_distance < *distances.get(&neighbor).unwrap_or(&u32::MAX) {
                        distances.insert(neighbor.clone(), new_distance);
                        priority_queue.push(Reverse((new_distance, neighbor.clone())));
                    }
                }
            }
        }
    }

    distances
}

pub fn bellman_ford<T: Eq + Hash + Clone + Ord>(
    graph: &Graph<T>,
    start: TreeNode<T>
) -> Result<HashMap<TreeNode<T>, i32>, &str> {
    let mut distances = HashMap::new();
    distances.insert(start.clone(), 0);
    let num_vertices: i32 = graph.graph.len() as i32;

    for _ in 0..num_vertices - 1 {
        for (node, neighbors) in &graph.graph {
            if let Some(&current_distance) = distances.get(&node) {
                for (neighbor, weight) in neighbors {
                    let new_distance = current_distance + weight.unwrap();
                    let existing_distance = distances.entry(neighbor.clone()).or_insert(i32::MAX);
                    if new_distance < *existing_distance {
                        *existing_distance = new_distance;
                    }
                }
            }
        }
    }

    for (node, neighbors) in &graph.graph {
        if let Some(&current_distance) = distances.get(&node) {
            for (neighbor, weight) in neighbors {
                let new_distance = current_distance + weight.unwrap();
                if let Some(existing_distance) = distances.get(neighbor) {
                    if new_distance < *existing_distance {
                        return Err("Graph contains a negative weight cycle! \
                            Bellman-Ford will not be accurate for this graph");
                    }
                }
            }
        }
    }

    Ok(distances)
} 

#[cfg(test)]
mod tests {
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
    
    mod dijkstra_tests {
        use std::collections::HashMap;
        use crate::algorithms::graph_traversal::dijkstra;
        use crate::data_structures::graph::Graph;
        use crate::data_structures::tree::TreeNode;

        fn create_node<T>(value: T) -> TreeNode<T> {
            TreeNode { value }
        }

        #[test]
        fn test_single_node_graph() {
            let graph = Graph::new();
            let start = create_node(1);

            let result = dijkstra(&graph, start);
            let expected = {
                let mut map = HashMap::new();
                map.insert(create_node(1), 0 as u32);
                map
            };
            
            assert_eq!(result, expected);
        }

        #[test]
        fn test_simple_graph() {
            let mut graph = Graph::new();
            let node1 = create_node(1);
            let node2 = create_node(2);
            let node3 = create_node(3);

            graph.add_edge(node1.clone(), node2.clone(), Some(5));
            graph.add_edge(node2.clone(), node3.clone(), Some(10));

            let result = dijkstra(&graph, node1.clone());

            let expected = {
                let mut map = HashMap::new();
                map.insert(node1.clone(), 0);
                map.insert(node2.clone(), 5);
                map.insert(node3.clone(), 15);
                map
            };

            assert_eq!(result, expected);
        }
        #[test]
        fn test_graph_with_multiple_paths() {
            let mut graph = Graph::new();
            let node1 = create_node(1);
            let node2 = create_node(2);
            let node3 = create_node(3);
            let node4 = create_node(4);

            graph.add_edge(node1.clone(), node2.clone(), Some(1));
            graph.add_edge(node1.clone(), node3.clone(), Some(4));
            graph.add_edge(node2.clone(), node3.clone(), Some(2));
            graph.add_edge(node2.clone(), node4.clone(), Some(5));
            graph.add_edge(node3.clone(), node4.clone(), Some(1));

            let result = dijkstra(&graph, node1.clone());
            let expected = {
                let mut map = HashMap::new();
                map.insert(node1.clone(), 0);
                map.insert(node2.clone(), 1);
                map.insert(node3.clone(), 3);
                map.insert(node4.clone(), 4);
                map
            };
            
            assert_eq!(result, expected);
        } 
    }
    mod bellman_ford_tests {
        use std::collections::HashMap;
        
        use crate::algorithms::graph_traversal::bellman_ford;
        use crate::data_structures::graph::Graph;
        use crate::data_structures::tree::TreeNode;

        fn create_node<T>(value: T) -> TreeNode<T> {
            TreeNode { value }
        }

        #[test]
        fn test_single_node_graph() {
            let graph = Graph::new();
            let start = create_node(1);

            let result = bellman_ford(&graph, start);
            let expected = {
                let mut map = HashMap::new();
                map.insert(create_node(1), 0);
                Ok(map)
            };

            assert_eq!(result, expected);
        }

        #[test]
        fn test_simple_graph() {
            let mut graph = Graph::new();
            let node1 = create_node(1);
            let node2 = create_node(2);
            let node3 = create_node(3);

            graph.add_edge(node1.clone(), node2.clone(), Some(5));
            graph.add_edge(node2.clone(), node3.clone(), Some(10));

            let result = bellman_ford(&graph, node1.clone());

            let expected = {
                let mut map = HashMap::new();
                map.insert(node1.clone(), 0);
                map.insert(node2.clone(), 5);
                map.insert(node3.clone(), 15);
                Ok(map)
            };

            assert_eq!(result, expected);
        }

        #[test]
        fn test_graph_with_negative_weights() {
            let mut graph = Graph::new();
            let node1 = create_node(1);
            let node2 = create_node(2);
            let node3 = create_node(3);
            let node4 = create_node(4);

            graph.add_edge(node1.clone(), node2.clone(), Some(1));
            graph.add_edge(node1.clone(), node3.clone(), Some(4));
            graph.add_edge(node2.clone(), node3.clone(), Some(-2));
            graph.add_edge(node2.clone(), node4.clone(), Some(-5));
            graph.add_edge(node3.clone(), node4.clone(), Some(1));

            let result = bellman_ford(&graph, node1.clone());

            assert!(result.is_err(), "Expected negative cycle error, got {:?}", result);
        }
        
        #[test]
        fn test_negative_cycle() {
            let mut graph = Graph::new();
            let node1 = create_node(1);
            let node2 = create_node(2);
            let node3 = create_node(3);
            let node4 = create_node(4);

            graph.add_edge(node1.clone(), node2.clone(), Some(1));
            graph.add_edge(node1.clone(), node3.clone(), Some(4));
            graph.add_edge(node2.clone(), node3.clone(), Some(2));
            graph.add_edge(node2.clone(), node4.clone(), Some(5));
            graph.add_edge(node3.clone(), node4.clone(), Some(1));

            graph.add_edge(node4.clone(), node2.clone(), Some(-10)); 

            let result = bellman_ford(&graph, node1.clone());

            assert!(result.is_err(), "Expected negative cycle error, got {:?}", result);
        }

        #[test]
        fn test_disconnected_graph() {
            let mut graph = Graph::new();
            let node1 = create_node(1);
            let node2 = create_node(2);
            let node3 = create_node(3);

            graph.add_edge(node1.clone(), node2.clone(), Some(5));

            let result = bellman_ford(&graph, node1.clone());
            let expected = {
                let mut map = HashMap::new();
                map.insert(node1.clone(), 0);
                map.insert(node2.clone(), 5);
                map
            };

            assert_eq!(result.clone().unwrap(), expected);
            assert!(result.clone().unwrap().get(&node3).is_none()); 
        }

        #[test]
        fn test_graph_with_self_loops() {
            let mut graph = Graph::new();
            let node1 = create_node(1);
            let node2 = create_node(2);

            graph.add_edge(node1.clone(), node2.clone(), Some(1));
            graph.add_edge(node2.clone(), node2.clone(), Some(0)); 

            let result = bellman_ford(&graph, node1.clone());
            let expected = {
                let mut map = HashMap::new();
                map.insert(node1.clone(), 0);
                map.insert(node2.clone(), 1);
                map
            };

            assert_eq!(result.unwrap(), expected);
        }
    }
}
