package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static Graph.Implementation.buildIntegerGraph;

public class BipartiteGraph {
    // if we can color the graph with 2 color such that no neighbour have same color then it is bipartite graph

    // Obeservation

    // if the graph contains odd length cycle then it is not a bipartite graph
    // and if the graph doesn't contains the odd length cycle then it is bipartite graph
    // the graph with no cycle is also a bipartite graph

    // to check the graph is bipartite or not we can

    public static void main(String[] args) {
        boolean ans = checkBipartite();
        System.out.println(ans);

    }

    public static boolean checkBipartite(){
        ArrayList<Integer>[]graph = buildIntegerGraph();
        int n = graph.length;
        Integer[]color = new Integer[n+1];
        Arrays.fill(color,-1);
        for(int i = 1;i<n;i++){
            if(color[i]==-1){
//        if(!checkGraphIsBipartite(graph,color,i)) return false;
                if(!checkGraphIsBipartiteDFS(graph,color,i)) return false;
            }
        }
        return true;
    }

    // BFS approach
    private static boolean checkGraphIsBipartite(ArrayList<Integer>[] graph, Integer[] color, int vertex) {
        Queue<Integer>q = new LinkedList<>();
        q.add(vertex);
        color[vertex] = 0;

        while(!q.isEmpty()){
            Integer curr = q.poll();
            // visiting the neighbours
            for(Integer i :graph[curr]){
                // if the neighbour is not visited then paint it with oppsite color of the parent and add it in the queue
                if(color[i]==-1){
                    if(color[curr]==1) color[i]=0;
                    else color[i] = 1;
                    q.add(i);
                    // if it is already visited and it has same color as parent then return false cause this is not bipartite graph
                }else if(color[curr]==color[i]) return false;

            }
        }
        return true;
    }

    // DFS approach

    private static boolean checkGraphIsBipartiteDFS(ArrayList<Integer>[] graph, Integer[] color,int vertex){
        if(color[vertex]==-1) color[vertex]=0;
        for(Integer i:graph[vertex]){
            if(color[i]==-1){
                if(color[vertex]==0) color[i]=1;
                else color[i]=0;
                if(!checkGraphIsBipartiteDFS(graph,color,i)) return false;
            }else if(color[vertex]==color[i]) return false;
        }
        return true;
    }
}

