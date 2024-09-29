package Graph;
import java.util.*;

import Arraylist.Arraylists;
public class Dfsconnectgf {
    static class Edge {
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
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        graph[4].add(new Edge(4, 3));
    }
public static void dfsconnectgf(ArrayList<Edge> graph[], int curr, boolean vis[]){
      System.out.print(curr+" ");
      vis[curr] = true;

      for(int i=0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);

        if(vis[e.dest]==false)
        dfsconnectgf(graph, e.dest, vis);
      }
    }
      // diconnected vertex in graph
 public static void dfsDisConnect(ArrayList<Edge> graph[],int curr, boolean vis[]){
        System.out.println(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(vis[e.dest]== false)
            dfsDisConnect(graph, e.dest, vis);
        }
    }
    
    public static void main(String[] args) {
        int v= 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        cretaeGraph(graph);

        boolean vis[] = new boolean[v];
        dfsconnectgf(graph, 0, vis);
        System.out.println();

        // for disconnected graph method
    
     /*    boolean vis[] = new boolean[v];
         for(int i=0; i<v; i++){
            if(vis[i]== false){
                dfsDisConnect(graph, i, vis);
            }
         }
        System.out.println();*/
    }
}
