use std::collections::HashMap;
use std::hash::Hash;
use std::rc::Rc;
use crate::data_structures::tree::TreeNode;

/// A graph data structure represented as an adjacency list
///
/// This structure represents a `Graph` where each node is of type `TreeNode<T>`,
/// and edges are stored as a vector of tuples containing the neighboring nodes
/// and their optional weights
pub struct Graph<T> {
    /// The adjacency list representation of the graph. This `HashMap` stores the graph's structure, where
    /// - The keys are `TreeNode<T>` objects representing the graph's nodes.
    /// - The values are vectors of tuples, each representing an edge from the key node:
    ///   - The first element of the tuple is a `TreeNode<T>` representing the neighboring node.
    ///   - The second element of the tuple is an optional `i32` (`Option<i32>`), representing the weight of the edge (if any).
    ///
    /// This design allows the graph to represent both weighted and unweighted graphs.
    pub graph: HashMap<Rc<TreeNode<T>>, Vec<(Rc<TreeNode<T>>, Option<i32>)>>,
}

impl<T: Eq + Hash + Clone> Graph<T> {
    /// Creates a new and empty `Graph`.
    ///
    /// # Examples
    ///
    /// ```
    /// let graph: Graph<i32> = Graph::new();
    /// assert!(graph.graph.is_empty());
    /// ```
    pub fn new() -> Self {
        Graph {
            graph: HashMap::new(),
        }
    }

    /// Adds a new node to the `Graph`.
    ///
    /// If the node already exists, this method does nothing.
    ///
    /// # Parameters
    /// - `node`: The `TreeNode` to be added to the graph.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut graph = Graph::new();
    /// let node = TreeNode::new(1);
    /// 
    /// graph.add_node(node.clone());
    /// 
    /// assert!(graph.graph.contains_key(&node));
    /// ```
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
    ///
    /// # Examples
    ///
    /// ```
    /// let mut graph = Graph::new();
    /// let node = TreeNode::new(1);
    /// 
    /// graph.add_node(node.clone());
    /// graph.remove_node(node.clone());
    /// 
    /// assert!(!graph.graph.contains_key(&node));
    /// ```
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
    /// - `a`: The first `TreeNode`.
    /// - `b`: The second `TreeNode`.
    /// - `weight`: An optional weight for the edge.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut graph = Graph::new();
    /// let node1 = TreeNode::new(1);
    /// let node2 = TreeNode::new(2);
    /// 
    /// graph.add_edge(node1.clone(), node2.clone(), Some(5));
    /// 
    /// assert_eq!(graph.graph[&node1][0], (node2.clone(), Some(5)));
    /// assert_eq!(graph.graph[&node2][0], (node1.clone(), Some(5)));
    /// ```
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
    /// - `a`: The first `TreeNode`.
    /// - `b`: The second `TreeNode`.
    ///
    /// # Examples
    ///
    /// ```
    /// let mut graph = Graph::new();
    /// 
    /// let node1 = TreeNode::new(1);
    /// let node2 = TreeNode::new(2);
    /// 
    /// graph.add_edge(node1.clone(), node2.clone(), Some(5));
    /// graph.remove_edge(node1.clone(), node2.clone());
    /// 
    /// assert!(graph.graph[&node1].is_empty());
    /// assert!(graph.graph[&node2].is_empty());
    /// ```
    pub fn remove_edge(&mut self, a: Rc<TreeNode<T>>, b: Rc<TreeNode<T>>) {
        if let Some(neighbors) = self.graph.get_mut(&a) {
            neighbors.retain(|(neighbor, _)| neighbor != &b);
        }
        if let Some(neighbors) = self.graph.get_mut(&b) {
            neighbors.retain(|(neighbor, _)| neighbor != &a);
        }
    }
}