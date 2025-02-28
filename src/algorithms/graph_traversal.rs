use std::cmp::Reverse;
use std::collections::{BinaryHeap, HashMap, HashSet, VecDeque};
use std::hash::Hash;
use std::rc::Rc;
use crate::data_structures::graph::Graph;
use crate::data_structures::graph::GraphNode;

/// Performs a breadth-first search (BFS) on the given graph starting from the `start` node.
///
/// This function explores the graph level by level, visiting each node starting from the `start` node and
/// moving outward to its neighbors. It returns the nodes in the order they were visited.
///
/// # Examples
/// ```
/// use std::rc::Rc;
/// use dsa::data_structures::graph::{Graph, GraphNode};
/// use dsa::algorithms::graph_traversal::breadth_first_search;
///
/// let mut graph = Graph::new();
/// let node1 = Rc::new(GraphNode::new(1));
/// let node2 = Rc::new(GraphNode::new(2));
/// let node3 = Rc::new(GraphNode::new(3));
///
/// graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(1));
/// graph.add_edge(Rc::clone(&node1), Rc::clone(&node3), Some(1));
///
/// let result = breadth_first_search(&graph, Rc::clone(&node1));
/// assert_eq!(result, vec![1, 2, 3]);
/// ```
///
/// # Parameters
/// - `graph`: A reference to the graph in which the search will take place.
/// - `start`: The node from which the search begins.
///
/// # Returns
/// A vector containing the nodes in the order they were visited.
pub fn breadth_first_search<T: Eq + Hash + Clone>(
    graph: &Graph<T>, 
    start: Rc<GraphNode<T>>
) -> Vec<T> {
    let mut visited = HashSet::new();
    let mut queue = VecDeque::new();
    let mut result = Vec::new();

    queue.push_back(Rc::clone(&start));
    visited.insert(Rc::clone(&start));

    while let Some(node) = queue.pop_front() {
        result.push(node.value.clone());
        if let Some(neighbors) = graph.graph.get(&node) {
            for (neighbor, _) in neighbors {
                if !visited.contains(neighbor) {
                    queue.push_back(Rc::clone(neighbor));
                    visited.insert(Rc::clone(neighbor));
                }
            }
        }
    }

    result
}

/// Performs a depth-first search (DFS) on the given graph starting from the `start` node.
///
/// This function explores the graph by going as deep as possible along each branch before backtracking.
/// It returns the nodes in the order they were visited.
///
/// # Examples
///
/// ```
/// use std::rc::Rc;
/// use dsa::algorithms::graph_traversal::depth_first_search;
/// use dsa::data_structures::graph::{Graph, GraphNode};
/// 
/// let mut graph = Graph::new();
/// let node1 = Rc::new(GraphNode::new(1));
/// let node2 = Rc::new(GraphNode::new(2));
/// let node3 = Rc::new(GraphNode::new(3));
///
/// graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(1));
/// graph.add_edge(Rc::clone(&node1), Rc::clone(&node3), Some(1));
///
/// let result = depth_first_search(&graph, Rc::clone(&node1));
/// assert_eq!(result, vec![1, 2, 3]);
/// ```
///
/// # Parameters
/// - `graph`: A reference to the graph in which the search will take place.
/// - `start`: The node from which the search begins.
///
/// # Returns
/// A vector containing the values of the nodes in the order they were visited.
pub fn depth_first_search<T: Eq + Hash + Clone>(
    graph: &Graph<T>, 
    start: Rc<GraphNode<T>>
) -> Vec<T> {
    let mut visited = HashSet::new();
    let mut result = Vec::new();
    depth_first_search_helper(graph, start, &mut visited, &mut result);
    result
}

/// Helper function for depth-first search (DFS) that recursively visits nodes in the graph.
///
/// This function is used internally in `depth_first_search` to recursively traverse the graph.
///
/// # Parameters
/// - `graph`: A reference to the graph in which the search will take place.
/// - `node`: The current node being visited.
/// - `visited`: A mutable set tracking the visited nodes.
/// - `result`: A mutable vector to store the nodes in the order they were visited.
fn depth_first_search_helper<'a, T: Eq + Hash + Clone>(
    graph: &'a Graph<T>, 
    node: Rc<GraphNode<T>>,
    visited: &mut HashSet<Rc<GraphNode<T>>>, 
    result: &mut Vec<T>,
) {
    if visited.contains(&node) {
        return;
    }
    visited.insert(Rc::clone(&node));
    result.push(node.value.clone());
    if let Some(neighbors) = graph.graph.get(&node) {
        for(neighbor, _) in neighbors {
            depth_first_search_helper(graph, Rc::clone(neighbor), visited, result);
        }
    }
}

