import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums)
            set.add(num);
        int run = 0;
        for(int x:set){
            if(!set.contains(x-1)){
                int count = 1;
                while(set.contains(x + count))
                    count++;
            if(count > run)
                run = count;
            }

        }
        return run;
    }
}