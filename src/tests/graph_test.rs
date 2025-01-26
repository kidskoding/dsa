#[cfg(test)]
mod graph_test {
    use crate::data_structures::graph::Graph;
    use crate::data_structures::tree::TreeNode;

    #[test]
    fn test_weighted_graph() {
        let mut graph = Graph::new();

        let node_a = TreeNode::new("Joey");
        let node_b = TreeNode::new("Dinner");
        let node_c = TreeNode::new("Lunch");

        graph.add_node(node_a.clone());
        graph.add_node(node_b.clone());
        graph.add_node(node_c.clone());

        graph.add_edge(node_a.clone(), node_b.clone(), Some(5));
        graph.add_edge(node_b.clone(), node_c.clone(), None);

        assert_eq!(graph.graph[&node_a], vec![(node_b.clone(), Some(5))]);
        assert_eq!(
            graph.graph[&node_b],
            vec![(node_a.clone(), Some(5)), (node_c.clone(), None)]
        );
        assert_eq!(graph.graph[&node_c], vec![(node_b.clone(), None)]);

        graph.remove_edge(node_a.clone(), node_b.clone());

        assert_eq!(graph.graph[&node_a], vec![]);
        assert_eq!(graph.graph[&node_b], vec![(node_c.clone(), None)]);
        assert_eq!(graph.graph[&node_c], vec![(node_b.clone(), None)]);

        graph.remove_node(node_b.clone());

        assert_eq!(graph.graph.len(), 2);
        assert!(!graph.graph.contains_key(&node_b));
        assert_eq!(graph.graph[&node_a], vec![]);
        assert_eq!(graph.graph[&node_c], vec![]);
    }
}
