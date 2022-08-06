package Test;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        int ans = help(prices);
        System.out.println(ans);
    }

    private static int help(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i = 1;i<prices.length;i++){
            profit = Math.max(profit,prices[i]-min);
            // always keep track of the min price stock on the left of the current index and always update the profit
            if(min>prices[i]){
                min = prices[i];
            }

        }
        return profit;
    }
}
