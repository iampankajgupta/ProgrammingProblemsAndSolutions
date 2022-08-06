package Recursion;

import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        List<List<Integer>>ans = helper(arr);
        for(List<Integer>a:ans){
            System.out.print(a);
        }
    }

    //Time Complexity - O(N*2^N)
    // Space Complexity - O(N*2^N)
    public static  List<List<Integer>> helper(int[]nums){
        List<List<Integer>>ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int number:nums){ // O(N) SINCE THERE ARE N NUMBER
            int n = ans.size();
            for(int j = 0;j<n;j++){ // AT MAX THERE WILL BE 2^N NUMBER
                List<Integer>temp = new ArrayList(ans.get(j));
                temp.add(number);
                ans.add(temp);
            }
        }
        return ans;
    }
}


