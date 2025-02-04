#[cfg(test)]
mod graph_traversal_test {
    use std::rc::Rc;
    use crate::algorithms::graph_traversal::{breadth_first_search, depth_first_search};
    use crate::data_structures::graph::Graph;
    use crate::data_structures::tree::TreeNode;

    fn create_graph() -> Graph<String> {
        let mut graph = Graph::new();

        let node_a = Rc::new(TreeNode::new("A".to_string()));
        let node_b = Rc::new(TreeNode::new("B".to_string()));
        let node_c = Rc::new(TreeNode::new("C".to_string()));
        let node_d = Rc::new(TreeNode::new("D".to_string()));
        let node_e = Rc::new(TreeNode::new("E".to_string()));

        graph.add_node(Rc::clone(&node_a));
        graph.add_node(Rc::clone(&node_b));
        graph.add_node(Rc::clone(&node_c));
        graph.add_node(Rc::clone(&node_d));
        graph.add_node(Rc::clone(&node_e));

        graph.add_edge(Rc::clone(&node_a), Rc::clone(&node_b), None);
        graph.add_edge(Rc::clone(&node_a), Rc::clone(&node_c), None);
        graph.add_edge(Rc::clone(&node_b), Rc::clone(&node_d), None);
        graph.add_edge(Rc::clone(&node_b), Rc::clone(&node_e), None);

        graph
    }

    #[test]
    fn test_breadth_first_search() {
        let graph = create_graph();
        let start_node = Rc::new(TreeNode::new("A".to_string()));

        let result = breadth_first_search(&graph, start_node);

        let expected = vec![
            "A",
            "B",
            "C",
            "D",
            "E",
        ];

        assert_eq!(result, expected);
    }

    #[test]
    fn test_depth_first_search() {
        let graph = create_graph();
        let start_node = Rc::new(TreeNode::new(String::from("A")));

        let result = depth_first_search(&graph, start_node);

        let expected = vec![
            "A",
            "B",
            "D",
            "E",
            "C",
        ];

        assert_eq!(result, expected);
    }

    mod dijkstra_tests {
        use std::collections::HashMap;
        use std::rc::Rc;
        use crate::algorithms::graph_traversal::dijkstra;
        use crate::data_structures::graph::Graph;
        use crate::data_structures::tree::TreeNode;

        fn create_node<T>(value: T) -> TreeNode<T> {
            TreeNode { value }
        }

        #[test]
        fn test_single_node_graph() {
            let graph = Graph::new();
            let start = Rc::new(create_node(1));

            let result = dijkstra(&graph, start);
            let expected = {
                let mut map = HashMap::new();
                map.insert(Rc::new(create_node(1)), 0 as u32);
                map
            };

            assert_eq!(result, expected);
        }

