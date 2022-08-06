package Test;

import java.util.HashMap;

public class LongestSubarrayWithZeroSum {
//    this whole is s if some is S then remaining part will be 0
////         s
//    <---------------->
////    s       0
//    <----->|<--------->--

    // TC O(N) SC O(N)
    public static void main(String[] args) {
        int[]arr = {1, 2, 3};
        int ans = helper(arr);
        System.out.println(ans);

    }


    private static int helper(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int prefixSum = arr[0];
        map.put(prefixSum,0);
        int maxSum = 0;
        if(prefixSum==0) maxSum = 1;
        for(int i = 1;i<arr.length;i++){
            prefixSum+=arr[i];
            if(map.containsKey(prefixSum)){
                maxSum = Math.max(maxSum,i-map.get(prefixSum));
            }else{
                map.put(prefixSum,i);
            }
        }
        return maxSum;
    }


}
