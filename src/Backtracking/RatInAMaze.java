package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][]mat = {  {1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}
        };
        int n = mat.length;

        ArrayList<String>ans = new ArrayList<>();
        boolean[][]visited = new boolean[n][n];
        helper(mat,n,ans,"",0,0,visited);
        for(String s:ans){
            System.out.println(s);
        }
    }

    private static void helper(int[][] m, int n, ArrayList<String>ans,String curr, int i, int j,boolean[][]visited) {
        if(i<0 || j<0 ||  i>=n || j>=n || visited[i][j] || m[i][j]==0 ){
            return;
        }
        if(i==n-1 && j==n-1){
            ans.add(curr);
            return;
        }
        visited[i][j]=true;
        helper(m,n,ans,curr+"D",i+1,j,visited);
        helper(m,n,ans,curr+"R",i,j+1,visited);
        helper(m,n,ans,curr+"U",i-1,j,visited);
        helper(m,n,ans,curr+"L",i,j-1,visited);
        visited[i][j] = false;
        return;



    }
}
