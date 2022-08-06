package Test;

public class HousrRobber {
    public static void main(String[] args) {
        int[]arr = {2,7,9,3,1};
        int ans = rob(arr);
        System.out.println(ans);
    }

    public static int rob(int[] nums) {
        return helper(nums,-2,0);
    }


    public static int helper(int[]nums,int prev,int curr){
        if(curr>=nums.length) return 0;
        int take = 0;
        if(curr-prev!=1){
            take = nums[curr]+helper(nums,curr,curr+1);
        }
        int not = helper(nums,prev,curr+1);
        return Math.max(take,not);
    }
}
