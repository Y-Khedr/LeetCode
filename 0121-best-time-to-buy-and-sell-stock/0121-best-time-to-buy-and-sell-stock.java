import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, max = 0, profit = 0;

        while(right < prices.length){
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