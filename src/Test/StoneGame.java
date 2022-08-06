package Test;

import java.util.Arrays;

public class StoneGame {
    static int max = 0;
    static int max2 = 0;
    public static void main(String[] args) {
        int[][]dp = new int[505][505];
        int[]piles = {};
        for(int i =0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        helper(piles,true,0,piles.length-1,dp);
    }


    // alice  tries to maximise his score and bob tries to minimise the alice store
    // toh bob aisa number lega joh jada se jda small krerga alice ka score
    // usliye  line number 29 p Math.min liya hai  mtlb joh number jda minisize krega alice ka score voh lenge

    public static int  helper(int[]piles,boolean alice,int left,int right,int[][]dp){
        if(left>right) return 0;
        if(dp[left][right]!=-1) return dp[left][right];

        if(alice){
            dp[left][right] = Math.max(piles[left]+helper(piles,false,left+1,right,dp),piles[right]+helper(piles,false,left,right-1,dp));
        }else{
            dp[left][right] = Math.min(-piles[left]+helper(piles,true,left+1,right,dp),-piles[right]+helper(piles,true,left,right-1,dp));
        }
        return dp[left][right];

    }
}
