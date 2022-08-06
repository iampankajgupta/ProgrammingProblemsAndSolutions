package Test;

import java.util.HashSet;

// Using HashSet
// first put all the element in the hashset
//
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[]arr = {100,4,200,1,3,2};
        int ans  = helper(arr);
        System.out.println(ans);
    }

    private static int helper(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int i :nums) set.add(i);
        int max = 0;
        // for every element check if element - 1 exists in the hashset if exists then we will not start the increment preocess with the element
        // else we start the increment process by adding 1 to it and also update out count

        for(int i:set){
            int count=0;
            // less 1 element already exist in the hashset if not then start incre process until + 1 element exists else break and count the max
            if(!set.contains(i-1)){
                int current = i;
                count++;
                while(true){
                    if(set.contains(current+1)){
                        count++;
                        current++;
                    }else break;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
