package Graph;
import java.util.*;
public class Bfsconnecgf {
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
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
   }
   public static void bfs(ArrayList<Edge> graph[], int v){
    Queue<Integer> q = new LinkedList<>();
    boolean vis[] = new boolean[v];
    q.add(0);

    while(!q.isEmpty()){
        int curr = q.remove();
        if(vis[curr] == false){
            System.out.println(curr+ " ");
            vis[curr] = true;

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }
   }
   public static void main(String[] args) {
      int v = 4;
      /*  0       3
           \    /  \
            \  /     \
             2--------1
            */
      ArrayList<Edge> graph[] = new ArrayList[v];
      cretaeGraph(graph);
      bfs(graph, v);
   }
}
