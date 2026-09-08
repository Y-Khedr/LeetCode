class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int left = 0;
        int right = n-1;
        int max = 0;

        while(left<right){
            int curr = Math.min(height[left], height[right]) * (right-left);
            if(curr>max)
                max = curr;
            
            if(height[left]>height[right])
                right--;
            else
                left++;
        }
        return max;
    }
}