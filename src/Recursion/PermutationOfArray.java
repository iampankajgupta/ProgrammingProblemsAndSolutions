package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        List<Integer>curr = new ArrayList<>();
        List<List<Integer>>ans = new ArrayList<>();
        helper(arr,ans,curr);
        for(List<Integer>a:ans){
            System.out.println(a);
        }
    }

    private static void helper(int[] nums, List<List<Integer>> ans, List<Integer> list) {
        if(list.size()>=nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0;i<nums.length;i++){

            if(nums[i]!=Integer.MAX_VALUE){
                int current = nums[i];
                list.add(nums[i]);
                nums[i] = Integer.MAX_VALUE;
                helper(nums, ans, list);
                list.remove(list.size() - 1);
                nums[i] = current;
            }
        }



    }
}