/// Performs Dijkstra's algorithm to find the shortest path from the `start` node to all other nodes in the graph.
///
/// This function computes the shortest distance from the start node to every other node in the graph and returns
/// a map of nodes to their corresponding shortest distances.
///
/// # Examples
///
/// ```
/// use std::collections::HashMap;
/// use std::rc::Rc;
/// use dsa::algorithms::graph_traversal::dijkstra;
/// use dsa::data_structures::graph::{Graph, GraphNode};
///
/// let mut graph = Graph::new();
/// let node1 = Rc::new(GraphNode::new(1));
/// let node2 = Rc::new(GraphNode::new(2));
/// let node3 = Rc::new(GraphNode::new(3));
///
/// graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(5));
/// graph.add_edge(Rc::clone(&node2), Rc::clone(&node3), Some(10));
///
/// let result = dijkstra(&graph, Rc::clone(&node1));
///
/// let expected = {
///     let mut map = HashMap::new();
///     map.insert(Rc::clone(&node1), 0);
///     map.insert(Rc::clone(&node2), 5);
///     map.insert(Rc::clone(&node3), 15);
///     map
/// };
///
/// assert_eq!(result, expected);
/// ```
///
/// # Parameters
/// - `graph`: A reference to the graph on which Dijkstra's algorithm is to be run.
/// - `start`: The node from which the shortest paths are calculated.
///
/// # Returns
/// A map of nodes to their shortest distances from the `start` node.
pub fn dijkstra<T: Eq + Hash + Clone + Ord>(
    graph: &Graph<T>,
    start: Rc<GraphNode<T>>
) -> HashMap<Rc<GraphNode<T>>, u32> {
    let mut distances = HashMap::new();
    let mut priority_queue = BinaryHeap::new();
    
    distances.insert(Rc::clone(&start), 0);
    priority_queue.push(Reverse((0, Rc::clone(&start))));
    
    while let Some(Reverse((current_distance, current_node))) = priority_queue.pop() {
        if current_distance < *distances.get(&current_node).unwrap_or(&u32::MAX) {
            continue;
        }
        
        if let Some(neighbors) = graph.graph.get(&*current_node) {
            for (neighbor, weight) in neighbors {
                if let Some(weight) = weight {
                    let new_distance = current_distance + *weight as u32;
                    if new_distance < *distances.get(neighbor).unwrap_or(&u32::MAX) {
                        distances.insert(neighbor.clone(), new_distance);
                        priority_queue.push(Reverse((new_distance, neighbor.clone())));
                    }
                }
            }
        }
    }

    distances
}

/// Performs the Bellman-Ford algorithm to find the shortest paths from the `start` node to all other nodes in the graph,
/// even when there are negative edge weights.
///
/// This function computes the shortest distance from the start node to every other node and checks for negative weight cycles.
///
/// # Examples
///
/// ```
/// use std::collections::HashMap;
/// use std::rc::Rc;
/// use dsa::data_structures::graph::{Graph, GraphNode};
/// use dsa::algorithms::graph_traversal::bellman_ford;
///
/// let mut graph = Graph::new();
/// let node1 = Rc::new(GraphNode::new(1));
/// let node2 = Rc::new(GraphNode::new(2));
/// let node3 = Rc::new(GraphNode::new(3));
///
/// graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(5));
/// graph.add_edge(Rc::clone(&node2), Rc::clone(&node3), Some(10));
///
/// let result = bellman_ford(&graph, Rc::clone(&node1));
///
/// let expected = {
///     let mut map = HashMap::new();
///     map.insert(Rc::clone(&node1), 0);
///     map.insert(Rc::clone(&node2), 5);
///     map.insert(Rc::clone(&node3), 15);
///     Ok(map)
/// };
///
/// assert_eq!(result, expected);
/// ```
///
/// # Parameters
/// - `graph`: A reference to the graph on which Bellman-Ford algorithm is to be run.
/// - `start`: The node from which the shortest paths are calculated.
///
/// # Returns
/// A `Result` containing a map of nodes to their shortest distances, or an error if a negative weight cycle is detected.
pub fn bellman_ford<T: Eq + Hash + Clone + Ord>(
    graph: &Graph<T>,
    start: Rc<GraphNode<T>>
) -> Result<HashMap<Rc<GraphNode<T>>, i32>, String> {
    let mut distances = HashMap::new();
    distances.insert(Rc::clone(&start), 0);
    let num_vertices: i32 = graph.graph.len() as i32;

    for _ in 0..num_vertices - 1 {
        let mut updates = Vec::new();
        for (node, neighbors) in &graph.graph {
            if let Some(current_distance) = distances.get(node) {
                for (neighbor, weight) in neighbors {
                    let new_distance = current_distance + weight.unwrap();
                    updates.push((neighbor, new_distance));
                }
            }
        }
        for (neighbor, new_distance) in updates {
            let existing_distance = distances.entry(Rc::clone(neighbor)).or_insert(i32::MAX);
            if new_distance < *existing_distance {
                *existing_distance = new_distance;
            }
        }
    }

    for (node, neighbors) in &graph.graph {
        if let Some(&current_distance) = distances.get(node) {
            for (neighbor, weight) in neighbors {
                let new_distance = current_distance + weight.unwrap();
                if let Some(existing_distance) = distances.get(neighbor) {
                    if new_distance < *existing_distance {
                        return Err("Graph contains a negative weight cycle! \
                            Bellman-Ford will not be accurate for this graph".to_string());
                    }
                }
            }
        }
    }

    Ok(distances)
}