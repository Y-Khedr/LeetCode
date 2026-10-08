import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, profit = 0;
        int max = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                profit = prices[right] - prices[left];
                if(profit > max) max = profit;
            }
            else
                left = right;
            
            right++;
        }
        return max;
    }
}