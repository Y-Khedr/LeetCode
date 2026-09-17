import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] suffix = new int[n];

        res[0] = 1;
        for(int i=1; i<n; i++)
            res[i] = res[i-1] * nums[i-1];
        
        //n-1 indicated the last position, therefore n-2 is needed to access the position before last
        suffix[n-1] = 1;
        for(int i = n-2; i>=0; i--)
            suffix[i] = suffix[i+1] * nums[i+1];

        for(int i=0; i<n; i++)
            res[i]*=suffix[i];
        
        
        return res;
    }
}