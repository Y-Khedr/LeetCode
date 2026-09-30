class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if(n < 2)
            return 0;
        
        int count = 0;
        int start = nums[0];
        
        for(int i=1; i<n; i++){
            if(start >= nums[i]){
                count+= (start-nums[i]) + 1;
                start += 1;
            }
            else
                start = nums[i];
        }
        return count;
    }
}