import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] unique = new int[128];
        if(s.length() == 0)
            return 0;
        
        int max = 0;
        int left = 0;
        int right = 0;
        int n = s.length();
        while(right < n){    
            unique[s.charAt(right)]++;

            while(unique[s.charAt(right)] > 1){
                unique[s.charAt(left)]--;
                left++;
            }
            max = Math.max(max, right-left +1);
            right++;
        }
        return max;
    }
}