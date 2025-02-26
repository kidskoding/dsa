use std::collections::HashMap;
use std::hash::Hash;
use std::rc::Rc;
use crate::data_structures::tree::TreeNode;

/// A graph data structure represented as an adjacency list
///
/// This structure represents a `Graph` where each node is a `Rc` reference counted `TreeNode<T>`,
/// and edges are stored as a vector of tuples containing `Rc` reference counted 
/// neighboring nodes and their optional weights
pub struct Graph<T> {
    /// The adjacency list representation of this `Graph`
    /// 
    /// This `HashMap` stores the graph's structure
    /// - The keys are `Rc` reference counted `TreeNode<T>` objects representing the graph's nodes
    /// - The values are vectors of tuples, each representing an edge from the key node:
    ///   - The first element of the tuple is a `Rc` reference counted `TreeNode<T>` representing the neighboring node.
    ///   - The second element of the tuple is an optional `i32` (`Option<i32>`), representing the weight of the edge (if any).
    ///
    /// This design allows the graph to represent both weighted and unweighted graphs.
    pub graph: HashMap<Rc<TreeNode<T>>, Vec<(Rc<TreeNode<T>>, Option<i32>)>>,
}

impl<T: Eq + Hash + Clone> Graph<T> {
    /// Creates a new and empty `Graph`.
    ///
    /// # Returns
    /// - A newly made `Graph` instance
    pub fn new() -> Self {
        Graph {
            graph: HashMap::new(),
        }
    }

    /// Adds a new `node` to this `Graph`.
    ///
    /// If the node already exists, this method does nothing.
    ///
    /// # Parameters
    /// - `node`: The reference counted, `Rc`, `TreeNode` to be added to the graph.
    ///
    pub fn add_node(&mut self, node: Rc<TreeNode<T>>) {
        self.graph.entry(node).or_insert(Vec::new());
    }

    /// Removes a node and all its edges from the `Graph`.
    ///
    /// This method removes the node from the graph and ensures
    /// that any edges connected to it are also removed.
    ///
    /// # Parameters
    /// - `node`: The `TreeNode` to be removed from the graph.
    pub fn remove_node(&mut self, node: Rc<TreeNode<T>>) {
        for (_, neighbors) in &mut self.graph {
            neighbors.retain(|(neighbor, _)| neighbor != &node);
        }
        self.graph.retain(|k, _| k != &node);
    }

    /// Adds an edge between two nodes in the `Graph`.
    ///
    /// If either node does not exist, it is added to the graph automatically.
    /// The edge is added in both directions, making the graph undirected.
    ///
    /// # Parameters
    /// - `a`: The first `TreeNode` as a reference counting `Rc` pointer
    /// - `b`: The second `TreeNode` as a reference counting `Rc` pointer
    /// - `weight`: An optional weight for the edge.
    pub fn add_edge(&mut self, a: Rc<TreeNode<T>>, b: Rc<TreeNode<T>>, weight: Option<i32>) {
        self.graph
            .entry(Rc::clone(&a))
            .or_insert(Vec::new())
            .push((Rc::clone(&b), weight));
        self.graph
            .entry(Rc::clone(&b))
            .or_insert(Vec::new())
            .push((Rc::clone(&a), weight));
    }

    /// Removes an edge between two nodes in the `Graph`.
    ///
    /// If either node does not exist or the edge does not exist,
    /// this method does nothing.
    ///
    /// # Parameters
    /// - `a`: The first `TreeNode` as a reference counting `Rc` pointer.
    /// - `b`: The second `TreeNode` as a reference counting `Rc` pointer.
    pub fn remove_edge(&mut self, a: Rc<TreeNode<T>>, b: Rc<TreeNode<T>>) {
        if let Some(neighbors) = self.graph.get_mut(&a) {
            neighbors.retain(|(neighbor, _)| neighbor != &b);
        }
        if let Some(neighbors) = self.graph.get_mut(&b) {
            neighbors.retain(|(neighbor, _)| neighbor != &a);
        }
    }
}