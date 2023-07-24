package graph;

import java.util.*;

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

    static void bfs(ArrayList<ArrayList<Integer>> adj, int source, boolean visited[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            Integer u = queue.poll();
            System.out.print(u + " ");
            for (Integer v : adj.get(u)) {
                if (visited[v] != true) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }

    static void printBfs(ArrayList<ArrayList<Integer>> adj, int source) {
        boolean visited[] = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] != true)

                bfs(adj, i, visited);
        }
    }

    static int findIsland(ArrayList<ArrayList<Integer>> adj, int source) {
        boolean visited[] = new boolean[adj.size()];
        int count = 0;
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] != true) {
                count++;
                bfs(adj, i, visited);
            }
        }
        return count;
    }


    static void dfs(ArrayList<ArrayList<Integer>> adj, int source) {
        boolean visited[] = new boolean[adj.size()];
        /*for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                dfsRecursive(adj, i, visited);
            }
        }*/
        dfsRecursive(adj, source, visited);


    }

    static void dfsRecursive(ArrayList<ArrayList<Integer>> adj, int source, boolean visited[]) {
        visited[source] = true;
        System.out.print(source + " ");
        for (int v : adj.get(source)) {
            if (!visited[v]) {
                dfsRecursive(adj, v, visited);
            }
        }
    }

    static int[] shortestDistance(ArrayList<ArrayList<Integer>> adj,int source)
    {
        boolean visited[]=new boolean[adj.size()];
        int distance[]=new int[adj.size()];
        Arrays.fill(distance,Integer.MAX_VALUE);

        distance[source]=0;

        Queue<Integer> queue=new LinkedList<>();
        queue.add(source);
        visited[source]=true;
        while (!queue.isEmpty()) {
            int u=queue.poll();
            for (int v : adj.get(u)) {
                if(!visited[v])
                {
                    distance[v]=distance[u]+1;
                    queue.add(v);
                    visited[v]=true;
                }

            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int cap = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(cap);
        for (int i = 0; i < cap; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addElement(adj, 0, 1);
        addElement(adj, 0, 2);
        addElement(adj, 1, 3);
        addElement(adj, 3, 2);
        addElement(adj, 4, 3);
        // print(adj);
        printBfs(adj, 0);
        System.out.println("\nIsland-" + findIsland(adj, 0));

        dfs(adj, 0);

        int distance[]=shortestDistance(adj,0);
        System.out.println();
        Arrays.stream(distance).forEach(System.out::print);
    }
}
