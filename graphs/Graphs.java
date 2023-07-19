package graphs;

import stacks.linear_search.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graphs {
    ArrayList<LinkedList<Nodes>> linkedNodes;

    public Graphs() {
        linkedNodes = new ArrayList<>();
    }

    public void addNode(Nodes node) {
        LinkedList<Nodes> currentList = new LinkedList<>();
        currentList.add(node);
        linkedNodes.add(currentList);
    }

    public void addEdge(int source, int destination) {
        LinkedList<Nodes> currentNode = linkedNodes.get(source);
        Nodes dstNode = linkedNodes.get(destination).get(0);
        currentNode.add(dstNode);
    }

    public boolean checkEdge(int source, int destination) {
        LinkedList<Nodes> currentNode = linkedNodes.get(source);
        Nodes dstNode = linkedNodes.get(destination).get(0);
        for (Nodes nodes : currentNode) {
            if (nodes == dstNode) return true;
        }
        return false;
    }



    public void prints() {
        for (LinkedList<Nodes> currentNode : linkedNodes) {
            for (Nodes node : currentNode) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
