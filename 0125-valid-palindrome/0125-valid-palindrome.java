import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) || Character.isLetter(c))
                res.append(c);
        }
        int n = res.length();
        for(int i=0; i<n; i++)
            if(res.charAt(i) != res.charAt(n-1 -i))
                return false;
        return true;
    }
}