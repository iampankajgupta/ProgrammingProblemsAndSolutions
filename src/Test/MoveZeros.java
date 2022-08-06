package Test;

public class MoveZeros {
    public static void main(String[] args) {
        int[]arr = {1,2,3,0,4,0};
        helper2(arr);
    }

    private static void helper2(int[] nums) {
        // Naive Approach O(
        while(true){
            int i = 0;
            boolean found = false;
            int currrent = i;
            while(currrent+1<nums.length){
                if(nums[currrent]==0 && nums[currrent+1]!=0){
                    found=true;
                    int temp = nums[currrent];
                    nums[currrent] = nums[currrent+1];
                    nums[currrent+1] = temp;
                }
                currrent++;
            }
            if(!found) break;
        }

        // Optimise Approach O(N)

        ///
//        int temp = Integer.MIN_VALUE;
//        int s = 0;
//        int f = 1;
//        if (nums.length == 2) {
//            if (nums[s]==0 && nums[f]!=0){
//                temp = nums[s];
//                nums[s] = nums[f];
//                nums[f] = temp;
//            }
//
//        }
//        if (nums.length > 2) {
//            while (f < nums.length) {
//                temp = Integer.MIN_VALUE;
//                if ((nums[s] == 0 && nums[f] != 0)) {
//                    temp = nums[s];
//                    nums[s] = nums[f];
//                    nums[f] = temp;
//                    s++;
//                    f++;
//                } else if (nums[s] == 0 && nums[f] == 0) {
//                    f++;
//                }else{
//                    s++;f++;
//                }
//            }
//        }
    }
}
