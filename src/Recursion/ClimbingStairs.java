package Recursion;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n  = 2;
        int ans = helper(n);
        System.out.println(ans);
    }

    private static int helper(int n) {
        if(n<0) return 0;
        if(n==0) return 1;
        return helper(n-1)+helper(n-2);
    }
}
