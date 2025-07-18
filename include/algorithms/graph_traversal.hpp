#ifndef GRAPH_TRAVERSAL_HPP
#define GRAPH_TRAVERSAL_HPP

#include <set>
#include <stack>
#include <vector>
#include <map>
#include <deque>
#include <queue>
#include <limits>
#include <memory>
#include <stdexcept>
#include "data_structures/graph.hpp"

template <typename T>
std::vector<T> breadthFirstSearch(Graph<T>& graph, std::shared_ptr<GraphNode<T>> start) {
    std::set<std::shared_ptr<GraphNode<T>>> visited;
    std::deque<std::shared_ptr<GraphNode<T>>> queue;
    std::vector<T> result;

    queue.push_back(start);
    visited.insert(start);

    while(!queue.empty()) {
        std::shared_ptr<GraphNode<T>> current = queue.front();
        queue.pop_front();
        result.push_back(current->value);

        for(const auto& [neighbor, _] : graph.graph[current]) {
            if(visited.find(neighbor) == visited.end()) {
                queue.push_back(neighbor);
                visited.insert(neighbor);
            }
        }
    }

    return result;
}

template <typename T>
std::vector<T> depthFirstSearch(Graph<T>& graph, std::shared_ptr<GraphNode<T>> start) {
    std::set<std::shared_ptr<GraphNode<T>>> visited;
    std::stack<std::shared_ptr<GraphNode<T>>> stack;
    std::vector<T> result;

    stack.push(start);

    while(!stack.empty()) {
        std::shared_ptr<GraphNode<T>> current = stack.top();
        stack.pop();

        if(visited.find(current) == visited.end()) {
            visited.insert(current);
            result.push_back(current->value);

            for(const auto& [neighbor, _] : graph.graph[current]) {
                if(visited.find(neighbor) == visited.end()) {
                    stack.push(neighbor);
                }
            }
        }
    }

    return result;
}

template <typename T>
std::map<std::shared_ptr<GraphNode<T>>, int> dijkstra(Graph<T>& graph, std::shared_ptr<GraphNode<T>> start) {
    std::map<std::shared_ptr<GraphNode<T>>, int> distances;

    auto compare = [](const std::pair<int, std::shared_ptr<GraphNode<T>>>& a,
                      const std::pair<int, std::shared_ptr<GraphNode<T>>>& b) {
        return a.first > b.first;
    };

    std::priority_queue<std::pair<int, std::shared_ptr<GraphNode<T>>>,
        std::vector<std::pair<int, std::shared_ptr<GraphNode<T>>>>,
        decltype(compare)> priority_queue(compare);

    for(const auto& pair : graph.graph) {
        distances[pair.first] = std::numeric_limits<int>::max();
    }
    distances[start] = 0;
    priority_queue.push({0, start});

    while(!priority_queue.empty()) {
        auto [curr_dist, curr_node] = priority_queue.top();
        priority_queue.pop();

        if(curr_dist > distances[curr_node]) { continue; }

        for(const auto& [neighbor, weight] : graph.graph[curr_node]) {
            if(weight != 0) {
                int new_distance = curr_dist + weight;
                if(new_distance < distances[neighbor]) {
                    distances[neighbor] = new_distance;
                    priority_queue.push({new_distance, neighbor});
                }
            }
        }
    }

    return distances;
}

template <typename T>
std::map<std::shared_ptr<GraphNode<T>>, int> bellmanFord(Graph<T>& graph, std::shared_ptr<GraphNode<T>> start) {
    std::map<std::shared_ptr<GraphNode<T>>, int> distances;
    for(const auto& pair : graph.graph) {
        distances[pair.first] = std::numeric_limits<int>::max();
    }
    distances[start] = 0;
    int numVertices = graph.graph.size();

    for(size_t i = 0; i < numVertices - 1; ++i) {
        for(const auto& [node, neighbors] : graph.graph) {
            for(const auto& [neighbor, weight] : neighbors) {
                if(distances[node] != std::numeric_limits<int>::max()
                    && distances[node] + weight < distances[neighbor]) {

                    distances[neighbor] = distances[node] + weight;
                }
            }
        }
    }

    for(const auto& [node, neighbors] : graph.graph) {
        for(const auto& [neighbor, weight] : neighbors) {
            if(distances[node] != std::numeric_limits<int>::max()
                && distances[node] + weight < distances[neighbor]) {

                throw std::runtime_error("Graph contains a negative weight cycle! "
                            "Bellman-Ford will not be accurate for this graph!");
            }
        }
    }

    return distances;
}

#endif // GRAPH_TRAVERSAL_HPP
