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
