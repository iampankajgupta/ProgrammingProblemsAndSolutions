package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[]nums = {-1,0,1,2,-1,-4};
        List<List<Integer>>ans = helper(nums);
        for(List<Integer>a:ans){
            System.out.println(a);
        }
    }


    public static List<List<Integer>> helper(int[]nums){
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<n-2;i++){
            if(i==0 || ( i>0 && nums[i]!=nums[i-1])){
                int j = i+1;
                int k = n-1;
                while(j<k){
                    int sum = nums[j]+nums[k];
                    int rest = -nums[i];
                    if(sum==rest){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(j<k && nums[j]==nums[j+1]) j++;
                        while(j<k && nums[k]==nums[k-1]) k--;
                        j++;k--;
                    }else if(sum<rest){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
