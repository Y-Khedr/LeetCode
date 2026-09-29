import java.util.*;

class Solution {
    public char repeatedCharacter(String s) {
        int[] count = new int[26];
        for(int i=0 ;i<s.length(); i++){
            if(count[s.charAt(i) - 'a'] > 0)
                return s.charAt(i);
            count[s.charAt(i) - 'a']++;
            
        }
        return 'c';
    }
}