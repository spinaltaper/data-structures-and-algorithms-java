package number_28_graph_traversal;

import java.util.ArrayList;

public class Edge {
    ArrayList<GraphNode> nodes = new ArrayList<>();
    int data;
    Edge(GraphNode node1, GraphNode node2, Integer value){
        if(value==null){
            value = 0;
        }
        nodes.add(node1);
        nodes.add(node2);
        this.data = value;
    }
}
