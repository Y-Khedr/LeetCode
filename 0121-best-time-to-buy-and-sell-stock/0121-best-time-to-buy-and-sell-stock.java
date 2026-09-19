import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int left = 0;
        int right = 1;
        int max = 0;
        int profit = 0;
        while(right < n){
            
            if(prices[left] < prices[right]){
                profit = prices[right] - prices[left];
                if(profit>max)
                    max = profit;                   
                right++;
            }
            else{
                left = right;
                right++;
            }

        }        
        return max;
    }

}