        #[test]
        fn test_simple_graph() {
            let mut graph = Graph::new();
            let node1 = Rc::new(create_node(1));
            let node2 = Rc::new(create_node(2));
            let node3 = Rc::new(create_node(3));

            graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(5));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node3), Some(10));

            let result = dijkstra(&graph, Rc::clone(&node1));

            let expected = {
                let mut map = HashMap::new();
                map.insert(Rc::clone(&node1), 0);
                map.insert(Rc::clone(&node2), 5);
                map.insert(Rc::clone(&node3), 15);
                map
            };

            assert_eq!(result, expected);
        }
        #[test]
        fn test_graph_with_multiple_paths() {
            let mut graph = Graph::new();
            let node1 = Rc::new(create_node(1));
            let node2 = Rc::new(create_node(2));
            let node3 = Rc::new(create_node(3));
            let node4 = Rc::new(create_node(4));

            graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(1));
            graph.add_edge(Rc::clone(&node1), Rc::clone(&node3), Some(4));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node3), Some(2));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node4), Some(5));
            graph.add_edge(Rc::clone(&node3), Rc::clone(&node4), Some(1));

            let result = dijkstra(&graph, node1.clone());
            let expected = {
                let mut map = HashMap::new();
                map.insert(Rc::clone(&node1), 0);
                map.insert(Rc::clone(&node2), 1);
                map.insert(Rc::clone(&node3), 3);
                map.insert(Rc::clone(&node4), 4);
                map
            };

            assert_eq!(result, expected);
        }
    }
    mod bellman_ford_tests {
        use std::collections::HashMap;
        use std::rc::Rc;
        use crate::algorithms::graph_traversal::bellman_ford;
        use crate::data_structures::graph::Graph;
        use crate::data_structures::tree::TreeNode;

        fn create_node<T>(value: T) -> TreeNode<T> {
            TreeNode { value }
        }

        #[test]
        fn test_single_node_graph() {
            let graph = Graph::new();
            let start = Rc::new(create_node(1));

            let result = bellman_ford(&graph, start);
            let expected = {
                let mut map = HashMap::new();
                map.insert(Rc::new(create_node(1)), 0);
                Ok(map)
            };

            assert_eq!(result, expected);
        }

        #[test]
        fn test_simple_graph() {
            let mut graph = Graph::new();
            let node1 = Rc::new(create_node(1));
            let node2 = Rc::new(create_node(2));
            let node3 = Rc::new(create_node(3));

            graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(5));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node3), Some(10));

            let result = bellman_ford(&graph, Rc::clone(&node1));

            let expected = {
                let mut map = HashMap::new();
                map.insert(Rc::clone(&node1), 0);
                map.insert(Rc::clone(&node2), 5);
                map.insert(Rc::clone(&node3), 15);
                Ok(map)
            };

            assert_eq!(result, expected);
        }

        #[test]
        fn test_graph_with_negative_weights() {
            let mut graph = Graph::new();
            let node1 = Rc::new(create_node(1));
            let node2 = Rc::new(create_node(2));
            let node3 = Rc::new(create_node(3));
            let node4 = Rc::new(create_node(4));

            graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(1));
            graph.add_edge(Rc::clone(&node1), Rc::clone(&node3), Some(4));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node3), Some(-2));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node4), Some(-5));
            graph.add_edge(Rc::clone(&node3), Rc::clone(&node4), Some(1));

            let result = bellman_ford(&graph, Rc::clone(&node1));

            assert!(result.is_err(), "Expected negative cycle error, got {:?}", result);
        }

        #[test]
        fn test_negative_cycle() {
            let mut graph = Graph::new();
            let node1 = Rc::new(create_node(1));
            let node2 = Rc::new(create_node(2));
            let node3 = Rc::new(create_node(3));
            let node4 = Rc::new(create_node(4));

            graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(1));
            graph.add_edge(Rc::clone(&node1), Rc::clone(&node3), Some(4));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node3), Some(2));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node4), Some(5));
            graph.add_edge(Rc::clone(&node3), Rc::clone(&node4), Some(1));

            graph.add_edge(node4.clone(), node2.clone(), Some(-10));

            let result = bellman_ford(&graph, Rc::clone(&node1));

            assert!(result.is_err(), "Expected negative cycle error, got {:?}", result);
        }

        #[test]
        fn test_disconnected_graph() {
            let mut graph = Graph::new();
            let node1 = Rc::new(create_node(1));
            let node2 = Rc::new(create_node(2));
            let node3 = Rc::new(create_node(3));

            graph.add_edge(node1.clone(), node2.clone(), Some(5));

            let result = bellman_ford(&graph, Rc::clone(&node1));
            let expected = {
                let mut map = HashMap::new();
                map.insert(Rc::clone(&node1), 0);
                map.insert(Rc::clone(&node2), 5);
                Ok(map)
            };

            assert_eq!(result, expected);
            assert!(result.unwrap().get(&node3).is_none());
        }

        #[test]
        fn test_graph_with_self_loops() {
            let mut graph = Graph::new();
            let node1 = Rc::new(create_node(1));
            let node2 = Rc::new(create_node(2));

            graph.add_edge(Rc::clone(&node1), Rc::clone(&node2), Some(1));
            graph.add_edge(Rc::clone(&node2), Rc::clone(&node2), Some(0));

            let result = bellman_ford(&graph, Rc::clone(&node1));
            let expected = {
                let mut map = HashMap::new();
                map.insert(Rc::clone(&node1), 0);
                map.insert(Rc::clone(&node2), 1);
                Ok(map)
            };

            assert_eq!(result, expected);
        }
    }
}