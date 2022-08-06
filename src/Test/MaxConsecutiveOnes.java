package Test;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[]arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int ans = helper(arr,k);
        System.out.println(ans);
    }

    private static int helper(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int max = 0;

        while(j<nums.length){
            if(k<0 && i<nums.length){
                if(nums[i]==0) k++;
                i++;
            }
            else{
                if(nums[j]==0) k--;
                max = Math.max(max,j-i+1);
                j++;

            }
        }
        return max;
    }
}
