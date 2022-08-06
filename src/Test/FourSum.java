package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[]arr = {2,2,2,2,2};
        int target = 8;
        List<List<Integer>> ans = fourSum(arr,target);
        for(List<Integer> a: ans)
            System.out.println(a);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1 ;j<=nums.length;j++){
                int left = j+1;
                int right = n-1;
                while(left<right){
                    int sum = nums[i] + nums[j];
                    int remain = target-(nums[left]+nums[right]);
                    if(sum==remain){
                        if(!set.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right])))
                            ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }
                    else if(sum>remain){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;

    }
}
