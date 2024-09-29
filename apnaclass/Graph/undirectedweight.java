package Graph;

import java.util.ArrayList;

public class undirectedweight {
    static class Edge {
        int src;  // source
        int dest; // destination
        int wt; // weight
        
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void cretaeGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2,2));
        graph[1].add(new Edge(1, 2,3));
        graph[1].add(new Edge(1, 3,4));
        graph[2].add(new Edge(2, 0,5));
        graph[2].add(new Edge(2, 1,6));
        graph[2].add(new Edge(2, 3,7));
        graph[3].add(new Edge(3, 1,8));
        graph[3].add(new Edge(3, 2,9));
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        cretaeGraph(graph);

        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.src+" "+e.dest+" "+e.wt+" ");
        }
    }
}
