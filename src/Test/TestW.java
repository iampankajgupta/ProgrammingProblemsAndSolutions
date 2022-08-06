package Test;

import java.util.HashMap;

public class TestW {
    public static void main(String[] args) {
        int[]arr = {1,1,4,2,3};
        int x = 5;
        int ans = minOperations(arr,5);
        System.out.println(ans);
    }

    public static int minOperations(int[] nums, int x) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        int sum1 = x;
        int sum2 = x;
        int sum3 = x;

        int n = nums.length-1;
        int i = 0;
        int j = n;

        while(i<j && (sum1!=0 && sum2!=0 && sum3!=0)){
                sum1-=nums[i];
                count1++;
                sum2-=nums[j];
                count2++;
                if(sum3-nums[i]==0) {
                    sum3-=nums[i];
                count3++;
                break;
            }
            else if(sum3-nums[j]==0) {
                sum3-=nums[j];
                count3++;
                break;
            }
            else {
                sum3-=nums[i];
                sum3-=nums[j];
                if(sum3==0) {
                    count3+=2;
                    break;
                }
                count3+=2;
            }
            i++;
            j--;
        }
        return Math.min(count1,Math.min(count2,count3));
    }
}
