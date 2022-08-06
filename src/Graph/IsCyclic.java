package Graph;

import java.util.*;

import static Graph.BuildGraph.buildGraph;

public class IsCyclic {
    static class Pair{
        int vertex;
        int parent;

        public Pair(int vertex, int parent) {
            this.vertex = vertex;
            this.parent = parent;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer>[]graph = buildGraph();
        int n = graph.length;
        boolean[]visited = new boolean[n+1];
        boolean isCycle = checkCycle(graph,n,visited);
        System.out.println(isCycle);

    }

    public static boolean checkCycle(ArrayList<Integer>[]graph,int n ,boolean[]visited){
        for(int i=0;i<n;i++){
            if(!visited[i]){
//                if(isCyclic(graph,i,visited)) return true;
                dfsTraversal(graph,i,-1,visited);
            }
        }
        return false;
    }

    // Using BFS traversal Algorithm
    private static boolean isCyclic(ArrayList<Integer>[] graph, int vertex,boolean[] visited) {
        // Storing a Pair in queue to keep track of the vertex and its parent
        Queue<Pair>q = new LinkedList<>();
        // for the first element there will be not parent i.e why -1
        q.add(new Pair(vertex,-1));
        visited[vertex] = true;
        while(!q.isEmpty()){
            Pair p = q.poll();
            for(Integer i : graph[p.vertex]){
                // if the neighbour is not already visited then add it in the queue as Pair as neighbour, currentVertex as parent
                if(!visited[i]){
                    q.add(new Pair(i,p.vertex));
                    visited[i] =  true;
                }else if(i!=p.parent) return true; // if the current vertex neighbour is already visited and its parent is not as current element it means graph contains cycle
            }
        }
        return false;
    }

    // Using DFS traversal Algorithm
    public static boolean dfsTraversal(ArrayList<Integer>[] graph, int vertex,int prev,boolean[] visited){
        for(Integer i : graph[vertex]){
            if(!visited[i]){
                visited[i] = true;
                dfsTraversal(graph,i,vertex,visited);
            }else if(i!=prev){
                return true;
            }
        }
        return false;
    }

}
