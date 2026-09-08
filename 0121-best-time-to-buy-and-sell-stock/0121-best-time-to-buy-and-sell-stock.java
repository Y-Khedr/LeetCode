import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;

        int left = 0;
        int right = 1;
        while(right<n){
            int profit = prices[right] - prices[left];
            if(prices[left]<prices[right]){
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