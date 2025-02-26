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
    ///
    /// # Examples
    /// ```
    /// use dsa::data_structures::graph::Graph;
    ///
    /// let graph: Graph<i32> = Graph::new();
    /// assert!(graph.graph.is_empty());
    /// ```
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
    /// # Examples
    /// ```
    /// use std::rc::Rc;
    /// use dsa::data_structures::graph::Graph;
    /// use dsa::data_structures::tree::TreeNode;
    ///
    /// let node = Rc::new(TreeNode::new(1));
    /// let mut graph = Graph::new();
    /// graph.add_node(Rc::clone(&node));
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
    /// ```
    /// use std::rc::Rc;
    /// use dsa::data_structures::graph::Graph;
    /// use dsa::data_structures::tree::TreeNode;
    ///
    /// let node1 = Rc::new(TreeNode::new(1));
    /// let node2 = Rc::new(TreeNode::new(2));
    /// let mut graph = Graph::new();
    /// graph.add_node(Rc::clone(&node1));
    /// graph.add_node(Rc::clone(&node2));
    /// graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(10));
    ///
    /// graph.remove_node(Rc::clone(&node1));
    /// assert!(!graph.graph.contains_key(&node1));
    /// assert!(graph.graph.contains_key(&node2));
    /// assert!(graph.graph[&node2].is_empty());
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
    /// - `a`: The first `TreeNode` as a reference counting `Rc` pointer
    /// - `b`: The second `TreeNode` as a reference counting `Rc` pointer
    /// - `weight`: An optional weight for the edge.
    ///
    /// # Examples
    /// ```
    /// use std::rc::Rc;
    /// use dsa::data_structures::graph::Graph;
    /// use dsa::data_structures::tree::TreeNode;
    ///
    /// let node1 = Rc::new(TreeNode::new(1));
    /// let node2 = Rc::new(TreeNode::new(2));
    /// let mut graph = Graph::new();
    /// graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(10));
    ///
    /// assert!(graph.graph.contains_key(&node1));
    /// assert!(graph.graph.contains_key(&node2));
    /// assert_eq!(graph.graph[&node1].len(), 1);
    /// assert_eq!(graph.graph[&node2].len(), 1);
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
    /// - `a`: The first `TreeNode` as a reference counting `Rc` pointer.
    /// - `b`: The second `TreeNode` as a reference counting `Rc` pointer.
    ///
    /// # Examples
    /// ```
    /// use std::rc::Rc;
    /// use dsa::data_structures::graph::Graph;
    /// use dsa::data_structures::tree::TreeNode;
    ///
    /// let node1 = Rc::new(TreeNode::new(1));
    /// let node2 = Rc::new(TreeNode::new(2));
    /// let mut graph = Graph::new();
    /// graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(10));
    /// graph.remove_edge(Rc::clone(&node1), Rc::clone(&node2));
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