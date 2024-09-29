package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void cretaeGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 10));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static class pair implements Comparable<pair>{
        int node;
        int cost;

        public pair(int n, int c){
            this.node = n;
             this.cost = c;
        }
        @Override
        public int compareTo(pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void primsAlgo(ArrayList<Edge> graph[], int v){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[v];
        pq.add(new pair(0, 0));

        int mstcost = 0;

        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                mstcost = mstcost+curr.cost;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new pair(e.dest, e.weight));
                    }
                }
            }
        }
        System.out.println("minimum cost of mst:-" +mstcost);
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> grapg[] = new ArrayList[v];
        cretaeGraph(grapg);
        primsAlgo(grapg, v);
    }
}
