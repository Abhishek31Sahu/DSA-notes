import java.util.*;
public class Allpath{
    static class Edge{
        int src;
        int des;
        int weig;
        public Edge(int src, int des, int weig){
            this.src=src;
            this.des=des;
            this.weig=weig;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
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
        graph[6].add(new Edge(6, 7, 1));
        graph[7].add(new Edge(7, 6, 1));
        graph[7].add(new Edge(7, 8, 1));
        graph[8].add(new Edge(8, 6, 1));
        graph[8].add(new Edge(8, 7, 1));
        graph[6].add(new Edge(6, 8, 1));
    }
    static int  printAllPaths(ArrayList<Edge> graph[],int ptr,String path,int src,boolean isVisited[] ){
        if(ptr==src){
            System.out.println(path);
            return 1;
        }
        int x=0;
        if(!isVisited[src]){
            isVisited[src]=true;
            for(int i=0;i<graph[src].size();i++){
                Edge e= graph[src].get(i);
                x=printAllPaths(graph, ptr,path+"-->"+e.des ,e.des, isVisited);
                
            }
            isVisited[src]=false;
            return x;
        }
    return 0;
    }

    static void disconnectedGraph(ArrayList<Edge> graph[],int ptr){
        int v =graph.length;
        String path="";
        boolean isVisited[] = new boolean[v];
        for (int i = 0; i < ptr; i++) {
            if(!isVisited[i])
                if(printAllPaths(graph,ptr,path+i,i,isVisited)==1){
                    break;
                }
        }
    }
    public static void main(String[] args) {
        int v = 9;
        int ptr = 8;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        disconnectedGraph(graph,ptr);
    }
}