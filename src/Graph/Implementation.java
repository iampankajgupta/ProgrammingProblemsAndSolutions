package Graph;

//can be implemented Using
//1.Adjacency List --> it is implemented Using ArrayList<Integer>[]graph = new ArrayList<Edge>[];
//2.Adjacency Matrix --> If the more number of Nodes then it take more space


import java.util.ArrayList;

public class Implementation {
    public static ArrayList<Integer>[] buildIntegerGraph(){
        // arraylist of edges
        // this is Adjacency List Implementation
        ArrayList<Integer>[]graph = new ArrayList[9];
        for(int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[1].add(2);

        graph[2].add(1);
        graph[2].add(3);
        graph[2].add(8);

        graph[3].add(2);
        graph[3].add(4);

        graph[4].add(3);
        graph[4].add(5);

        graph[5].add(4);
        graph[5].add(6);
        graph[5].add(8);

        graph[6].add(5);
        graph[6].add(7);

        graph[7].add(6);

        graph[8].add(2);
        graph[8].add(5);
        return graph;
    }
}

