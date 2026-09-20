class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int left = 0;
        int right = 1;
        int profit = 0;
        int max = 0;
        while(right<n){
            
            if(prices[right] > prices[left]){
                profit = prices[right] - prices[left];
                if(profit > max)
                    max = profit;
            }
            else
                left = right;
            right++;

        }
        return max;
    }
}
