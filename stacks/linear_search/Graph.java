package stacks.linear_search;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int[][] matrix;
    ArrayList<Node> nodes;

    public Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
    }

    public boolean checkEdge(int source, int destination) {
        return matrix[source][destination] == 1;
    }

    public void print() {
        System.out.println(Arrays.deepToString(matrix));
    }

    public void prints() {
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public  void depthFirstSearch(int source){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(source, visited);
    }

    private void dFSHelper(int source, boolean[] visited) {
        if (visited[source]){
             return;
        }
        else {
            visited[source] = true;
            System.out.println(nodes.get(source).data +" is visited");
        }
        for (int i = 0; i < matrix[source].length; i++) {
            if (matrix[source][i] == 1){
                dFSHelper(i,visited);
            }
        }
        return;
    }

    public  void breathFirstSearch(int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;
        while (queue.size() != 0){
         src = queue.poll();
         System.out.println(nodes.get(src).data +" is visited");
            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
