package graph;
import java.util.*;

import javax.management.Query;
import java.util.*;

public class Graph<T> {

    public Map<Node<T>, List<Node<T>>> nodeList = new HashMap<>();
    public Map<String, Integer> weightList = new HashMap<>();

    public Graph() {
    }

    public Node<T> addNode(T value) {
        Node<T> newNode = new Node<T>(value);
        nodeList.put(newNode, new ArrayList<>());
        return newNode;
    }

    public void addEdge(T value1, T value2, int weight) {
        Node<T> n1 = new Node<T>(value1);
        if (value1.equals(value2)) {
            nodeList.get(n1).add(n1);
            weightList.put(value1 + "->" + value1, 0);
        } else {
            Node<T> n2 = new Node<T>(value2);
            nodeList.get(n1).add(n2);
            nodeList.get(n2).add(n1);
            weightList.put(value1 + "->" + value2, weight);
            weightList.put(value2 + "->" + value1, weight);
        }
    }

    public Set<Node<T>> getNodes() {
        return nodeList.keySet();
    }

    public List<Node<T>> getNeighbors(T value) {
        return nodeList.get(new Node<T>(value));
    }

    public int size() {
        return nodeList.size();
    }

    public List<Node<T>> breadthFirst(T value) {
        Node<T> node = new Node(value);
        if (node.value == null) return null;
        List<Node<T>> nodes = new ArrayList<>();
        Queue<T> breadth = new Queue<T>();
        Set<Node<T>> visited = new HashSet<>();

        breadth.enqueue(node);
        visited.add(node);

        while (!breadth.isEmpty()) {
            Node<T> front = breadth.dequeue();
            nodes.add(front);
            for (Node<T> neighbor : getNeighbors(front.value)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    breadth.enqueue(neighbor);
                }
            }
        }
        return nodes;
    }

    public List<Node<T>> depthFirst(T value) {
        Node<T> node = new Node(value);
        if (node.value == null) return null;

        List<Node<T>> nodes = new ArrayList<>();
        Stack<T> depth = new Stack<T>();
        Set<Node<T>> visited = new HashSet<>();

        depth.push(node);

        while (!depth.isEmpty()) {
            Node<T> top = depth.pop();
            if (!visited.contains(top)) {
                visited.add(top);
                nodes.add(top);
                for (Node<T> neighbor : getNeighbors(top.value)) {
                    depth.push(neighbor);
                }
            }
        }
        return nodes;
    }

    public String businessTrip(T value, T[] arr) {
        int cost = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (getNeighbors(arr[i]).contains(new Node<>(arr[i + 1]))) {
                cost += weightList.get(arr[i] + "->" + arr[i + 1]);
            } else {
                return "False, $0";
            }
        }
        return true + ", $" + cost;
    }

    @Override
    public String toString() {
        if (nodeList.isEmpty()) return null;
        return "" + nodeList;
    }
}