import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder word = new StringBuilder();
        s = s.toLowerCase();

        int n = s.length();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
                word.append(c);
        }
        n = word.length();
        for(int i=0; i<n; i++){
            if(word.charAt(i) != word.charAt(n-i-1))
                return false;
        }
        return true;
    }
}