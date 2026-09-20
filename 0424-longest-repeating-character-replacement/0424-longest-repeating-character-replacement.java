import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        int right = 0;
        int left = 0;
        int n = s.length();
        int maxLen = 0;
        int max_freq = 0;
        int[] count = new int[26];

        while(right < n){

            count[s.charAt(right) - 'A']++;
            max_freq = Math.max(max_freq, count[s.charAt(right) - 'A']);
            
            
            if((right-left+1) - max_freq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left + 1);
            right++;
    }
        return maxLen;

    }
}