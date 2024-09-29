package Graph;

import java.util.*;

public class Kosaraju {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void cretaeGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    public static void topsort(ArrayList<Edge> graph[], int curr, Stack<Integer> s, boolean vis[]){
         vis[curr] = true;
         for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topsort(graph, e.dest, s, vis);
            }
         }
         s.push(curr);
    }
    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr){
        vis[curr] = true;
        System.out.println(curr+" ");
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, vis, e.dest);
            }
        }
    }
    public static void KosarajuAlgo(ArrayList<Edge> graph[], int v){
        // step :- 1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(!vis[i]){
           topsort(graph, i, s, vis);
        }
      }
      // step:- 2
      ArrayList<Edge> transpose[] = new ArrayList[v];
      for(int i=0; i<v; i++){
        transpose[i] = new ArrayList<Edge>();
      }
      for(int i=0; i<v; i++){
        vis[i] = false;
        for(int j=0; j<graph[i].size(); j++){
            Edge e = graph[i].get(j);
            transpose[e.dest].add(new Edge(e.dest, e.src));
        }
      }
      // step :- 3
      while(!s.isEmpty()){
        int curr = s.pop();
        if(!vis[curr]){
            dfs(transpose, vis, curr);
            System.out.println();
        }
      }
    }
   
    public static void main(String[] args) {
        int v= 5;
        ArrayList<Edge> graph[] = new ArrayList[v];

        cretaeGraph(graph);
        KosarajuAlgo(graph, v);
    }
}
