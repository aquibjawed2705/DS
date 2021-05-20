package graph;

import java.util.ArrayList;

public class GraphImpl {
    static void addElement(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int cap=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(cap);
        for (int i = 0; i < cap; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addElement(adj, 0, 1);
        addElement(adj, 0, 2);
        addElement(adj, 1, 2);
        addElement(adj, 1, 3);
        print(adj);

    }
}
