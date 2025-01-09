import java.util.*;
import java.util.LinkedList;
public class bfs{
static class edge{
    int src;
    int des;
    int weig;
    public edge(int src,int des, int weig){
        this.src=src;
        this.des=des;
        this.weig=weig;
    }
}

    
static void creategraph(ArrayList<edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
    graph[0].add(new edge(0,1,1));
    graph[0].add(new edge(0, 2, 2));
    graph[1].add(new edge(1, 0, 1));
    graph[1].add(new edge(1, 3, 1));
    graph[2].add(new edge(2, 0, 1));
    graph[2].add(new edge(2, 4, 1));
    graph[3].add(new edge(3, 4, 1));
    graph[4].add(new edge(4, 3, 1));
    graph[4].add(new edge(4, 5, 1));
    graph[3].add(new edge(3, 5, 1));
    graph[5].add(new edge(5, 3, 1));
    graph[5].add(new edge(5, 4, 1));
    graph[5].add(new edge(5, 6, 1));
    graph[6].add(new edge(6, 5, 1));
} 
static void BFS(ArrayList<edge> graph[],int j,boolean isVisted[]){
    Queue<Integer> q = new LinkedList<>();
    q.add(j);
    while(!q.isEmpty()){
        int curr = q.poll();
        
        if(!isVisted[curr]){
            System.out.print(curr+" ");
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                q.add(e.des);
            }
            isVisted[curr]=true;
        }
    }
}
static void disconnectedGraph(ArrayList<edge> graph[]){
    
    boolean isVisted[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
        if(!isVisted[i]){
            BFS(graph,i,isVisted);
        }
    }
}
public static void main(String[] args) {
     /*
   1 --- 3
 /       | \
 0       |   5 -- 6
 \       | /
  2 ---- 4
 */
    int s = 7;
    ArrayList<edge> graph[]=new ArrayList[s];
    creategraph(graph);
    disconnectedGraph(graph);
}
}
