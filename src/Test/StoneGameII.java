package Test;

import java.util.Arrays;

public class StoneGameII {
    public static void main(String[] args) {
        int[]piles = {1,2,3,7};
        int[]dp = new int[5*10000+5];
        Arrays.fill(dp,-1);
        int ans = helper(piles,true,0,dp);
        if(ans>0) System.out.println("Alice");
        else if(ans==0) System.out.println("Tie");
        else
            System.out.println("Bob");
    }


    public static int helper(int[]piles,boolean alice,int index,int[]dp){
        if(index>=piles.length) return 0;

        if(dp[index]!=-1) return dp[index];
        if(alice){
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            int first = piles[index]+helper(piles,false,index+1,dp);
            if(index+1<piles.length)
                second = piles[index]+piles[index+1]+helper(piles,false,index+2,dp);
            if(index+1<piles.length && index+2<piles.length)
                third = piles[index]+piles[index+1]+piles[index+2]+helper(piles,false,index+3,dp);
            dp[index] = Math.max(first,Math.max(second,third));
        }else{
            int second = 0;
            int third = 0;
            int first = -piles[index]+helper(piles,true,index+1,dp);
            if(index+1<piles.length)
                second = -(piles[index] + piles[index + 1]) + helper(piles, true, index + 2, dp);
            if(index+1<piles.length && index+2<piles.length)
                third = -(piles[index]+piles[index+1]+piles[index+2])+helper(piles,false,index+3,dp);
            dp[index] = Math.min(first,Math.min(second,third));
        }
        return dp[index];


    }
}
