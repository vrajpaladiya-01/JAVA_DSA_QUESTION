import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Connected_Component {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
            for(int i=0; i<graph.length; i++){
                if(!vis[i]){
                    BFSutil(graph, vis);
                }
            }
    }

    public static void BFSutil(ArrayList<Edge>[] graph, boolean vis[]){    //O(v + e)
        Queue<Integer> q = new LinkedList<>();
        q.add(0);    // source = 0;

        while (!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]){     //visit curr
                System.out.print(curr + " ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            DFSutil(graph, i, vis);
        }
    }
    public static void DFSutil(ArrayList<Edge>[] graph, int curr, boolean vis[]){     //O(V + E)
        //visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                DFSutil(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
