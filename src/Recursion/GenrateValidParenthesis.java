package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenrateValidParenthesis {
    public static void main(String[] args) {

        // Brute Force
        // Geneate all the Parenthesis and for each 2^N parenthesis check each whether it is valid or not

        List<String>ans  = new ArrayList<>();
        int n = 2;
        StringBuilder builder = new StringBuilder("(");
//        helper(n,ans,builder,1,0);
        helper2(n,ans,"(",1,0);
        for(String s:ans){
            System.out.println(s);
        }
    }

    // backtracking Using StringBuilder TC O(2^N)
    private static void helper(int n, List<String> ans, StringBuilder builder, int open, int close) {
        if(open==n && close==n){
            ans.add(builder.toString());
        }
        if(open<n){
            helper(n,ans,builder.append("("),open+1,close);
            builder.deleteCharAt(builder.length()-1);
        }

        if(close<open){
            helper(n,ans,builder.append(")"),open,close+1);
            builder.deleteCharAt(builder.length()-1);
        }
    }

    // Using String TC-> O(2^N) Without backtracking
    private static void helper2(int n, List<String> ans, String s, int open, int close) {
        if(open>n) return;
        if(close>open) return ;
        if(open==n && close==n){
            ans.add(s);
        }
        helper2(n,ans,s+"(",open+1,close);
        helper2(n,ans,s+")",open,close+1);
    }
}
