package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BuildGraph {

    public static  ArrayList<Integer>[] buildGraph(){
        ArrayList<Integer>[]graph = new ArrayList[4];
        int n = graph.length;
        for(int i = 0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
//        graph[0].add(3);
        graph[1].add(0);
        graph[1].add(2);
        graph[2].add(1);
        graph[2].add(3);
        graph[3].add(2);
//        graph[3].add(0);
        return graph;
    }
}
