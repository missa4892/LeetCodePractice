import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RoutesBetweenNodes {

    public static void main(String[] args){

        Graph graph = new Graph();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        a.setChildren(Arrays.asList(b, c));
        b.setChildren(Arrays.asList(a, c));
        c.setChildren(Collections.singletonList(d));
        d.setChildren(Collections.singletonList(b));
        graph.setNodes(Arrays.asList(a, b, c, d));

        System.out.println(hasRoute(graph, c, a));
    }

    private static boolean hasRoute(Graph graph, Node start, Node end) {
        if (start == end) {
            return true;
        }

        LinkedList<Node> queue = new LinkedList<>();

        List<Node> nodes = graph.getNodes();

        for (Node node: nodes) {
            node.setState(State.Unvisited);
        }

        start.state = State.Visited;
        queue.add(start);

        while(!queue.isEmpty()){
            Node current = queue.pop();

            List<Node> children = current.getChildren();
            if(children != null){
                for (Node node : children) {
                    if(node.getState() != State.Visited){
                        if(node == end){
                            return true;
                        }
                        node.setState(State.Visited);
                        queue.add(node);
                    }
                }
            }
        }

        return false;
    }

    static class Graph{
        private List<Node> nodes;

        public void setNodes(List<Node> nodes){
            this.nodes = nodes;
        }

        public List<Node> getNodes() {
            return nodes;
        }
    }

    static class Node{
        private String name;
        private List<Node> children;
        private State state;

        public Node(String name) {
            this.name = name;
        }

        public void setChildren(List<Node> children) {
            this.children = children;
        }

        public List<Node> getChildren() {
            return children;
        }

        public void setState(State state) {
            this.state = state;
        }

        public State getState() {
            return state;
        }
    }

    enum State { Unvisited, Visited };
}
