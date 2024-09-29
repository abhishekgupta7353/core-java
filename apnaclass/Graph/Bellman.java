package Graph;

import java.util.ArrayList;

public class Bellman {
    static class Edge{
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight){
            this.src = src;
            this.dest= dest;
            this.weight = weight;
        }
    }
    public static void cretaeGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src, int v){
        int dest[] = new int[v]; 
        for(int i=0; i<v; i++){
            if(i != src){
                dest[i] = Integer.MAX_VALUE;
            }
        }
        for(int  k=0; k<v-1; k++){
            for(int i=0; i<v; i++){
                for(int j=0; j<graph[i].size(); j++){
                    Edge e = graph[i].get(i);
                    int u = e.src;
                    int V = e.dest;

                    if(dest[u] != Integer.MAX_VALUE && dest[u]+e.weight<dest[v]){
                        dest[V] = dest[u]+e.weight;
                    }
                }
            }
        }
        for(int i=0; i<dest.length; i++){
            System.out.print(dest[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V= 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        cretaeGraph(graph);
        bellmanFord(graph, 0, V);
    }
}
