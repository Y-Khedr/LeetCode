import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq_map = new HashMap<>();
        int n = nums.length;

        for(int num: nums){
            freq_map.put(num, freq_map.getOrDefault(num, 0) + 1);
        }       

        List<Integer>[] bucket = new List[n + 1];

        for(int key: freq_map.keySet()){
            int frequency = freq_map.get(key);
        
            if(bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
        
            bucket[frequency].add(key);
        }

        int[] results = new int[k];
        int count = 0;
        for(int i = bucket.length - 1; i>=1; i--){
            if(bucket[i] != null)
                for(int num: bucket[i]){
                    results[count] = num;
                    count++;
                    if(count == k)
                        return results;
                }
        }
        return results;
    }
}