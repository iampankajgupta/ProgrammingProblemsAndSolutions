package Test;

public class SortColors {
    public static void main(String[] args) {
        int[]arr = {1,2,0};
        helper(arr);
        for(int i :arr) System.out.print(i+" ");
    }

    private static void helper(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int k = 0;
        boolean swap = false;

        while(k<=j){
            if(nums[k]==0){
                swap(nums,i,k);
                i++;k++;
            }else if(nums[k]==1){
                k++;
            }else{
                swap(nums,k,j);
                j--;

            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
