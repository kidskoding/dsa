#[cfg(test)]
mod graph_test {
    use std::rc::Rc;
    use dsa::data_structures::graph::{Graph, GraphNode};

    #[test]
    fn test_weighted_graph() {
        let mut graph = Graph::new();

        let node_a = Rc::new(GraphNode::new("Joey"));
        let node_b = Rc::new(GraphNode::new("Dinner"));
        let node_c = Rc::new(GraphNode::new("Lunch"));

        graph.add_node(Rc::clone(&node_a));
        graph.add_node(Rc::clone(&node_b));
        graph.add_node(Rc::clone(&node_c));

        graph.add_edge(Rc::clone(&node_a), Rc::clone(&node_b), Some(5));
        graph.add_edge(Rc::clone(&node_b), Rc::clone(&node_c), None);

        assert_eq!(graph.graph[&node_a], vec![(Rc::clone(&node_b), Some(5))]);
        assert_eq!(
            graph.graph[&node_b],
            vec![(Rc::clone(&node_a), Some(5)), (Rc::clone(&node_c), None)]
        );
        assert_eq!(graph.graph[&node_c], vec![(node_b.clone(), None)]);

        graph.remove_edge(Rc::clone(&node_a), Rc::clone(&node_b));

        assert_eq!(graph.graph[&node_a], vec![]);
        assert_eq!(graph.graph[&node_b], vec![(Rc::clone(&node_c), None)]);
        assert_eq!(graph.graph[&node_c], vec![(Rc::clone(&node_b), None)]);

        graph.remove_node(Rc::clone(&node_b));

        assert_eq!(graph.graph.len(), 2);
        assert!(!graph.graph.contains_key(&node_b));
        assert_eq!(graph.graph[&node_a], vec![]);
        assert_eq!(graph.graph[&node_c], vec![]);
    }
}