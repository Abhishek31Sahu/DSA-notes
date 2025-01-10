import java.util.*;
public class DFS{
    static class Edge{
        int src;
        int des;
        int wei;
        public Edge(int src,int des,int wei){
            this.src = src;
            this.des=des;
            this.wei = wei;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
        
    }

    static void dfs(ArrayList<Edge> graph[],int src,boolean isVisted[]){
        // Stack<Integer> st=new Stack<>();
        if(!isVisted[src]){
            System.out.print(src+" ");
            isVisted[src]=true;
            for(int i=0;i<graph[src].size();i++){
                Edge e = graph[src].get(i);
                dfs(graph, e.des, isVisted);
            }
        }
    }
    static void disconnectedGraph(ArrayList<Edge> graph[]){
        int v=graph.length;
        boolean isVisted[] =new boolean[v];
        for (int i = 0; i < v; i++) {
            if(!isVisted[i]){
                dfs(graph,i,isVisted);
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        disconnectedGraph(graph);
    }
}