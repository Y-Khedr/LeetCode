import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            int miss = target - nums[i];
            if(map.containsKey(miss))
                return new int[]{map.get(miss), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}