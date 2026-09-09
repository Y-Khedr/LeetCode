import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, right = 0, max_freq = 0, max_len = 0, n = s.length();

        while(right<n){
            count[s.charAt(right) - 'A']++;
            max_freq = Math.max(max_freq, count[s.charAt(right) - 'A']);

            while(right - left + 1 - max_freq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            max_len = Math.max(max_len, right - left + 1);
            right++;
        }
        return max_len;
    }
}